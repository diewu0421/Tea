package com.qianfeng.retrofit_rxandroid_mvp_demo.adapter;


import android.content.Context;
import android.support.annotation.LayoutRes;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by jackiechan on 16/8/7.
 */
public class MyHolder {
    private View mConvertView;
    private SparseArray<View> sparseArray = new SparseArray<>();
    public MyHolder(Context context, int id) {
        mConvertView = LayoutInflater.from(context).inflate(id, null);
        mConvertView.setTag(this);
    }

    public View getmConvertView() {
        return mConvertView;
    }

    public static MyHolder getHolder(View convertView, @LayoutRes int id, Context context) {
        MyHolder myHolder = null;
        if (convertView == null) {
            myHolder = new MyHolder(context, id);
        }else{
            myHolder = (MyHolder) convertView.getTag();
        }

        return myHolder;
    }

    public View findView(int id) {
        View view = sparseArray.get(id);
        if (view == null) {
            view = mConvertView.findViewById(id);
            sparseArray.put(id, view);
        }
        return view;
    }
}
