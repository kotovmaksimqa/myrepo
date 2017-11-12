package lecture12.drivers.android;

import lecture12.drivers.CameraScreen;

public class AndroidCameraScreen implements CameraScreen {
    @Override
    public void makePhoto() {
        System.out.println("Android Make photo");
    }
}
