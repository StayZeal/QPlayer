package cn.stayzeal.qplayer;


import android.content.Context;
import android.content.res.Configuration;
import android.hardware.Camera;

class Cameras {

    public static void followScreenOrientation(Context context, Camera camera) {
        final int orientation = context.getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            camera.setDisplayOrientation(180);
        } else if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            camera.setDisplayOrientation(90);
        }
    }
}
