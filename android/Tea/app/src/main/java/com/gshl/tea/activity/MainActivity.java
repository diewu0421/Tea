package com.gshl.tea.activity;

import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.widget.RadioGroup;

import com.gshl.tea.MyApp;
import com.gshl.tea.R;
import com.gshl.tea.constant.RequestUrl;
import com.gshl.tea.databinding.ActivityMainBinding;
import com.gshl.tea.module.good.ui.fragment.GoodFragment;
import com.gshl.tea.module.home.activity.HomeFragment;
import com.gshl.tea.module.me.fragment.MeFragment;
import com.gshl.tea.module.order.ui.fragment.OrderFragment;
import com.gshl.tea.module.shopCar.fragment.ShopCarFragment;
import com.gshl.tea.utils.LogUtils;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;


public class MainActivity extends BaseActivity {

    private List<Fragment> fragments;
    private int lastIndex = -1;
    public ActivityMainBinding bind;
    public DrawerLayout mainDrawer;
    public NavigationView navigationView;

    @Override
    protected void init() {
        OkHttpUtils
                .get()
                .tag(MyApp.getInstance())
                .url(RequestUrl.BASE_URL + " /api/user/findCustomerMoney")
                .addParams("customerId", 2 + "")
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        LogUtils.e("oerr = ");

                    }

                    @Override
                    public void onResponse(String response, int id) {
                        LogUtils.e("result = " + response);
                    }
                });
        initProperty();
        //初始化为view
        initView();
        //初始化事件
        initEvent();
        //初始化fragment
        initFragment();

    }

    private void initProperty() {
        bind = (ActivityMainBinding) this.binding;
    }


    private void initFragment() {
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

    private void initView() {
        mainDrawer = bind.mainDrawer;
        navigationView = bind.navigationView;

    }

    protected void initEvent() {
        bind.radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                toggleFragment(getIndex(id));
            }
        });
    }

    public void toggleFragment(final int index) {
        if (index != lastIndex) {
            final FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.hide(fragments.get(lastIndex));
            transaction.show(fragments.get(index));
            lastIndex = index;
            transaction.commit();
        }
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
