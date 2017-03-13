package com.gshl.tea.i;

import com.google.gson.Gson;
import com.gshl.tea.utils.LogUtils;
import com.zhy.http.okhttp.callback.Callback;
import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by ZengLingWen on 2017/3/10.
 */

public abstract class BaseOkhttpCallback<T> extends Callback<T> {
    @Override
    public T parseNetworkResponse(Response response, int id) throws Exception {
        return new Gson().fromJson(response.body().string(),getClassObject());
    }

    protected abstract Class<T> getClassObject();


    @Override
    public void onError(Call call, Exception e, int id) {
        if (call != null) {
            LogUtils.e("请求出错 id = " + id + "   " + call.request().toString());
        }else {
            LogUtils.e("请求出错");
        }
    }
}
