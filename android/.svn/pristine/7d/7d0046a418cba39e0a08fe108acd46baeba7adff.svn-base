package com.gshl.tea.module.order.ui.activity;


import android.view.View;

import com.gshl.tea.R;
import com.gshl.tea.activity.BaseActivity;
import com.gshl.tea.databinding.ActivityOrderDetailBinding;
import com.gshl.tea.module.order.utils.IntentUtils;

public class OrderDetailActivity extends BaseActivity implements View.OnClickListener {

    private ActivityOrderDetailBinding bind;

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
        bind = (ActivityOrderDetailBinding) this.binding;
    }

    private void initView() {

    }

    private void initData() {

    }

    private void initAdapter() {

    }

    private void initEvent() {
        bind.orderDetailGoodList.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            //商品清单按钮
            case R.id.order_detail_good_list:
                IntentUtils.launchActivity(this,GoodListActivity.class);

                break;
            //返回按钮
            case R.id.order_detail_goback:
                finish();
                break;
        }
    }


    @Override
    protected int getLayoutId() {
        return R.layout.activity_order_detail;
    }

}
