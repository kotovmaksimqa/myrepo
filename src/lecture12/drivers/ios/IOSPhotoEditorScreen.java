package lecture12.drivers.ios;


import lecture12.drivers.PhotoEditorScreen;

public class IOSPhotoEditorScreen implements PhotoEditorScreen{

    @Override
    public void selectFilter() {
        System.out.println("IOS Select filter");
    }

    @Override
    public void applyPhoto() {
        System.out.println("IOS apply filter");
    }

    @Override
    public void saveImage() {
        System.out.println("IOS save image");
    }
}
