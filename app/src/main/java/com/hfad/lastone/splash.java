package com.hfad.lastone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;



public class splash extends AppCompatActivity {

    // Set the duration of the splash screen in milliseconds
    private static final long SPLASH_SCREEN_DURATION = 3000; // 2 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Delay the execution of the next activity using a Handler
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Create an Intent to start the next activity
                Intent intent = new Intent(splash.this,login_pro.class);
                startActivity(intent);

                // Finish the current activity
                finish();
            }
        }, SPLASH_SCREEN_DURATION);
    }
}

