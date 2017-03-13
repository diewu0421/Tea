package com.gshl.tea.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gshl.tea.R;
import com.gshl.tea.utils.SPUtils;
import com.gshl.tea.utils.ToastUtils;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        initLogin();
    }

    private void initLogin() {
        if (new SPUtils(getResources().getString(R.string.app_name_en)).getBoolean("isAutoLogin", false)) {
            startActivity(new Intent(this,MainActivity.class));
            ToastUtils.showShortToast(this,"自动登录成功");
        }else {
            startActivity(new Intent(this,LoginActivity.class));
        }
        finish();
    }
}
