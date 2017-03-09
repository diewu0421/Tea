package com.gshl.tea.activity;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;
import android.widget.RadioGroup;

import com.gshl.tea.R;
import com.gshl.tea.databinding.ActivityOrderPayBinding;
import com.gshl.tea.fragment.PayInlineFragment;
import com.gshl.tea.fragment.PayOutlineFragment;

public class OrderPayActivity extends BaseActivity implements RadioGroup.OnCheckedChangeListener {

    private ActivityOrderPayBinding bind;
    private FrameLayout container;

    @Override
    protected void init() {
        //初始化一些属性
        initProperty();
        //初始化控件
        initView();
        //初始化fragment
        initFragment();
        //初始化事件
        initEvent();
    }

    private void initFragment() {
        addFragment(1);
    }


    private void initProperty() {
        bind = (ActivityOrderPayBinding) this.binding;

    }

    private void initView() {
        container = bind.orderPayFragmentContainer;

    }

    private void initEvent() {
        bind.orderPayWayGroup.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        int position = 0;
        switch (checkedId) {
            case R.id.order_pay_inline:
                position = 0;
                break;

            case R.id.order_pay_outline:
                position = 1;
                break;
        }
        addFragment(position);
    }

    private int lastIndex = -1;
    private Fragment[] fragments = new Fragment[2];


    /**
     * 点击按钮添加 或者 显示 或者隐藏fragment
     * @param position
     */
    private void addFragment(int position) {

        if (lastIndex == position) {
            return ;
        }

        FragmentTransaction transaction =
                getSupportFragmentManager().beginTransaction();
        if (lastIndex != -1) {
            transaction.hide(fragments[lastIndex]);
        }

        if (fragments[position] == null) {

            switch (position) {
                case 0:
                    fragments[position] = new PayInlineFragment();
                    break;

                case 1:
                    fragments[position] = new PayOutlineFragment();
                    break;
            }
            transaction.add(R.id.order_pay_fragment_container,fragments[position]);
        } else {
            transaction.show(fragments[position]);
        }

        transaction.commit();
        lastIndex = position;

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_order_pay;
    }
}
