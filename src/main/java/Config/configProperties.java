/*
# set & get environment/globals variables
*/

package Config;

import java.util.ArrayList;

public class configProperties {
    public static ApplicationConfigReader appConfig = new ApplicationConfigReader();

    public static String Environment = appConfig.getEnvironment();
    public static String baseUrl = appConfig.getBaseUrl();
    public static String username = appConfig.getUserName();
    public static String password = appConfig.getPassword();
    public static String Port = appConfig.getPort();
    public static String IsEnableReporting = appConfig.getIsEnableReporting();
    public static String dbUrl = appConfig.getDbUrl();
    public static String dbUsername = appConfig.getDbUsername();
    public static String dbPassword = appConfig.getDbPassword();
    public static String grantType = appConfig.getGrantType();
    public static String clientId = appConfig.getClientId();
    public static ArrayList lookupNames = appConfig.getLookupNames();
    public static String coreBaseUrl = appConfig.getCoreBaseUrl();
    public static String fpsBaseUrl = appConfig.getFpsBaseUrl();
    public static String filePath = appConfig.getFilePath();
    public static String initialCountryId = appConfig.getInitialCountryId();
    public static String initialCustomerId = appConfig.getInitialCustomerId();
    public static String initialSiteId = appConfig.getInitialSiteId();
    public static String initialFieldLocationId = appConfig.getInitialFieldLocationId();
}
