package com.gshl.tea.module.shopCar.fragment;

import android.support.v7.widget.LinearLayoutManager;

import com.gshl.tea.BR;
import com.gshl.tea.R;
import com.gshl.tea.activity.BaseFragment;
import com.gshl.tea.adapter.CommonRVAdapter;
import com.gshl.tea.databinding.ShopCarLayoutBinding;
import com.gshl.tea.module.shopCar.bean.ShopCarInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZengLingWen on 2017/2/21.
 */

public class ShopCarFragment extends BaseFragment {

    private ShopCarLayoutBinding bind;
    private CommonRVAdapter adapter;
    private List<ShopCarInfo> mShopCars;

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
        bind = (ShopCarLayoutBinding) this.binding;
        mShopCars = new ArrayList<>();
    }

    private void initView() {

    }

    private void initData() {
        for (int i = 0; i < 10; i++) {
            mShopCars.add(new ShopCarInfo(
                    "https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=2355881071,3005232681&fm=23&gp=0.jpg",
                    "红茶·高等级祁门红茶特茗 萃取自高山红树叶",
                    "dx1423534623534",
                    "口味：酸甜",
                    "800",
                    i+""

            ));
        }
    }

    private void initAdapter() {
        bind.setRvLinearManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        adapter = new CommonRVAdapter(mShopCars, BR.shopCarInfo,R.layout.shop_car_item);
        bind.setRvAdapter(adapter);
    }

    private void initEvent() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.shop_car_layout;
    }
}