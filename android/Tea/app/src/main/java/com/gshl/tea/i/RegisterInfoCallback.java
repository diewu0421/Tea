package com.gshl.tea.i;

import com.google.gson.Gson;
import com.gshl.tea.bean.RegisterInfo;
import com.zhy.http.okhttp.callback.Callback;

import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by ZengLingWen on 2017/3/9.
 */

public class RegisterInfoCallback extends Callback<RegisterInfo> {
    @Override
    public RegisterInfo parseNetworkResponse(Response response, int id) throws Exception {
        String result = response.body().string();
        RegisterInfo registerInfo = new Gson().fromJson(result, RegisterInfo.class);
        return registerInfo;
    }

    @Override
    public void onError(Call call, Exception e, int id) {

    }

    @Override
    public void onResponse(RegisterInfo response, int id) {

    }
}
