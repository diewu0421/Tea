package com.gshl.tea.i;

import com.google.gson.Gson;
import com.gshl.tea.bean.LoginInfo;
import com.zhy.http.okhttp.callback.Callback;
import okhttp3.Response;

/**
 * Created by ZengLingWen on 2017/3/9.
 */
public abstract class LoginInfoCallback extends Callback<LoginInfo> {
    @Override
    public LoginInfo parseNetworkResponse(Response response, int id) throws Exception {
        return new Gson().fromJson(response.body().string(), LoginInfo.class);
    }
}
