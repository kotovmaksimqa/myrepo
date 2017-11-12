package lecture12.drivers.android;

import lecture12.drivers.MainScreen;

public class AndroidMainScreen implements MainScreen {
    @Override
    public void clickAddPhotoButton() {
        System.out.println("Android click add photo button");
    }

    @Override
    public void clickLikeButton(String post) {
        System.out.println("Android click like button - " );
    }

    @Override
    public void clickCommentButton(String post) {
        System.out.println("click comment button - " );
    }

    @Override
    public void getLatestPost() {
        System.out.println("Android latest post");
    }
}
