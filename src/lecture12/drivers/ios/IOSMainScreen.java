package lecture12.drivers.ios;

import lecture12.drivers.MainScreen;

public class IOSMainScreen implements MainScreen {
    @Override
    public void clickAddPhotoButton() {
        System.out.println("IOS Click on Add photo Button");
    }

    @Override
    public void clickLikeButton(String post) {
        System.out.println(" IOS Click like button - ");
    }

    @Override
    public void clickCommentButton(String post) {
        System.out.println("IOS Click Comment Button - ");
    }

    @Override
    public void getLatestPost() {
        System.out.println("IOS latest post");
    }
}
