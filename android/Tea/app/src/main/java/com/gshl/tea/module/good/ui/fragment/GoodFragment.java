package com.gshl.tea.module.good.ui.fragment;

import android.content.Intent;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.gshl.tea.BR;
import com.gshl.tea.R;
import com.gshl.tea.activity.BaseFragment;
import com.gshl.tea.activity.GoodDetailActivity;
import com.gshl.tea.adapter.CommonRVAdapter;
import com.gshl.tea.constant.RecyclerViewProperty;
import com.gshl.tea.databinding.GoodLayoutBinding;
import com.gshl.tea.module.good.bean.Category;
import com.gshl.tea.module.good.bean.Good;
import com.gshl.tea.module.good.bean.NormalGood;
import com.gshl.tea.module.good.constant.StartActivityCode;
import com.gshl.tea.module.good.ui.activity.SearchActivity;
import com.gshl.tea.module.good.utils.RequestNetUtils;
import com.gshl.tea.module.good.widgets.CustomHorizontalScrollView;
import com.gshl.tea.utils.AnimatorUtil;
import com.gshl.tea.utils.RecyclerViewPoolUtils;
import com.gshl.tea.utils.ToastUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZengLingWen on 2017/2/21.
 */

public class GoodFragment extends BaseFragment implements View.OnClickListener, Category.OnItemClickListener, CustomHorizontalScrollView.OnScrollChangeListener, CommonRVAdapter.OnItemClickListener{

    private GoodLayoutBinding bind;
    private List<Good> mDataList;
    private ImageView toggle;
    private List<Category> mCategorys;
    private RecyclerView categoryRv;
    private CustomHorizontalScrollView customScroll;
    //存储单个商品的数据集合
    private List<NormalGood> mNormalGoods ;
    //屏幕的宽度
    private int screenWidth;
    //改变商品排列方式的布局控件
    private LinearLayout changeListStyle;
    //scrollView 的x轴的滑动值
    private int customScrollValue;
    private CommonRVAdapter rightRvAdapter;

    @Override
    protected void init() {
        //初始化一些属性
        initializeProperty();
        //初始化控件
        initView();
        //初始化事件
        initEvent();
        //初始化类别
        initCategorys();
        //初始化适配器
        initAdapter();

    }

    private void initializeProperty() {
        bind = (GoodLayoutBinding) this.binding;

        screenWidth = getActivity().getResources().getDisplayMetrics().widthPixels;

        mDataList = new ArrayList<>();
        mCategorys = new ArrayList<>();
        mNormalGoods = new ArrayList<>();
    }


    private void initAdapter() {
        GridLayoutManager manager = new GridLayoutManager(getActivity(), RecyclerViewProperty.GOOD_SPANS, GridLayoutManager.VERTICAL, false);
        manager.setRecycleChildrenOnDetach(true);
        bind.setRvManager(manager);
        bind.goodRv.setHasFixedSize(true);
        rightRvAdapter = new CommonRVAdapter(mDataList, BR.good, R.layout.good_item_layout);
        //监听所有商品的item的点击事件
        rightRvAdapter.setOnItemClickListener(this);
        bind.setGoodAdapter(rightRvAdapter);
        bind.goodRv.setRecycledViewPool(RecyclerViewPoolUtils.getInstance().getRecyclerViewPool());

        LinearLayoutManager leftRvManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        leftRvManager.setRecycleChildrenOnDetach(true);
        bind.setRvManagerLinear(leftRvManager);
        bind.categoryRv.setHasFixedSize(true);
        bind.setCategoryAdapter(new CommonRVAdapter(mCategorys, BR.category,R.layout.category_item));
        bind.categoryRv.setRecycledViewPool(RecyclerViewPoolUtils.getInstance().getRecyclerViewPool());
    }

    private void initCategorys() {
        String[] stringArray = getResources().getStringArray(R.array.category);
//        Collections.addAll(mCategorys, stringArray);
        for (int i = 0; i < stringArray.length; i++) {
            Category category = new Category(stringArray[i]);
            //设置类别的位置
            category.setPosition(mCategorys.size());
            //监听item的点击事件
            category.setOnItemClickListener(this);
            mCategorys.add(category);
        }
    }

    private void initView() {
        toggle = bind.toggleCategory;
        categoryRv = bind.categoryRv;
        customScroll = bind.customScroll;
        customScroll.setClickable(false);
        toggle.setTag(true);
        changeListStyle = bind.hideLayout.changeListStyle;

        //设置商品列表默认为双向排列
        bind.hideLayout.changeListStyle.setTag(true);
    }

