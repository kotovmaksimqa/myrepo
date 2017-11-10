package lecture12;

import Infrastructure.config.ConfigurationManager;
import Infrastructure.webdrivermanager.WebDriverManager;
import lecture12.drivers.MobileApplication;
import lecture12.drivers.android.AndroidMobileApplication;
import lecture12.drivers.ios.IOSMobileApplication;

public class MobileAppTests {
    public static void main(String[] args) {
        WebDriverManager wdm = new WebDriverManager();
        String browser = wdm.getAvailableWebDriver();

        MobileApplication app = getApp();

        app.mainScreen().clickAddPhotoButton();
        app.cameraScreen().makePhoto();

        app.photoEditorScreen().selectFilter();
        app.photoEditorScreen().saveImage();
        app.photoEditorScreen().applyPhoto();

        app.publishScreen().enterMessage("Kakoy Krasivuy");
        app.publishScreen().enterHashTags("Holiday");
        app.publishScreen().clickPublishButton();

        app.mainScreen().getLatestPost();

    }
    private static MobileApplication getApp() {
        return ConfigurationManager.getInstance().getMobilePlatform().equals("IOS") ? new IOSMobileApplication()
                : new AndroidMobileApplication();
    }
}
