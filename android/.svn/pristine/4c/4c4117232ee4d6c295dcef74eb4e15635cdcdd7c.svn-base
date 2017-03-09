package com.gshl.tea.module.order.ui.fragment;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Environment;
import android.support.v4.view.GravityCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.gshl.tea.BR;
import com.gshl.tea.R;
import com.gshl.tea.activity.BaseFragment;
import com.gshl.tea.activity.MainActivity;
import com.gshl.tea.adapter.CommonRVAdapter;
import com.gshl.tea.databinding.OrderFiterBinding;
import com.gshl.tea.databinding.OrderLayoutBinding;
import com.gshl.tea.databinding.OrderRvItemBinding;
import com.gshl.tea.module.order.bean.OrderList;
import com.gshl.tea.module.order.ui.activity.OrderDetailActivity;
import com.gshl.tea.module.order.utils.AnimatorUtil;
import com.gshl.tea.module.order.utils.IntentUtils;
import com.gshl.tea.utils.ToastUtils;
import com.gshl.tea.utils.StatusBarCompat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZengLingWen on 2017/2/21.
 */

public class OrderFragment extends BaseFragment implements CommonRVAdapter.OnItemClickListener, View.OnClickListener {


    private OrderLayoutBinding bind;
    //存储订单列表的集合
    private List<OrderList> mOrderList;
    private CommonRVAdapter adapter;
    private OrderFiterBinding filterBinding;
    //隐藏的订单状态是否已经被打开
    private boolean isOpenOrderStatu;
    //隐藏的付款状态是否已经被打开
    private boolean isOpenPayStatu;

    @Override
    protected void init() {
        //初始化一些属性
        initializeProperty();
        //初始化控件
        initView();
        //初始化数据
        initData();
        //初始化类别
        initAdapter();
        //初始化事件
        initEvent();

    }

    private void initializeProperty() {
        bind = (OrderLayoutBinding) this.binding;
        mOrderList = new ArrayList<>();
        //添加筛选页面的view
//        filterView = LayoutInflater.from(getActivity()).inflate(R.layout.order_fiter, ((MainActivity) getActivity()).navigationView,false);
        filterBinding = DataBindingUtil.inflate(LayoutInflater.from(getActivity()), R.layout.order_fiter, ((MainActivity) getActivity()).navigationView, false);
        filterBinding.getRoot().setPadding(0 , StatusBarCompat.getStatusBarHeight(getActivity()),0,0);
        ((MainActivity) getActivity()).navigationView.addView(filterBinding.getRoot());
    }

    private void initView() {
    }

    private void initAdapter() {
        bind.setOrderLineManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        adapter = new CommonRVAdapter(mOrderList, BR.orderList, R.layout.order_rv_item){
            @Override
            protected void setOnViewClick(ViewDataBinding holder,int position) {
                //设置 立即付款的点击按钮的posiiton，下面点击事件要用到
                ((OrderRvItemBinding) holder).atOncePayment.setTag(position);
                ((OrderRvItemBinding) holder).atOncePayment.setOnClickListener(OrderFragment.this);

                //设置 再次购买的点击按钮的posiiton，下面点击事件要用到
                ((OrderRvItemBinding) holder).againBuy.setTag(position);
                ((OrderRvItemBinding) holder).againBuy.setOnClickListener(OrderFragment.this);
            }
        };
        bind.setOrderAdapter(adapter);
    }

    private void initEvent() {
        adapter.setOnItemClickListener(this);
        bind.orderFilter.setOnClickListener(this);
        filterBinding.showOrderStatu.setOnClickListener(this);
        filterBinding.showPayStatu.setOnClickListener(this);
        setHideChildClickListener();
    }

    private void setHideChildClickListener() {
        for (int i = 0; i < filterBinding.filterOrderStatuHide.getChildCount(); i++) {
            filterBinding.filterOrderStatuHide.getChildAt(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    filterBinding.orderStatuTv.setText(((TextView) view).getText());
                    AnimatorUtil.stretchView(filterBinding.filterOrderStatuHide,isOpenOrderStatu);
                    isOpenOrderStatu = !isOpenOrderStatu;
                    setArrowDirection(filterBinding.orderStatuArrow,isOpenOrderStatu);
                }
            });
        }

        for (int i = 0; i < filterBinding.filterPayStatuHide.getChildCount(); i++) {
            filterBinding.filterPayStatuHide.getChildAt(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    filterBinding.payStatuTv.setText(((TextView) view).getText());
                    AnimatorUtil.stretchView(filterBinding.filterPayStatuHide,isOpenPayStatu);
                    isOpenPayStatu = !isOpenPayStatu;
                    setArrowDirection(filterBinding.payStatuArrow,isOpenPayStatu);
                }
            });
        }
    }

    private void initData(){
        for (int i = 0; i < 20; i++) {
            OrderList orderList = new OrderList();
            orderList.orderCount.set(i);
            mOrderList.add(orderList);
        }
    }

    /**
     * 当订单item被点击的回调
     * @param view
     */
    @Override
    public void onItemClick(View view, int position) {
        IntentUtils.launchActivity(getActivity(), OrderDetailActivity.class);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            //点击再次购买
            case R.id.at_once_payment:
                ToastUtils.showShortToast(getContext(), ((TextView) view).getText().toString() + " position = " + view.getTag().toString());
                break;
            //点击再次购买
            case R.id.again_buy:
                ToastUtils.showShortToast(getContext(), ((TextView) view).getText().toString() + " position = " + view.getTag().toString());
                break;
            //点击筛选按钮
            case R.id.order_filter:
                openDrawer();
                break;

            //点击显示订单状态所有状态
            case R.id.show_order_statu:
                stretchOrderStatu();
                break;

            //点击显示支付状态所有状态
            case R.id.show_pay_statu:
                stretchPayStatu();
                break;
        }
    }

    private void stretchPayStatu() {
        AnimatorUtil.stretchView(filterBinding.filterPayStatuHide,isOpenPayStatu);
        isOpenPayStatu = !isOpenPayStatu;
        setArrowDirection(filterBinding.payStatuArrow,isOpenPayStatu);
    }

    private void setArrowDirection(View view,boolean isOpen) {
        if (isOpen) {
            view.setRotation(180);
        }else {
            view.setRotation(0);
        }
    }

    private void stretchOrderStatu() {
        AnimatorUtil.stretchView(filterBinding.filterOrderStatuHide,isOpenOrderStatu);
        isOpenOrderStatu = !isOpenOrderStatu;
        setArrowDirection(filterBinding.orderStatuArrow,isOpenOrderStatu);

    }

    private void openDrawer() {
        ((MainActivity) getActivity()).mainDrawer.openDrawer(GravityCompat.END,true);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.order_layout;
    }
}
