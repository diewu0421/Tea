package com.gshl.tea.activity;

import android.content.Intent;
import android.databinding.repacked.org.antlr.v4.runtime.atn.SetTransition;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.text.InputType;
import android.view.View;
import com.gshl.tea.R;
import com.gshl.tea.bean.LoginInfo;
import com.gshl.tea.constant.RequestUrl;
import com.gshl.tea.databinding.LoginLayoutBinding;
import com.gshl.tea.i.BaseOkhttpCallback;
import com.gshl.tea.utils.ParamsUtils;
import com.gshl.tea.utils.RequestNetUtils;
import com.gshl.tea.utils.SPUtils;
import com.gshl.tea.utils.StatusBarCompat;
import com.gshl.tea.utils.ToastUtils;
import com.gshl.tea.utils.UserStateInfo;

import okhttp3.Call;

public class LoginActivity extends BaseActivity implements View.OnClickListener {

    private static final int LOGIN_SUCCESS = 2000;
    private LoginLayoutBinding bind;
    private static final int REGISTER_CODE = 1;
    private boolean isVisiblePassword;

    @Override
    protected void init() {
        //初始化一些属性
        initProperty();
        //初始化事件
        initEvent();
    }


    private void initProperty() {
        StatusBarCompat.compat(this,getResources().getColor(R.color.bg_login_color));
        bind = (LoginLayoutBinding) this.binding;
    }


    private void initEvent() {
        bind.loginBtn.setOnClickListener(this);
        bind.forgetPass.setOnClickListener(this);
        bind.registerByPhone.setOnClickListener(this);
        bind.loginShowPassword.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            //登录
            case R.id.login_btn:
                bind.loginBtn.setVisibility(View.INVISIBLE);
                bind.loginProgress.setVisibility(View.VISIBLE);
                requestLogin();
                break;

            //使用手机号注册 跳转至注册页面
            case R.id.register_by_phone:
                jumpToRegister();
                break;

            //显示登录密码
            case R.id.login_show_password:
                showAndHiddenPassword();
                break;
        }
    }

    /**
     * 设置密码的可见性
     */
    private void showAndHiddenPassword() {
        if (isVisiblePassword) {
            //密码不可见
            bind.loginPassEt.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        }else {
            //密码可见
            bind.loginPassEt.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
        }
        isVisiblePassword = !isVisiblePassword;
    }



    //请求登陆
    private void requestLogin() {

        RequestNetUtils.post(
                RequestUrl.LOGIN_URL,
                ParamsUtils.getInstance()
                        .putParams("phone", bind.loginPhoneEt.getText().toString())
                        .putParams("password", bind.loginPassEt.getText().toString())
                        .create(),
                new BaseOkhttpCallback<LoginInfo>() {

                    @Override
                    public void onResponse(LoginInfo response, int id) {
                        Message message = handler.obtainMessage(LOGIN_SUCCESS);
                        message.obj = response;
                        handler.sendMessage(message);
                    }

                    @Override
                    public void onError(Call call, Exception e, int id) {
                        ToastUtils.showShortToast(LoginActivity.this,"登录失败，请检查网络连接！");

                        bind.loginBtn.setVisibility(View.VISIBLE);
                        bind.loginProgress.setVisibility(View.GONE);
                    }

                    @Override
                    protected Class<LoginInfo> getClassObject() {
                        return LoginInfo.class;
                    }
                }
        );

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REGISTER_CODE && resultCode == RegisterActivity.RESULT_CODE) {
            //TODO 注册结果
            handlerRegisterResult(data);
        }
    }

    //处理注册结果
    private void handlerRegisterResult(Intent data) {
        String phone = data.getStringExtra("phone");
        String password = data.getStringExtra("password");
        bind.loginPhoneEt.setText(phone);
        bind.loginPassEt.setText(password);
    }

    private void jumpToRegister() {
        startActivityForResult(new Intent(this,RegisterActivity.class),REGISTER_CODE);
    }

    public void jumpToMain() {
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }

    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                //登录成功
                case LOGIN_SUCCESS:
                    UserStateInfo.getInstance().setLogin(true);
                    UserStateInfo.getInstance().setUserPhone(((LoginInfo) msg.obj).getData().getUser().getPhone());
                    SPUtils spUtils = new SPUtils(getResources().getString(R.string.app_name_en));
                    spUtils.put("phone",bind.loginPhoneEt.getText().toString());
                    spUtils.put("password",bind.loginPassEt.getText().toString());
                    spUtils.put("isLogin",true);
                    spUtils.put("isAutoLogin",true);
                    jumpToMain();
                    break;
            }
        }
    };

    @Override
    protected int getLayoutId() {
        return R.layout.login_layout;
    }

}
