package com.gshl.tea.module.home.i;

import com.google.gson.Gson;
import com.gshl.tea.module.home.bean.Area;
import com.zhy.http.okhttp.callback.Callback;

import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by ZengLingWen on 2017/2/21.
 */

public class MyUserBack extends Callback<Area>{
    @Override
    public Area parseNetworkResponse(Response response, int id) throws Exception {
        String string = response.body().string();
        Area area = new Gson().fromJson(string, Area.class);
        return area;
    }

    @Override
    public void onError(Call call, Exception e, int id) {

    }

    @Override
    public void onResponse(Area response, int id) {

    }

}
