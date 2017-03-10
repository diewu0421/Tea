package com.gshl.tea.module.me.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.gshl.tea.R;
import com.gshl.tea.activity.BaseActivity;
import com.gshl.tea.databinding.ActivityUserManagerBinding;

public class UserManagerActivity extends BaseActivity implements View.OnClickListener {

    private ActivityUserManagerBinding bind;

    @Override
    protected void init() {
        //初始化一些属性
        initProperty();
        //初始化控件
        initView();
        //初始化数据
        initData();
        //初始化adapter
        initAdapter();
        //初始化事件
        initEvent();
    }

    private void initProperty() {
        bind = (ActivityUserManagerBinding) this.binding;
    }

    private void initView() {

    }

    private void initData() {

    }

    private void initAdapter() {
    }

    private void initEvent() {
        bind.userManagerGoback.setOnClickListener(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_user_manager;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.user_manager_goback:
                finish();
                break;
        }
    }
}
