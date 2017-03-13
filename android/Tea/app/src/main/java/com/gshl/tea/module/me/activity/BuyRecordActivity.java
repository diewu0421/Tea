package com.gshl.tea.module.me.activity;

import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.gshl.tea.BR;
import com.gshl.tea.R;
import com.gshl.tea.activity.BaseActivity;
import com.gshl.tea.adapter.CommonRVAdapter;
import com.gshl.tea.databinding.ActivityBuyRecordBinding;
import com.gshl.tea.databinding.CollectGoodItemBinding;
import com.gshl.tea.module.home.activity.AddShopcarDialogFragment;
import com.gshl.tea.module.home.bean.RecentOrderInfo;
import com.gshl.tea.utils.ToastUtils;

import java.util.ArrayList;
import java.util.List;

public class BuyRecordActivity extends BaseActivity implements CommonRVAdapter.OnItemClickListener, View.OnClickListener {

    private ActivityBuyRecordBinding bind;
    private CommonRVAdapter adapter;
    private List<RecentOrderInfo> mbuyRecords;
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
        bind = (ActivityBuyRecordBinding) this.binding;
        mbuyRecords = new ArrayList<>();
    }

    private void initView() {

    }

    private void initData() {
        for (int i = 0; i < 20; i++) {
            mbuyRecords.add(new RecentOrderInfo(
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
        bind.buyRecordRv.setHasFixedSize(true);
        adapter = new CommonRVAdapter(mbuyRecords, BR.recentOrderInfo, R.layout.buy_record_item);
        adapter.setOnItemClickListener(this);
        bind.setRvAdapter(adapter);
//        RecyclerView.RecycledViewPool pool = bind.buyRecordRv.getRecycledViewPool();

        handler.post(new Runnable() {
            @Override
            public void run() {
//               让RecyclerView来回滚动一下
                bind.buyRecordRv.scrollBy(0,bind.buyRecordRv.getMeasuredHeight());
                bind.buyRecordRv.scrollBy(0,-bind.buyRecordRv.getMeasuredHeight());
            }
        });
    }

    private void initEvent() {
        bind.buyRecordGoback.setOnClickListener(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_buy_record;
    }

    @Override
    public void onItemClick(View view, int position) {
        ToastUtils.showShortToast(this,position + "");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buy_record_goback:
                finish();
                break;
        }
    }
}
