package Infrastructure.base;

import Infrastructure.logger.StdTestLogger;
import Infrastructure.logger.TestLogger;
import Infrastructure.utils.TestServer;
import Infrastructure.webdrivermanager.WebDriverManager;

public class TestBase {
    protected TestLogger logger;
    protected WebDriverManager wdm;
    protected String browser;

    // Before
    public void setUp(){
        logger = new StdTestLogger();
        wdm = new WebDriverManager();
        browser = wdm.getAvailableWebDriver();
        String url = new TestServer().getTestServer();

        logger.log("Open Website " + url);

        beforeTest();
    }
    // After

    public void cleanUp() {
        afterTest();
        logger.log("Close browser");
        wdm.destroy(browser);

    }
    protected void beforeTest(){}
    protected void afterTest(){}

}
