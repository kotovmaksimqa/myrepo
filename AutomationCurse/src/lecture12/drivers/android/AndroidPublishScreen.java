package lecture12.drivers.android;

import lecture12.drivers.PublishScreen;

public class AndroidPublishScreen implements PublishScreen {
    @Override
    public void enterMessage(String msg) {
        System.out.println("Android enter message - " + msg);
    }

    @Override
    public void enterHashTags(String tags) {
        System.out.println("Android enter has tags - " + tags);
    }

    @Override
    public void clickPublishButton() {
        System.out.println("Android click publish button");
    }
}
