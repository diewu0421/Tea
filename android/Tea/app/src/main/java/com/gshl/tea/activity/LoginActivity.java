package com.gshl.tea.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaRouter;
import android.util.Log;
import android.view.View;

import com.google.gson.Gson;
import com.gshl.tea.R;
import com.gshl.tea.bean.LoginInfo;
import com.gshl.tea.constant.RequestUrl;
import com.gshl.tea.databinding.LoginLayoutBinding;
import com.gshl.tea.i.LoginInfoCallback;
import com.gshl.tea.utils.LogUtils;
import com.gshl.tea.utils.RequestNetUtils;
import com.gshl.tea.utils.StatusBarCompat;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.BitmapCallback;
import com.zhy.http.okhttp.callback.Callback;
import com.zhy.http.okhttp.callback.FileCallBack;

import java.io.File;
import java.util.HashMap;

import okhttp3.Call;
import okhttp3.Response;

public class LoginActivity extends BaseActivity implements View.OnClickListener {

    private LoginLayoutBinding bind;
    private static final int REGISTER_CODE = 1;

    @Override
    protected void init() {
        //初始化一些属性
        initProperty();
        //初始化控件
        initView();
        //初始化事件
        initEvent();
    }

    private void initProperty() {
        StatusBarCompat.compat(this, getResources().getColor(R.color.bg_login_color));
        bind = (LoginLayoutBinding) this.binding;
    }

    private void initView() {

    }

    private void initEvent() {
        bind.loginBtn.setOnClickListener(this);
        bind.forgetPass.setOnClickListener(this);
        bind.registerByPhone.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            //登录
            case R.id.login_btn:
//                jumpToMain();
                requestLogin();
                break;

            //使用手机号注册 跳转至注册页面
            case R.id.register_by_phone:
                jumpToRegister();
                break;
        }
    }

    //请求登陆
    private void requestLogin() {

//        HashMap<String, String> map = new HashMap<>();
//        map.put("phone", bind.loginPhoneEt.getText().toString());
//        map.put("password", bind.loginPassEt.getText().toString());
//        RequestNetUtils.post(RequestUrl.LOGIN_URL,map,new Callback<LoginInfo>(){
//            @Override
//            public LoginInfo parseNetworkResponse(Response response, int id) throws Exception {
//
//                return new Gson().fromJson(response.body().string(),LoginInfo.class);
//            }
//
//            @Override
//            public void onError(Call call, Exception e, int id) {
//                LogUtils.e("error");
//            }
//
//            @Override
//            public void onResponse(LoginInfo response, int id) {
//                LogUtils.e("ensure " + response.toString());
//            }
//        });

        OkHttpUtils
                .post()
                .url(RequestUrl.BASE_URL + RequestUrl.LOGIN_URL)
                .addParams("password", bind.loginPassEt.getText().toString())
                .addParams("phone", bind.loginPhoneEt.getText().toString())
                .build()
                .execute(new LoginInfoCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        LogUtils.e("错误");

                    }

                    @Override
                    public void onResponse(LoginInfo response, int id) {
                        LogUtils.e(response.toString());
                    }
                });


    }

    private void jumpToRegister() {
        startActivityForResult(new Intent(this, RegisterActivity.class), REGISTER_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REGISTER_CODE && resultCode == RegisterActivity.RESULT_CODE) {
            //TODO 注册结果
            handlerResult(data);
        }
    }

    //处理注册结果
    private void handlerResult(Intent data) {
        String phone = data.getStringExtra("phone");
        String password = data.getStringExtra("password");
        bind.loginPhoneEt.setText(phone);
        bind.loginPassEt.setText(password);
    }

    public void jumpToMain() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.login_layout;
    }

}
