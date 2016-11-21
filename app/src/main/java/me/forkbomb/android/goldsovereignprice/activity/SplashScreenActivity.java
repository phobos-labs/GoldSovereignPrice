package me.forkbomb.android.goldsovereignprice.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import me.forkbomb.android.goldsovereignprice.R;

public class SplashScreenActivity extends Activity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_screen);
        getWindow().getDecorView()
                   .setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE |
                                          View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
                                          View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                                          View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
                                          View.SYSTEM_UI_FLAG_FULLSCREEN |
                                          View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
    }

    @Override
    protected void onPostCreate(final Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        final Intent intent = new Intent(this, GoldSovereignActivity.class);
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        startActivity(intent);
    }

}
