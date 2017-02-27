package com.gshl.tea.activity;

import android.content.Intent;

import com.gshl.tea.R;
import com.gshl.tea.utils.StatusBarCompat;

public class InputCodeActivity extends BaseActivity {

    @Override
    protected void init() {
        StatusBarCompat.compat(this,getResources().getColor(R.color.register_activity_bg));
        startActivity(new Intent(this,SetPasswordActivity.class));
        finish();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_input_code;
    }
}
