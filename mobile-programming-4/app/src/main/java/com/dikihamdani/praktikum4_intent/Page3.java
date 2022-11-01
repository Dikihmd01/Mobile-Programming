package com.dikihamdani.praktikum4_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Page3 extends AppCompatActivity {

    private static int delay = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent route_page1 = new Intent(Page3.this, MainActivity.class);
                Page3.this.finish();
                startActivity(route_page1);
            }
        }, delay);
    }
}