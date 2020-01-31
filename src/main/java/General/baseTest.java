/*
# Base class - Defined TestNG annotations
# Execute before every test case
 */

package General;

import Config.reusableFunctions;
import Testcases.CoreService.authentication;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import dbConnection.dbConn;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;

import static Config.configProperties.IsEnableReporting;
import static Config.configProperties.coreBaseUrl;

public class baseTest {

    private static ExtentTest logger;
    public static RequestSpecification REQUEST;

    @BeforeSuite()
    public void startReport() {

        if (IsEnableReporting.equals("true")) {
            MainCall.startReport();
        }

        // connect db connection
        //dbConn.dbConnection();
    }

    @BeforeMethod()
    public void beforeTest(Method method) {
        if (IsEnableReporting.equals("true")) {
            logger = MainCall.getExtentReport().startTest(method.getName(), "");
            logger.setStartedTime(getTime());
        }

        // To set Base url & content type
        MainCall.restAssuredPreReq();

        // Enable below line to execute authorization token before every test case
        authentication.Authorization();

    }

    @AfterMethod()
    public void QuitDriver(ITestResult result) {

        if (IsEnableReporting.equals("true")) {

            if (result.getStatus() == ITestResult.FAILURE) {
                logger.log(LogStatus.FAIL, "Test Case Failed reason is: " + result.getThrowable());
//                logger.log(LogStatus.FAIL, logger.addScreenCapture(Screenshots.takeScreenshot(result.getMethod()
//                        .getMethodName())));
            } else if (result.getStatus() == ITestResult.SKIP) {
                logger.log(LogStatus.SKIP, "Test Case Skipped is: " + result.getName());
            } else if (result.getStatus() == ITestResult.SUCCESS) {
                logger.log(LogStatus.PASS, result.getMethod().getMethodName() + " is Passed");
                logger.log(LogStatus.PASS, reusableFunctions.getResponse());
            }

            logger.setEndedTime(getTime());
            MainCall.getExtentReport().endTest(logger);

            // Enable below line to print response of every API
            System.out.println("method name: " + result.getMethod().getMethodName());
            Config.reusableFunctions.printResponse();
        }
    }

    private Date getTime() {
        Calendar calendar = Calendar.getInstance();
        return calendar.getTime();
    }

    @AfterSuite()
    public void endReport() throws InterruptedException {
        Thread.sleep(5000);
        //WebDriverFactory.finishDriver();
        if (IsEnableReporting.equals("true")) {
            MainCall.getExtentReport().flush();
            MainCall.getExtentReport().close();
        }
    }

}