    /**
     * 当fragment隐藏状态改变的时候
     * @param hidden
     */
    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
       /* if (!hidden) {
            //当改fragment重新被显示在前端的时候，让侧边导航隐藏掉
            customScroll.scrollTo(customScrollValue,0);
        }else {
            if (customScroll != null) {
                Log.e("scrollValue", customScroll.getScrollX() + "");
                this.customScrollValue = customScroll.getScrollX();
            }
        }*/
    }


    private void initEvent() {
        toggle.setOnClickListener(this);
        customScroll.addOnScrollChangeListener(this);
        bind.hideLayout.changeListStyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNormalRvProperty();
            }
        });
        bind.goodJumpToSeach.setOnClickListener(this);
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
//        customScroll.scrollTo(customScroll.getMMenuWidth(),0);
        if (requestCode == StartActivityCode.GOOD_TO_SEARCH_CODE && resultCode == StartActivityCode.SEARCH_TO_GOOD_CODE) {
            //TODO 得到用户搜索输入的结果
            String result = data.getStringExtra("search_content");
            Log.e("data", result);
            //根据输入结果请求网络
            requestNet(result);
            handlerResult();

            //以布局的形式出现的

        }
    }

    private void requestNet(String result) {
        List<NormalGood> list = RequestNetUtils.loadNormalGoodData(result);
        mNormalGoods.addAll(list);

    }

    private void handlerResult() {
        setNormalRvProperty();
    }

    /**
     *  改变商品列表的排列样式
     */
    private void setNormalRvProperty() {
        if ((boolean) changeListStyle.getTag()) {
            bind.setHideRvManager(new GridLayoutManager(GoodFragment.this.getContext(),RecyclerViewProperty.GOOD_SPANS_DOUBLE ,GridLayoutManager.VERTICAL,false));
            CommonRVAdapter doubleAdapter = new CommonRVAdapter(mNormalGoods, BR.normalGood,R.layout.normal_good_double_item);
            doubleAdapter.setOnItemClickListener(this);
            bind.setNormalRvAdapter(doubleAdapter);
            Log.e("asfasdf", bind.goodRv.getScrollY() + "");
            changeListStyle.setTag(false);
        }else {
            bind.setHideRvManager(new GridLayoutManager(GoodFragment.this.getContext(),RecyclerViewProperty.GOOD_SPANS_SINGLE ,GridLayoutManager.VERTICAL,false));
            CommonRVAdapter singleAdapter = new CommonRVAdapter(mNormalGoods, BR.normalGood,R.layout.normal_good_item);
            singleAdapter.setOnItemClickListener(this);
            bind.setNormalRvAdapter(singleAdapter);
            changeListStyle.setTag(true);
        }
    }

    @Override
    protected void loadData() {

//        Log.e("lazy Load ", "商品列表加载数据中...");
        for (int i = 0; i < 10; i++) {
            Good good = new Good("茶叶" + i, null);
            mDataList.add(good);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            //当切换按钮被点击的时候
            case R.id.toggleCategory:
                customScroll.toggle();
                startRotateAnimation(view);
                break;
            //跳转至搜索界面
            case R.id.good_jumpToSeach:
                startActivityForResult(new Intent(GoodFragment.this.getContext(), SearchActivity.class), StartActivityCode.GOOD_TO_SEARCH_CODE);
                break;
        }
    }

    private void startRotateAnimation(final View view) {
        if (!(boolean) view.getTag()) {
            AnimatorUtil.getInstance().startRotate(view, "rotate", 100, 0, 90);
        } else {
            AnimatorUtil.getInstance().startRotate(view, "rotate", 100, 90, 0);
        }
    }

    @Override
    public void onScrollChange(boolean isDragByUser, int l, int t, int oldl, int oldt) {
        if (isDragByUser) {
            float value = (float) (-90.0 / customScroll.getMMenuWidth() * l + 90);

            toggle.setRotation(value);

            //设置为打开状态
            if (value == 90.0) {
                toggle.setTag(true);
            }

            //设置为关闭状态
            if (value == 0) {
                toggle.setTag(false);
            }
        }
    }

    @Override
    public void onCategoryItemClick(View view, int position) {
        //先清除所有item的选中效果
        for (int i = 0; i < mCategorys.size(); i++) {
            mCategorys.get(i).setClick(false);
        }
        mCategorys.get(position).setClick(true);
    }

    /**
     * 当点击分类下的item的回调
     * @param view
     * @param position
     */
    @Override
    public void onItemClick(View view, int position) {
        switch (view.getId()) {
            case R.id.all_good:
                ToastUtils.showShortToast(getActivity(),"分类下的item的点击的回调");
                customScroll.close();
                toggle.setRotation(0);
                toggle.setTag(false);
                customScroll.smoothScrollTo(customScroll.getMMenuWidth() + screenWidth,0);
                break;

            case R.id.normal_good_single:
                ToastUtils.showShortToast(getActivity(),"单个排列的商品的点击回调");
                //TODO 跳转至商品详情页面
                startActivity(new Intent(getActivity(), GoodDetailActivity.class));
                break;

            case R.id.normal_good_double:
                ToastUtils.showShortToast(getActivity(),"双排列的商品的点击及回调");
                //TODO 跳转至商品详情页面
                startActivity(new Intent(getActivity(), GoodDetailActivity.class));
                break;
        }
    }


    @Override
    protected int getLayoutId() {
        return R.layout.good_layout;
    }

}
