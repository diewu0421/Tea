package com.gshl.tea.utils;

import com.gshl.tea.MyApp;
import com.gshl.tea.constant.RequestUrl;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.Callback;

import java.util.HashMap;

/**
 * Created by ZengLingWen on 2017/3/9.
 */

public class RequestNetUtils {
    public static void post(String url , HashMap<String, String> map, Callback callback) {
        OkHttpUtils
                .post()
                .tag(MyApp.getInstance())
                .url(RequestUrl.BASE_URL + url)
                .params(map)
                .build()
                .execute(callback);

    }

    public static void get(String url , HashMap<String, String> map, Callback callback) {

        OkHttpUtils
                .get()
                .tag(MyApp.getInstance())
                .url(RequestUrl.BASE_URL + url)
                .params(map)
                .build()
                .execute(callback);

    }
}
