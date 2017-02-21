package com.example.mylistviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by jackiechan on 16/1/5.
 */
public class MyAdadpter extends BaseAdapter{
    private Context context;

    public MyAdadpter(Context context) {
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
            convertView = LayoutInflater.from(context).inflate(R.layout.item_list, null);
        }
        TextView textView = (TextView) convertView.findViewById(R.id.tv1);
        textView.setText("我是第几" + position);
        return convertView;
    }
}
