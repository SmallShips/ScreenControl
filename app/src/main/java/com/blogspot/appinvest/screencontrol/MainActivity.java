package com.blogspot.appinvest.screencontrol;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        //getActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
//        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE);

        setContentView(R.layout.activity_main);

        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();

        int pxWidth = displayMetrics.widthPixels;
        int pxHeight = displayMetrics.heightPixels;
        int xdpi = (int) displayMetrics.xdpi;
        int ydpi = (int) displayMetrics.ydpi;
        float density = displayMetrics.density;
        float dpWidth = pxWidth/density;
        float dpHeight = pxHeight/density;

        int hq = getResources().getConfiguration().screenHeightDp;
        int wq = getResources().getConfiguration().screenWidthDp;
        int hnav = (int) (getResources().getDimensionPixelSize(getResources().getIdentifier
                        ("navigation_bar_height", "dimen", "android"))/density);

        TextView output = (TextView) findViewById(R.id.output);

        int hstatus = (int) (getResources().getDimensionPixelSize(getResources().getIdentifier
                ("status_bar_height", "dimen", "android"))/density);


        output.setText("px: " + pxWidth + "x" + pxHeight + "\n" + "dpi: " + xdpi + "x" + ydpi + "\n" +
                "density: " + density + "\n" + "dp: " + dpWidth + "x" + dpHeight + "\n" + "wq: " + wq + "\n" +
                "hq:" + hq + "\n" + "hnav: " + hnav + "\n" + "hstatus: " + hstatus);


    }
}
