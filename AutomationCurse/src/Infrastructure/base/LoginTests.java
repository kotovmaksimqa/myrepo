package Infrastructure.base;

public class LoginTests extends AuthTestBase {

    @Override
    public void setUp() {
        super.setUp();

        logger.log("Click login button");

    }

    @Override
    protected void afterTest() {

    }

    public static void main(String[] args) {
        LoginTests lg = new LoginTests();
        lg.setUp();

        lg.logger.log("some steps");
    }
}
