package Infrastructure.utils;

import Infrastructure.config.ConfigurationManager;

public class TestServer {

    public String getTestServer() {
        Url.UrlBuilder newUrl = new Url.UrlBuilder();
        String env = ConfigurationManager.getInstance().getTestEnv();
        switch (env) {
            case "local":
                return   newUrl.protocol("https")
                        .domain("docs.oracle.com")
                        .port("")
                        .path("javase/tutorial/java/javaOO")
                        .oneParam("nested.html")
                        .keyValueParam("")
                        .build();
            case "stage":
                return "http://stage-iavatar.jellyworkz.com";
            case "production":
                return "http://mysite.com";
            default:
                return "no one sites";
        }
    }
}
