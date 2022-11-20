package com.dikihamdani.praktikum5dikihamdani;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    ArrayList<Binatang> allData;

    public ImageAdapter(Context c, ArrayList<Binatang> Object) {
        this.mContext = c;
        this.allData = Object;
    }

    public int getCount() {
        return allData.size();
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        View v = convertView;

        if (v == null) {
            imageView = new ImageView(mContext);
            int h = mContext.getResources().getDisplayMetrics().densityDpi;
            imageView.setLayoutParams(new ViewGroup.LayoutParams(h-45, h-45));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setPadding(1, 1, 1, 1);
        }
        else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(allData.get(position).gambar);
        return imageView;
    }
}
