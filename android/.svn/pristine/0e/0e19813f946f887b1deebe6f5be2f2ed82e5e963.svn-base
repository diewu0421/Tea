package com.gshl.tea.module.order.utils;

import android.util.Log;

import com.gshl.tea.module.order.bean.GoodList;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;

/**
 * Created by ZengLingWen on 2017/3/3.
 */

public class OrderRequestNet {
    public static List<GoodList> loadGoodList(){
//        OkHttpUtils
//                .get()
//                .url("http://rap.taobao.org/mockjsdata/7027/queryUserData")
//                .build()
//                .execute(new StringCallback() {
//                    @Override
//                    public void onError(Call call, Exception e, int id) {
//
//                    }
//
//                    @Override
//                    public void onResponse(String response, int id) {
//                        Log.e("callback", "结果为" + response);
//                    }
//                });

        List<GoodList> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new GoodList(
                    "https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=2355881071,3005232681&fm=23&gp=0.jpg",
                    "红茶 · 高等级祁门红茶茗 萃取自高山红树叶",
                    "酸甜",
                    "赠",
                    "￥6.00",
                    i,
                    "记得要三种不同颜色的各一个"
            ));
        }
        return list;
    }
}
