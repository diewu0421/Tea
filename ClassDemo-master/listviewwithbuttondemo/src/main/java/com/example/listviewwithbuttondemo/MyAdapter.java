package com.example.listviewwithbuttondemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

/**
 * Created by jackiechan on 16/1/11.
 */
public class MyAdapter extends BaseAdapter {
    private Context context;
    public MyAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 100;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item, null);
        }
        Button button = (Button) convertView.findViewById(R.id.bt1);
        button.setText("当前"+position);
        return convertView;
    }
}
