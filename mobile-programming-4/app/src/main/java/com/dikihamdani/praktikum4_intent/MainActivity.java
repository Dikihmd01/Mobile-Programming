package com.dikihamdani.praktikum4_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toPage2(View view) {
        Intent route = new Intent(MainActivity.this, page2.class);
        MainActivity.this.finish();
        startActivity(route);
    }
}