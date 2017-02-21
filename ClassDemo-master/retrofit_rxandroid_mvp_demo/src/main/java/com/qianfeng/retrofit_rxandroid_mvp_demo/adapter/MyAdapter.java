package com.qianfeng.retrofit_rxandroid_mvp_demo.adapter;

//                            _ooOoo_  
//                           o8888888o  


import android.widget.ImageView;
import android.widget.TextView;

import com.qianfeng.retrofit_rxandroid_mvp_demo.R;
import com.qianfeng.retrofit_rxandroid_mvp_demo.bean.Cook;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by jackiechan on 16/8/7.
 */
public class MyAdapter extends MyBaseAdapter<Cook> {
    private List<Cook> list;
    public MyAdapter(int id, List<Cook> list) {
        super(id, list);
        this.list = list;
    }

    @Override
    public void fillData(int position, MyHolder myHolder) {
        Cook cook = list.get(position);
        ((TextView) myHolder.findView(R.id.name)).setText(cook.getName());
        ((TextView) myHolder.findView(R.id.des)).setText(cook.getDescription());
        Picasso.with(myHolder.getmConvertView().getContext()).load("http://tnfs.tngou.net/image"+cook.getImg()).into((ImageView) myHolder.findView(R.id.iv));

    }
}
