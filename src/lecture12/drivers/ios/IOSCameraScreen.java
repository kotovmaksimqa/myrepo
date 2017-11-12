package lecture12.drivers.ios;

import lecture12.drivers.CameraScreen;

public class IOSCameraScreen implements CameraScreen {
    @Override
    public void makePhoto() {
        System.out.println("IOS make photo ");
    }
}
