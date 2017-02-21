package com.gshl.tea.activity;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

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
        initEvent();
        init();
        loadData();
    }

    protected void initEvent() {

    }

    protected abstract void init();

    protected abstract void loadData();

    protected abstract int getLayoutId();

}
