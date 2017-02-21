package com.qianfeng.retrofit_rxandroid_mvp_demo.adapter;

//                            _ooOoo_  


import android.support.annotation.LayoutRes;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by jackiechan on 16/8/7.
 */
public abstract class MyBaseAdapter<T> extends BaseAdapter {
    private List<T> list;
    private @LayoutRes  int id;

    public MyBaseAdapter(int id, List<T> list) {
        this.id = id;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list == null ? 0 : list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        MyHolder myHolder = MyHolder.getHolder(convertView, id, viewGroup.getContext());
        fillData(position,myHolder);
        return myHolder.getmConvertView();
    }

    public abstract void fillData(int position,MyHolder myHolder);
}
