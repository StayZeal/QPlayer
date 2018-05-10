package cn.stayzeal.qplayer;

import android.graphics.Canvas;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CamreaActivity extends AppCompatActivity {

    @BindView(R.id.preview_sv)
    SurfaceView previewSv;

    SurfaceHolder surfaceHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camrea);
        ButterKnife.bind(this);


        surfaceHolder = previewSv.getHolder();


        surfaceHolder.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(SurfaceHolder holder) {

            }

            @Override
            public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

            }

            @Override
            public void surfaceDestroyed(SurfaceHolder holder) {

            }
        });

        test();
    }

    private void test() {
        Canvas canvas = surfaceHolder.lockCanvas();


        surfaceHolder.unlockCanvasAndPost(canvas);

    }
}
