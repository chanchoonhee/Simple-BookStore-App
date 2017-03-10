package com.gusterwoei.theoddbookstore.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.gusterwoei.theoddbookstore.R;
import com.gusterwoei.theoddbookstore.User;

import java.util.Timer;
import java.util.TimerTask;



public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View decorView = getWindow().getDecorView();
        // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        setContentView(R.layout.activity_splash);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                checkUserStatus();
            }
        }, 3000);
        }

    private void checkUserStatus() {
       User user = getUserRepo().getCurrentUser();
        if(user == null) {
        // for first time use, go to login screen
        startActivity(new Intent(getApplicationContext(), LoginActivity.class));
    } else {
        proceed();
    }

    finish();
}

    private void proceed() {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
    }










