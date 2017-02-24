package com.gshl.tea.activity;

import android.content.Intent;
import android.os.Bundle;

import com.gshl.tea.R;
import com.gshl.tea.utils.StatusBarCompat;

public class SetPasswordActivity extends BaseActivity {

    @Override
    protected void init() {
        StatusBarCompat.compat(this,getResources().getColor(R.color.register_activity_bg));
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_set_password;
    }
}
