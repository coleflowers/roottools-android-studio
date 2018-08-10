package com.lovecode666.androidinfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by coleflowers on 2018/8/11.
 */

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                startMain();
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, 1200);

    }

    private void startMain(){
        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
        //overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        //finish();
    }

}
