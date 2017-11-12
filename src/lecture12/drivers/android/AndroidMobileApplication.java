package lecture12.drivers.android;

import lecture12.drivers.*;

public class AndroidMobileApplication implements MobileApplication {
    @Override
    public MainScreen mainScreen() {
        return new AndroidMainScreen();
    }

    @Override
    public CameraScreen cameraScreen() {
        return new AndroidCameraScreen();
    }

    @Override
    public PhotoEditorScreen photoEditorScreen() {
        return new AndroidPhotoEditorScreen();
    }

    @Override
    public PublishScreen publishScreen() {
        return new AndroidPublishScreen();
    }
}
