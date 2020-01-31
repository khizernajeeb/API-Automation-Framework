package Testcases.CoreService;

import Config.configProperties;
import Config.envGlobals;
import Config.reusableFunctions;
import General.baseTest;
import dbConnection.dbConn;
import groovy.json.JsonException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.sql.SQLException;

public class customerController extends baseTest {


    @Test
    public void Customer_List() {
        reusableFunctions.givenHeaders(reusableFunctions.headers("Authorization", envGlobals.authorizationToken));
        reusableFunctions.whenFunction("get", configProperties.coreBaseUrl + "/api/v1/customer/list");
        reusableFunctions.thenFunction(200);
    }

    @Test
    public void Verify_Customer_List_Length() {
        Customer_List();
        Assert.assertTrue(reusableFunctions.getResponseLength() > 0 );
    }
//
//    @Test
//    public void Customer_List_Verify_Columns() throws SQLException, JsonException {
//        Customer_List();
//        JSONAssert.assertEquals(dbConn.verifyDBColumns("SELECT id, name FROM customer"), reusableFunctions
//                .getResponseJson
//                        ("id", "name"), true);
//    }

}