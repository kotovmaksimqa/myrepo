package Infrastructure.webdrivermanager.factory;

import Infrastructure.config.ConfigurationManager;

public class CloudWebDriverFactory implements WebDriverFactory {
    @Override
    public String create() {
        TestBrowser browser = TestBrowser.valueOf(ConfigurationManager.getInstance().getTestBrowser());
            switch (browser) {
                case CHROME:
                    return " CLOUD Google Chrome";
                case FIREFOX:
                    return "CLOUD Mozilla Firefox";
                case SAFARI:
                    return "CLOUD Apple Safari";
                case IE:
                    return "CLOUD MS Internet Explorer";
                default:
                    return "Invalid";
            }
    }
}
