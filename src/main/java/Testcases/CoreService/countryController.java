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

public class countryController extends baseTest {

    @Test
    public void Country_List() {
        reusableFunctions.givenHeaders(reusableFunctions.headers("Authorization", envGlobals.authorizationToken));
        reusableFunctions.whenFunction("get", configProperties.coreBaseUrl + "/api/v1/country/list");
        reusableFunctions.thenFunction(200);
    }

    @Test
    public void Verify_Country_List_Length() throws SQLException {
        Country_List();
        Assert.assertTrue(reusableFunctions.getResponseLength() > 0);


    }
//
//    @Test
//    public void Country_List_Verify_Columns() throws SQLException, JsonException {
//        Country_List();
//        JSONAssert.assertEquals(dbConn.verifyDBColumns("SELECT id, name FROM country"), reusableFunctions
//                .getResponseJson
//                        ("id", "name"), true);
//    }

}