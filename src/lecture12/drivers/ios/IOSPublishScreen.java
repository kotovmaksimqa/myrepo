package lecture12.drivers.ios;

import lecture12.drivers.PublishScreen;

public class IOSPublishScreen implements PublishScreen {


    @Override
    public void enterMessage(String msg) {
        System.out.println("IOS enter message - " + msg);
    }

    @Override
    public void enterHashTags(String tags) {
        System.out.println("IOS enter tags - " + tags);
    }

    @Override
    public void clickPublishButton() {
        System.out.println("IOS click publish button");
    }
}
