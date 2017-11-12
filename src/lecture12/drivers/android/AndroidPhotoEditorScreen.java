package lecture12.drivers.android;

import lecture12.drivers.PhotoEditorScreen;

public class AndroidPhotoEditorScreen implements PhotoEditorScreen {
    @Override
    public void selectFilter() {
        System.out.println("Android select filter");
    }

    @Override
    public void applyPhoto() {
        System.out.println("Android apply photo");
    }

    @Override
    public void saveImage() {
        System.out.println("Android save image");
    }
}
