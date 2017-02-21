package com.gshl.tea.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.widget.RadioGroup;

import com.gshl.tea.R;
import com.gshl.tea.module.good.activity.GoodFragment;
import com.gshl.tea.module.home.activity.HomeFragment;
import com.gshl.tea.module.me.activity.MeFragment;
import com.gshl.tea.module.order.activity.OrderFragment;
import com.gshl.tea.module.shopCar.activity.ShopCarFragment;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends BaseActivity {

    private List<Fragment> fragments;
    private int lastIndex = -1;

    @Override
    protected void init() {
        fragments = new ArrayList<>();

        Fragment homeFragment = new HomeFragment();
        Fragment goodFragment = new GoodFragment();
        Fragment orderFragment = new OrderFragment();
        Fragment shopCarFragment = new ShopCarFragment();
        Fragment meFragment = new MeFragment();
        fragments.add(homeFragment);
        fragments.add(goodFragment);
        fragments.add(orderFragment);
        fragments.add(shopCarFragment);
        fragments.add(meFragment);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        transaction.add(R.id.fragment_container, meFragment);
        transaction.add(R.id.fragment_container, shopCarFragment);
        transaction.add(R.id.fragment_container, orderFragment);
        transaction.add(R.id.fragment_container, goodFragment);
        transaction.add(R.id.fragment_container, homeFragment);

        transaction.hide(meFragment);
        transaction.hide(shopCarFragment);
        transaction.hide(orderFragment);
        transaction.hide(goodFragment);

        transaction.commit();
        lastIndex = 0;

    }

    @Override
    protected void initEvent() {
        ((RadioGroup) findViewById(R.id.radio_group)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                toggleFragment(getIndex(id));

            }
        });
    }

    private void toggleFragment(int index) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (index != lastIndex) {
            transaction.hide(fragments.get(lastIndex));
            transaction.show(fragments.get(index));
            lastIndex = index;
        }
        transaction.commit();
    }

    private int getIndex(int id) {
        int index = 0;
        switch (id) {
            case R.id.home:
                index = 0;
                break;
            case R.id.good:
                index = 1;
                break;
            case R.id.order:
                index = 2;

                break;
            case R.id.shop_car:
                index = 3;

                break;
            case R.id.me:
                index = 4;

                break;
        }
        return index;
    }

    @Override
    protected void loadData() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }
}
