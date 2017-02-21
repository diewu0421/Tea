package com.gshl.tea.module.home.activity;

import com.gshl.tea.R;
import com.gshl.tea.activity.BaseFragment;
import com.gshl.tea.databinding.HomeLayoutBinding;
import com.gshl.tea.module.home.bean.Area;
import com.gshl.tea.module.home.i.MyUserBack;
import com.zhy.http.okhttp.OkHttpUtils;

import okhttp3.Call;

/**
 * Created by ZengLingWen on 2017/2/21.
 */

public class HomeFragment extends BaseFragment {


    private HomeLayoutBinding bind;

    @Override
    protected void init() {
        bind = (HomeLayoutBinding) this.binding;
        bind.setStr("等待中...");
    }

    @Override
    protected void loadData() {
//        46bc1a1faabe4f189cf66710228c39db  32416

        OkHttpUtils
                .get()
                .url("http://route.showapi.com/9-9")
                .addParams("showapi_sign", "46bc1a1faabe4f189cf66710228c39db")
                .addParams("showapi_appid", 32417+"")
                .addParams("area", "深圳")
                .build()
                .execute(new MyUserBack(){
                    @Override
                    public void onResponse(Area response, int id) {
                        super.onResponse(response, id);
                        fillData(response.getShowapi_res_body().getDayList().toString());
                    }

                    @Override
                    public void onError(Call call, Exception e, int id) {
                        super.onError(call, e, id);
                        bind.setStr("错误");
                    }
                });
    }

    private void fillData(String result) {
        bind.setStr(result);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.home_layout;
    }
}
