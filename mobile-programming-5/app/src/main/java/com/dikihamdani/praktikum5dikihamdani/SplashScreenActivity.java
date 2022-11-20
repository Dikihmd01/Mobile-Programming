package com.dikihamdani.praktikum5dikihamdani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends AppCompatActivity {

    int durasiSpashScreen = 2500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent pindah = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(pindah);
                SplashScreenActivity.this.finish();
            }
        }, durasiSpashScreen);
    }
}