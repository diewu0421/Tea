package com.example.jackiechan.okhttpdemo;

import android.util.Log;

import com.google.gson.Gson;

import java.io.IOException;

import de.greenrobot.event.EventBus;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by jackiechan on 16/1/28.
 *
 * 专门用于处理 json 数据的
 */

public class JsonCallBack implements Callback {

    private Object object;

    public JsonCallBack(Object object) {
        this.object = object;
    }

    @Override
    public void onFailure(Call call, IOException e) {

    }

    @Override
    public void onResponse(Call call, Response response) throws IOException {
        String s = response.body().string();
        Log.e("请求的数据", s);
        object = new Gson().fromJson(s, object.getClass());
        EventBus.getDefault().post(object);
    }
}
