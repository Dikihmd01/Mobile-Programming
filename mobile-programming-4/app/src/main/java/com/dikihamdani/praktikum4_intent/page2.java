package com.dikihamdani.praktikum4_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
    }

    public void toPage1(View view) {
        Intent route_page1 = new Intent(page2.this, MainActivity.class);
        page2.this.finish();
        startActivity(route_page1);
    }

    public  void toPage3(View view) {
        Intent route_page3 = new Intent(page2.this, Page3.class);
        page2.this.finish();
        startActivity(route_page3);
    }
}