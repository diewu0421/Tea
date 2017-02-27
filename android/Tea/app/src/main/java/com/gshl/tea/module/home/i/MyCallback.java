package com.gshl.tea.module.home.i;

import com.google.gson.Gson;
import com.gshl.tea.module.home.bean.HotSellerGood;
import com.zhy.http.okhttp.callback.Callback;

import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by ZengLingWen on 2017/2/22.
 */

public class MyCallback extends Callback<HotSellerGood>{

    @Override
    public HotSellerGood parseNetworkResponse(Response response, int id) throws Exception {
        String result = response.body().string();
        HotSellerGood hotSellerGood = new Gson().fromJson(result, HotSellerGood.class);
        return hotSellerGood;
    }

    @Override
    public void onError(Call call, Exception e, int id) {

    }

    @Override
    public void onResponse(HotSellerGood response, int id) {

    }
}
