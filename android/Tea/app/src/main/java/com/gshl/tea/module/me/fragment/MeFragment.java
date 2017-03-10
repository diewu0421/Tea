package com.gshl.tea.module.me.fragment;

import android.content.Intent;
import android.databinding.repacked.google.common.base.CaseFormat;
import android.view.View;

import com.gshl.tea.R;
import com.gshl.tea.activity.BaseFragment;
import com.gshl.tea.databinding.MeLayoutBinding;
import com.gshl.tea.module.me.activity.UserManagerActivity;

/**
 * Created by ZengLingWen on 2017/2/21.
 */

public class MeFragment extends BaseFragment implements View.OnClickListener {

    private MeLayoutBinding bind;

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
        bind = (MeLayoutBinding) this.binding;
    }

    private void initView() {

    }

    private void initData() {

    }

    private void initAdapter() {
    }

    private void initEvent() {
        bind.meUserManager.setOnClickListener(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.me_layout;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.me_user_manager:
                jumpToUserManagerPage();
                break;
        }
    }

    private void jumpToUserManagerPage() {
        startActivity(new Intent(getActivity(), UserManagerActivity.class));
    }
}
