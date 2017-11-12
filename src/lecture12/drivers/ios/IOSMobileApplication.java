package lecture12.drivers.ios;

import lecture12.drivers.*;

public class IOSMobileApplication implements MobileApplication{
    @Override
    public MainScreen mainScreen() {

        return new IOSMainScreen();
    }

    @Override
    public CameraScreen cameraScreen() {
        return new IOSCameraScreen();
    }

    @Override
    public PhotoEditorScreen photoEditorScreen() {
        return new IOSPhotoEditorScreen();
    }

    @Override
    public PublishScreen publishScreen() {
        return new IOSPublishScreen();

    }
    }

