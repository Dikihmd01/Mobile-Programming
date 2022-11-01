package com.dikihamdani.a3ac_diki_hamdani;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText inputDegree;
    private TextView result;
    double res, deg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputDegree = (EditText) findViewById(R.id.degree);
        result = (TextView) findViewById(R.id.result);
    }

    public void calculateDegree(View view) {
//        RadioButton btnSin = (RadioButton) findViewById(R.id.radioSin);
//        RadioButton btnCos = (RadioButton) findViewById(R.id.radioCos);
//        RadioButton btnTan = (RadioButton) findViewById(R.id.radioTan);

//        double res = 0;

        if(inputDegree.getText().length() == 0) {
            Toast.makeText(getBaseContext(), "Input tidak boleh kosong!", Toast.LENGTH_LONG).show();
        }
        else {
            deg = Double.parseDouble(inputDegree.getText().toString());
//            res = 0;
            final CharSequence[] item = {"Sin", "Cos", "Tan"};

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Hitung..");
            builder.setItems(item, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (i == 0) {
                        res = CalculateTrigonometry.calculateSin(deg);
                    }
                    else if (i == 1) {
                        res = CalculateTrigonometry.calculateCos(deg);
                    }
                    else {
                        res = CalculateTrigonometry.calculateTan(deg);
                    }
                    result.setText("Hasil " + inputDegree.getText() + " : " + res);
                }
            }).show();
        }
    }

    public void exitApp(View view) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Keluar dari aplikasi ini?").setCancelable(false).
                setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MainActivity.this.finish();
                    }
                }).
                setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                }).show();
    }
}