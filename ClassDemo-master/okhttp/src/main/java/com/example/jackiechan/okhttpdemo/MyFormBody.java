package com.example.jackiechan.okhttpdemo;

import java.util.Map;
import java.util.Set;

import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.Request;

/**
 * Created by jackiechan on 16/1/28.
 */
public class MyFormBody {
    private static FormBody ChuShiHua(Map<String, String> params) {
        FormBody formBody = null;

        FormBody.Builder builder = new FormBody.Builder();
        Set<String> strings = params.keySet();
        for (String string : strings) {
            builder.add(string, params.get(string));
        }
        return builder.build();
    }

    public static void getData(Map<String, String> params, String url, Callback callback) {
        FormBody formBody = ChuShiHua(params);
        Request request = new Request.Builder().url(url).post(formBody).build();//获取到请求
        MyApp.okHttpClient.newCall(request).enqueue(callback);
    }
}
