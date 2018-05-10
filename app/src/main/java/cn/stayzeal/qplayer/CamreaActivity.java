package cn.stayzeal.qplayer;

import android.content.Context;
import android.content.res.Configuration;
import android.hardware.Camera;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.SurfaceView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CamreaActivity extends AppCompatActivity {

    @BindView(R.id.preview_sv)
    SurfaceView previewSv;

    Camera mCamera;
    private Camera.Parameters parameters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camrea);
        ButterKnife.bind(this);


    }

    private void test() {

        int cameras = Camera.getNumberOfCameras();

        parameters = mCamera.getParameters();
        mCamera.setParameters(parameters);

    }

    public static Camera openCamera(int cameraId) {
        try {
            return Camera.open(cameraId);
        } catch (Exception e) {
            return null;
        }
    }

    public static void followScreenOrientation(Context context, Camera camera){
        final int orientation = context.getResources().getConfiguration().orientation;
        if(orientation == Configuration.ORIENTATION_LANDSCAPE) {
            camera.setDisplayOrientation(180);
        }else if(orientation == Configuration.ORIENTATION_PORTRAIT) {
            camera.setDisplayOrientation(90);
        }
    }


}
