package cn.stayzeal.qplayer;


import android.hardware.Camera;

public class CameraUtil {

    private Camera mCamera;
    PreviewView previewView;

    LiveCameraView liveCameraView;

    public CameraUtil(PreviewView previewView) {
        this.previewView = previewView;
    }

    public CameraUtil(LiveCameraView liveCameraView) {
        this.liveCameraView = liveCameraView;

        this.liveCameraView.setCamera(mCamera);
    }


    private void init() {

    }
}
