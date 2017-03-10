package com.gshl.tea.activity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.gshl.tea.R;
import com.gshl.tea.adapter.GoodDetailPagerAdapter;
import com.gshl.tea.databinding.ActivityGoodDetailBinding;
import com.gshl.tea.i.MyOnPageChangeListener;
import com.gshl.tea.i.MyOnTabSelectedListener;
import com.gshl.tea.utils.ToastUtils;
import com.youth.banner.Banner;

public class GoodDetailActivity extends BaseActivity implements View.OnClickListener {


    private ActivityGoodDetailBinding bind;
    private TabLayout tabLayout;
    private Banner banner;
    private ViewPager vp;
    private int height;
    private TextView orderCount;

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
        tabLayout = bind.goodDetailTablayout;
        banner = bind.goodDetailBanner;
        vp = bind.goodDetailVp;
        orderCount = bind.goodDetailHidden.goodHiddenOrderCount;

        initTabLayout();
    }

    private void initTabLayout() {
        tabLayout.addTab(tabLayout.newTab().setText(getResources().getString(R.string.good_produce)));
        tabLayout.addTab(tabLayout.newTab().setText(getResources().getString(R.string.good_attachment)));
    }

    private void initData() {

    }

    private void initAdapter() {
        vp.setAdapter(new GoodDetailPagerAdapter(getSupportFragmentManager()));

    }

    private void initEvent() {
        tabLayout.setOnTabSelectedListener(new MyOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vp.setCurrentItem(tab.getPosition(), true);
            }
        });
        vp.setOnPageChangeListener(new MyOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.getTabAt(position).select();
            }
        });
        bind.goodDetailSelect.setOnClickListener(this);
        bind.goodDetailMengban.setOnClickListener(this);
        bind.goodDetailAdd2Car.setOnClickListener(this);
        bind.goodDetailAtOncePay.setOnClickListener(this);
        bind.goodDetailHidden.goodHiddenAdd.setOnClickListener(this);
        bind.goodDetailHidden.goodHiddenReduce.setOnClickListener(this);
        bind.goodDetailHidden.goodHiddenIvBtn.setOnClickListener(this);
        bind.goodDetailHidden.goodHiddenRoot.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            //显示隐藏的商品规格选择布局
            case R.id.good_detail_select:
                showHidden();
                break;
            //点击隐藏商品选择布局
            case R.id.good_hidden_iv_btn:
                closeHidden();
                break;

            //点击蒙版，关闭商品选择布局
            case R.id.good_detail_mengban:
                closeHidden();
                break;
            //点击增加订购数量
            case R.id.good_hidden_add:
                orderCount.setText(Integer.parseInt(orderCount.getText().toString()) + 1 + "");
                break;

            //点击增加订购减少
            case R.id.good_hidden_reduce:
                orderCount.setText(Integer.parseInt(orderCount.getText().toString()) - 1 + "");
                break;

            //点击加入购物车
            case R.id.good_detail_add2_car:
                ToastUtils.showShortToast(this,"加入购物车成功");
                break;

            //点击立即购买 跳转至收银台页面
            case R.id.good_detail_at_once_pay:
                startActivity(new Intent(this,OrderPayActivity.class));
                break;

            case R.id.good_hidden_root:
                Log.e("asdf", "root");
                break;

        }
    }

    private void closeHidden() {
        //得到隐藏的商品选择布局
        final View goodDetailHidden = bind.goodDetailHidden.getRoot();
        //延迟 目的是为了获取该布局的高度
        goodDetailHidden.postDelayed(new Runnable() {
            @Override
            public void run() {
                //获取该布局的高度
                height = goodDetailHidden.getMeasuredHeight();

                final ObjectAnimator animator = ObjectAnimator.ofFloat(goodDetailHidden, "xxx", 1, 0).setDuration(200);
                animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float progress = (float) valueAnimator.getAnimatedValue();
                        //商品选择布局Y轴位移的变化
                        goodDetailHidden.setTranslationY((1 - progress) * height);
                        //蒙版透明度的变化
                        bind.goodDetailMengban.setAlpha((float) (progress * 0.5));

                        //当动画结束时，隐藏蒙版
                        if (progress == 0) {
                            bind.goodDetailMengban.setVisibility(View.INVISIBLE);
                        }
                    }
                });
                //启动动画
                animator.start();
            }
        }, 10);


    }

    private void showHidden() {
        //得到隐藏的商品选择布局
        final View goodDetailHidden = bind.goodDetailHidden.getRoot();
        //先将改布局设置在用户开始就看不到的地方
        goodDetailHidden.setTranslationY(10000);
        //然后显示该布局
        goodDetailHidden.setVisibility(View.VISIBLE);
//        //设置蒙版的显示状态
        bind.goodDetailMengban.setVisibility(View.VISIBLE);

        //延迟 目的是为了获取该布局的高度
        goodDetailHidden.postDelayed(new Runnable() {
            @Override
            public void run() {
                //获取该布局的高度
                height = goodDetailHidden.getMeasuredHeight();

                final ObjectAnimator animator = ObjectAnimator.ofFloat(goodDetailHidden, "xxx", 0, 1).setDuration(200);
                animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float progress = (float) valueAnimator.getAnimatedValue();
                        //商品选择布局Y轴位移的变化
                        goodDetailHidden.setTranslationY((1 - progress) * height);
                        //蒙版透明度的变化
                        bind.goodDetailMengban.setAlpha((float) (progress * 0.5));
                    }
                });
                //启动动画
                animator.start();
            }
        }, 10);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_good_detail;
    }
}