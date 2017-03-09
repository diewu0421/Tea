package com.gshl.tea.module.home.activity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.view.ViewGroup;

import com.gshl.tea.BR;
import com.gshl.tea.R;
import com.gshl.tea.activity.BaseActivity;
import com.gshl.tea.adapter.CommonRVAdapter;
import com.gshl.tea.databinding.ActivityRecentOrderBinding;
import com.gshl.tea.databinding.CollectGoodItemBinding;
import com.gshl.tea.module.home.bean.RecentOrderInfo;
import com.gshl.tea.utils.ToastUtils;
import com.se7en.utils.DeviceUtils;

import java.util.ArrayList;
import java.util.List;


public class RecentOrderActivity extends BaseActivity implements CommonRVAdapter.OnItemClickListener, View.OnClickListener, AddShopcarDialogFragment.OnDialogViewClickListener {


    private ActivityRecentOrderBinding bind;
    private CommonRVAdapter adapter;
    private List<RecentOrderInfo> mRecentOrders;
    private CollectGoodItemBinding itemBinding;

    private Handler handler = new Handler();

    //是否打开了多选框
    private boolean isNeedOpenChoice;
    private AddShopcarDialogFragment shopcarDialogFragment;

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
        bind = (ActivityRecentOrderBinding) this.binding;
        mRecentOrders = new ArrayList<>();
    }

    private void initView() {

    }

    private void initData() {
        for (int i = 0; i < 20; i++) {
            mRecentOrders.add(new RecentOrderInfo(
                    "http://b.hiphotos.baidu.com/baike/w%3D268%3Bg%3D0/sign=00e9a72fb23533faf5b6942890e89a22/3c6d55fbb2fb43167413545b23a4462309f7d386.jpg",
                    "红茶·高等级祁门红茶特茗 萃取自高山红树叶",
                    i + "个规格可选",
                    "口味：酸甜",
                    "赠",
                    "800"
            ));
        }
    }

    private void initAdapter() {
        final LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        manager.setRecycleChildrenOnDetach(true);
        bind.setRvLinearManager(manager);
        //如果可以确定每个item的高度是固定的，设置这个选项可以提高性能
        bind.recentOrderRv.setHasFixedSize(true);
        adapter = new CommonRVAdapter(mRecentOrders, BR.recentOrderInfo,R.layout.recent_order_item);
        adapter.setOnItemClickListener(this);
        bind.setRvAdapter(adapter);
//        RecyclerView.RecycledViewPool pool = bind.recentOrderRv.getRecycledViewPool();

        handler.post(new Runnable() {
            @Override
            public void run() {
//               让RecyclerView来回滚动一下
                bind.recentOrderRv.scrollBy(0,bind.recentOrderRv.getMeasuredHeight());
                bind.recentOrderRv.scrollBy(0,-bind.recentOrderRv.getMeasuredHeight());
            }
        });
    }

    private void initEvent() {
        bind.recentOrderGoback.setOnClickListener(this);
        bind.recentOrderBottomBtn.setOnClickListener(this);
        bind.recentOrderAddToShopcar.setOnClickListener(this);
        bind.recentOrderSelectAll.setOnClickListener(this);
    }


    private void toggle(boolean isNeedOpenChoice) {
        if (isNeedOpenChoice) {
            //如果需要打开多选框，则打开多选框
            changeState(isNeedOpenChoice,View.INVISIBLE,View.VISIBLE);
        } else {
            //如果不需要打开多选框，则还原
            changeState(isNeedOpenChoice,View.VISIBLE,View.GONE);
        }
    }


    private void changeState(boolean isNeedOpenChoice, int shopCarState, int bottomBtnState) {
        for (int i = 0; i < adapter.getmItemBindings().size(); i++) {
            //打开每个item的多选框
            openOrCloseChoice(((CollectGoodItemBinding) adapter.getmItemBindings().get(i)).collectGoodIv,isNeedOpenChoice);
            //隐藏每个item的购车车按钮
            setShopCarVisible(((CollectGoodItemBinding) adapter.getmItemBindings().get(i)).collectGoodShopCar, shopCarState);
            //显示底部的 全选 和 移除收藏夹  两个按钮
            bind.recentOrderBottomBtn.setVisibility(bottomBtnState);
        }
    }

    private void setShopCarVisible(View view,int visible) {
        view.setVisibility(visible);
    }

    /**
     * 打开多选框
     * @param v
     * @param b
     */
    private void openOrCloseChoice(final View v, boolean b) {
        ObjectAnimator animator;
        if (b){
            animator = ObjectAnimator.ofFloat(v, "xxx", 0, 1).setDuration(100);
        }else {
            animator = ObjectAnimator.ofFloat(v, "xxx", 1, 0).setDuration(100);
        }
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float progress = (float) valueAnimator.getAnimatedValue();
                ViewGroup.LayoutParams itemParams = v.getLayoutParams();
                itemParams.width = (int) (DeviceUtils.dip2px(20) * progress);
                v.setLayoutParams(itemParams);
            }
        });
        animator.start();
    }

    @Override
    public void onItemClick(View view, int position) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //点击购物车
            case R.id.recent_order_add_to_shopcar:
                shopcarDialogFragment = new AddShopcarDialogFragment();
                shopcarDialogFragment.show(getSupportFragmentManager(),"add_to_shopcar");
                shopcarDialogFragment.setOnDialogViewClickListener(this);
                break;

            //点击选择所有
            case R.id.recent_order_select_all:

                break;
        }
    }

    @Override
    public void onDialogViewClick(View view) {
        switch (view.getId()) {
            //点击对话框的确定
            case R.id.add_to_shopcar_confirm:
                ToastUtils.showShortToast(this,"添加到购物车成功");
                shopcarDialogFragment.dismiss();
                break;
            //点击对话框的取消
            case R.id.add_to_shopcar_cancel:
                shopcarDialogFragment.dismiss();

                break;
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_recent_order;
    }
}
