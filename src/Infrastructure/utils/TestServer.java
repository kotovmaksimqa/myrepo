package Infrastructure.utils;

import Infrastructure.config.ConfigurationManager;

public class TestServer {

    public String getTestServer() {
        Url.UrlBuilder newUrl = new Url.UrlBuilder();
        TestEnv env = TestEnv.valueOf(ConfigurationManager.getInstance().getTestEnv());
        switch (env) {
            case LOCAL:
                return   newUrl.protocol("https")
                        .domain("docs.oracle.com")
                        .port("")
                        .path("javase/tutorial/java/javaOO")
                        .oneParam("nested.html")
                        .keyValueParam("")
                        .build()
                        .toString();
            case STAGE:
                return "http://stage-iavatar.jellyworkz.com";
            case PRODUCTION:
                return "http://mysite.com";
            default:
                return "no one sites";
        }
    }
}
