package com.example.listviewwithbuttondemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jackiechan on 16/1/11.
 */
public class MyAdapter1 extends BaseAdapter {
    private Context context;
    private List<String> integers = new ArrayList<>();
    public MyAdapter1(Context context) {
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
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item1, null);
        }
        CheckBox button = (CheckBox) convertView.findViewById(R.id.bt1);
        button.setTag(position);//把位置设置为 tag
        if (integers.contains("" + position)) {
            button.setChecked(true);
        }else{
            button.setChecked(false);
        }
        button.setOnCheckedChangeListener(onCheckedChangeListener);
        return convertView;
    }
    private CompoundButton.OnCheckedChangeListener onCheckedChangeListener=new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            int position = (int) buttonView.getTag();
            if (isChecked&&!integers.contains(""+position)) {//变成选中并且集合中没有当前位置的时候
                integers.add(position + "");
            } else {
                integers.remove(position + "");
            }
                }
    };
}
