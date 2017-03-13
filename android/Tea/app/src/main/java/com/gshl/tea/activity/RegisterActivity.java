package com.gshl.tea.activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.view.View;

import com.gshl.tea.MyApp;
import com.gshl.tea.R;
import com.gshl.tea.bean.RegisterInfo;
import com.gshl.tea.constant.RequestUrl;
import com.gshl.tea.databinding.ActivityRegisterNewBinding;
import com.gshl.tea.i.RegisterInfoCallback;
import com.gshl.tea.utils.LogUtils;
import com.gshl.tea.utils.RegexUtils;
import com.gshl.tea.utils.StatusBarCompat;
import com.gshl.tea.utils.StringUtils;
import com.gshl.tea.utils.ToastUtils;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import okhttp3.Call;

public class RegisterActivity extends BaseActivity implements View.OnClickListener {

    private static final int START_REGISTER = 1;
    public static final int RESULT_CODE = 2;
    private static final int REQUEST_RESULT = 3;
    private ActivityRegisterNewBinding bind;
    private String phone;
    private String pass;

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
        StatusBarCompat.compat(this,getResources().getColor(R.color.bg_login_color));
        bind = (ActivityRegisterNewBinding) this.binding;
    }

    private void initView() {

    }

    private void initEvent() {
        bind.registerBtn.setOnClickListener(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_register_new;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            //点击注册按钮
            case R.id.register_btn:
                handler.sendEmptyMessage(START_REGISTER);
                break;
        }
    }

    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                //开始注册
                case START_REGISTER:
                    startRegister();
                    break;

                //请求结果
                case REQUEST_RESULT:
                    RegisterInfo info = (RegisterInfo) msg.obj;
                    if (info.getCode() == 2000) {
                        Intent data = new Intent();
                        data.putExtra("phone", phone);
                        data.putExtra("password", pass);
                        setResult(RESULT_CODE,data);
                        ToastUtils.showShortToast(RegisterActivity.this,"恭喜你，注册成功！");
                        finish();
                    } else {
                        ToastUtils.showShortToast(RegisterActivity.this,info.getMsg());
                    }
                    break;
            }
        }
    };

    private void startRegister() {
//        //用户输入的手机号码
        phone = bind.registerPhoneEt.getText().toString();
//        //用户输入的密码
        pass = bind.registerPassEt.getText().toString();
//        if (RegexUtils.isMobileExact(phone)) {
//            if (StringUtils.length(pass) >= 6 && StringUtils.length(pass) <= 20) {
//                if (RegexUtils.isPassword(pass)) {
//                    //TODO 手机和密码合法 post提交注册
//                    postRegister(phone, pass);
//                }else {
//                    ToastUtils.showShortToast(RegisterActivity.this,"密码含有非法字符，请重新输入！");
//                }
//            }else {
//                ToastUtils.showShortToast(RegisterActivity.this,"密码必须在6-20位之间，请重新输入！");
//            }
//        }else {
//            ToastUtils.showShortToast(RegisterActivity.this,"不是有效的手机号码");
//        }

        if (RegexUtils.isValidByPhoneAndPass(phone, pass)) {
            postRegister(phone,pass);
        }
    }

    private void postRegister(String phone, String pass) {
        OkHttpUtils
                .post()
                .tag(MyApp.getInstance())
                .url(RequestUrl.BASE_URL + RequestUrl.REGISTER_URL)
                .addParams("phone", phone)
                .addParams("password", pass)
                .build()
                .execute(new RegisterInfoCallback(){
                    @Override
                    public void onResponse(RegisterInfo response, int id) {
                        LogUtils.e("响应结果为 " + response.getMsg());
                        Message msg = handler.obtainMessage(REQUEST_RESULT);
                        msg.obj = response;
                        handler.sendMessage(msg);
                    }

                    @Override
                    public void onError(Call call, Exception e, int id) {
                        LogUtils.e("错误" + call.toString());
                    }
                });
    }


}
