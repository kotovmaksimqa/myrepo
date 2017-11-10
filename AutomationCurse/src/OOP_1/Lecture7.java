package OOP_1;

import Infrastructure.config.ConfigurationManager;

public class Lecture7 {

    public static void main(String[] args) {
        String browser = ConfigurationManager.getInstance().getTestBrowser();
        String  env = ConfigurationManager.getInstance().getTestEnv();
        System.out.println(browser);
        System.out.println(env);
    }

}
