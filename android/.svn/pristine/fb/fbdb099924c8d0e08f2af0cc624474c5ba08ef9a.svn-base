package com.gshl.tea.activity;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.gshl.tea.R;
import com.gshl.tea.utils.StatusBarCompat;

/**
 * Created by ZengLingWen on 2017/2/21.
 */

public abstract class BaseActivity extends AppCompatActivity {

    protected ViewDataBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(getLayoutId());
        binding = DataBindingUtil.setContentView(this, getLayoutId());
        //设置状态栏的颜色 沉浸式状态栏
        setStatusColor();
        init();
        initEvent();
        loadData();
    }

    private void setStatusColor() {
        StatusBarCompat.compat(this,getResources().getColor(R.color.color_ff6243));
    }

    protected void initEvent() {

    }

    protected abstract void init();

    protected void loadData(){}

    protected abstract int getLayoutId();

}
