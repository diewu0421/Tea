package com.gshl.tea.module.home.i;

import com.google.gson.Gson;
import com.zhy.http.okhttp.callback.Callback;

import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by ZengLingWen on 2017/2/22.
 */


public class OkHttpCommonCallback<T> extends Callback<T> {
    @Override
    public T parseNetworkResponse(Response response, int id) throws Exception {
        //得到字符串结果
        String string = response.body().string();
        //使用Gson把字符串的结果转化成对象
        Object o = new Gson().fromJson(string, Object.class);
        //转化成泛型，会回调onResponse方法
        return (T) o;
    }

    @Override
    public void onError(Call call, Exception e, int id) {

    }

    @Override
    public void onResponse(T t, int id) {

    }
}
