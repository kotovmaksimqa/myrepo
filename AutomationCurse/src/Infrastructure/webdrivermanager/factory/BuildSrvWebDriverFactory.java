package Infrastructure.webdrivermanager.factory;

import Infrastructure.config.ConfigurationManager;

public class BuildSrvWebDriverFactory implements WebDriverFactory {
    @Override
    public String create() {
        TestBrowser browser = TestBrowser.valueOf(ConfigurationManager.getInstance().getTestBrowser());
        switch (browser) {
            case CHROME:
                return "BUILD SERVER Google Chrome";
            case FIREFOX:
                return "BUILD SERVER Mozilla Firefox";
            case SAFARI:
                return "BUILD SERVER Apple Safari";
            case IE:
                return "BUILD SERVER MS Internet Explorer";
            default:
                return "Invalid";
        }
    }
}
