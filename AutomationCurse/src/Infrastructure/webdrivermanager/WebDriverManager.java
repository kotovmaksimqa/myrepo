package Infrastructure.webdrivermanager;

import Infrastructure.config.ConfigurationManager;
import Infrastructure.webdrivermanager.factory.*;

public class WebDriverManager {

    public String getAvailableWebDriver() {

        RunOn runOn = RunOn.valueOf(ConfigurationManager.getInstance().getRunOn());
        WebDriverFactory factory;

        switch (runOn) {
            case LOCAL:
                factory = new LocalWebDriverFactory();
                break;
            case CLOUD:
                factory = new BuildSrvWebDriverFactory();
                break;
            case FACTORY:
                factory = new CloudWebDriverFactory();
                break;
                default:
                    throw new RuntimeException("No such env");
        }
        return factory.create();
    }

    public void destroy(String browser) {
        System.out.println(browser + " was closed");
    }

}
