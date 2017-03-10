package com.gshl.tea.module.good.ui.activity;

import com.gshl.tea.R;
import com.gshl.tea.activity.BaseActivity;
import com.gshl.tea.databinding.ActivityGoodDetailBinding;

public class GoodDetailActivity extends BaseActivity {


    private ActivityGoodDetailBinding bind;

    @Override
    protected void init() {

        //初始化一些属性
        initProperty();
        //初始化控件
        initView();
        //初始化数据
        initData();
        //初始化适配器
        initAdapter();
        //初始化事件
        initEvent();
    }

    private void initProperty() {
        bind = (ActivityGoodDetailBinding) this.binding;

    }

    private void initView() {

    }

    private void initData() {

    }

    private void initAdapter() {

    }

    private void initEvent() {
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_good_detail;
    }
}