package com.example.simpleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Variable global
    EditText msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msg = (EditText) findViewById(R.id.message);
    }

    public void showToast(View view) {
        String msgString = msg.getText().toString();
        Toast.makeText(getBaseContext(), "Pesan: " + msgString, Toast.LENGTH_LONG).show();
    }
}