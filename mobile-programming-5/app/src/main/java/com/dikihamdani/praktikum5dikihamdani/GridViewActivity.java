package com.dikihamdani.praktikum5dikihamdani;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class GridViewActivity extends Activity implements AdapterView.OnItemClickListener {

    GridView gridview;
    MediaPlayer media;
    ArrayList<Binatang> allData = new ArrayList<Binatang>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        allData.add(new Binatang("Anjing", R.drawable.anjing, R.raw.anjing));
        allData.add(new Binatang("Bebek", R.drawable.bebek, R.raw.bebek));
        allData.add(new Binatang("Burung", R.drawable.burung, R.raw.burung));
        allData.add(new Binatang("Gajah", R.drawable.gajah, R.raw.gajah));
        allData.add(new Binatang("Harimau", R.drawable.harimau, R.raw.harimau));
        allData.add(new Binatang("Kambing", R.drawable.kambing, R.raw.kambing));
        allData.add(new Binatang("Kucing", R.drawable.kucing, R.raw.kucing));
        allData.add(new Binatang("Kuda", R.drawable.kuda, R.raw.kuda));
        allData.add(new Binatang("Monyet", R.drawable.monyet, R.raw.monyet));
        allData.add(new Binatang("Sapi", R.drawable.sapi, R.raw.sapi));

        gridview = (GridView) findViewById(R.id.gridView);
        gridview.setAdapter(new ImageAdapter(this, allData));
        gridview.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        Binatang binatang = allData.get(position);
        Toast.makeText(getBaseContext(), "Nama binatang " + binatang.jenis, Toast.LENGTH_SHORT).show();

        if (media != null && media.isPlaying()) {
            media.stop();
            media.release();
        }

        media = MediaPlayer.create(getBaseContext(), binatang.suara);
        media.setLooping(false);
        media.start();
    }

    public void onBackPressed() {
        media.stop();
        media.release();
        finish();
    }
}