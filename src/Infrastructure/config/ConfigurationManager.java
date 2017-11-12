package Infrastructure.config;

public class ConfigurationManager {

    private static ConfigurationManager instance;

    private ConfigurationManager() {
    }

    public static ConfigurationManager getInstance() {
        if (instance == null)
            instance = new ConfigurationManager();
        return instance;
    }

    public String getTestBrowser() {
        return getEnvironmentVariableOrDefault("testBrowser", "CHROME");
    }


    public String getRunOn() {
        return getEnvironmentVariableOrDefault("runOn", "LOCAL");
    }

    public String getTestEnv() {
        return getEnvironmentVariableOrDefault("testEnv", "LOCAL");
    }

    public String getMobilePlatform() {
        return getEnvironmentVariableOrDefault("mobilePlatform", "IOS");
    }

    private static String getEnvironmentVariableOrDefault(String envVar, String defaultValue) {
        return System.getenv(envVar) != null ? System.getenv(envVar) : defaultValue;
    }



}
