package Infrastructure.base;

public class AuthTestBase extends TestBase {

    @Override
    protected void beforeTest() {
        logger.log("Open login page");
    }

    @Override
    protected void afterTest() {
        logger.log("Some steps");
    }
}
