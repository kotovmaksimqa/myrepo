package Infrastructure.webdrivermanager.factory;

import Infrastructure.config.ConfigurationManager;

public class LocalWebDriverFactory implements WebDriverFactory {
    @Override
    public String create() {

            TestBrowser browser = TestBrowser.valueOf(ConfigurationManager.getInstance().getTestBrowser());

            switch (browser) {
                case CHROME:
                    return "LOCAL Google Chrome";
                case FIREFOX:
                    return "LOCAL Mozilla Firefox";
                case SAFARI:
                    return "LOCAL Apple Safari";
                case IE:
                    return "LOCAL MS Internet Explorer";
                default:
                    return "Invalid";
            }
    }
}
