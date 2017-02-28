package com.gshl.tea.module.good.ui.fragment;

import android.content.Intent;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.gshl.tea.BR;
import com.gshl.tea.R;
import com.gshl.tea.activity.BaseFragment;
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

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZengLingWen on 2017/2/21.
 */

public class GoodFragment extends BaseFragment implements View.OnClickListener, Category.OnItemClickListener, CustomHorizontalScrollView.OnScrollChangeListener {

    private GoodLayoutBinding bind;
    private List<Good> mDataList;
    private ImageView toggle;
    private List<Category> mCategorys;
    private RecyclerView categoryRv;
    private CustomHorizontalScrollView customScroll;
    //存储单个商品的数据集合
    private List<NormalGood> mNormalGoods ;

    @Override
    protected void init() {
        //初始化一些属性
        initializeProperty();
        //初始化控件
        initView();
        //初始化类别
        initCategorys();
        initAdapter();

    }

    private void initAdapter() {
        bind.setRvManager(new GridLayoutManager(getActivity(), RecyclerViewProperty.GOOD_SPANS, GridLayoutManager.VERTICAL, false));
        bind.setGoodAdapter(new CommonRVAdapter(mDataList,BR.category, R.layout.good_item_layout));

        bind.setRvManagerLinear(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        bind.setCategoryAdapter(new CommonRVAdapter(mCategorys, BR.category,R.layout.category_item));
    }

    private void initializeProperty() {
        bind = (GoodLayoutBinding) this.binding;
        mDataList = new ArrayList<>();
        mCategorys = new ArrayList<>();
        mNormalGoods = new ArrayList<>();
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
        categoryRv = bind.categoryId;
        customScroll = bind.customScroll;
        toggle.setTag(false);

        //初始化事件
        initEvent();

    }

    private void initEvent() {
        toggle.setOnClickListener(this);
        customScroll.addOnScrollChangeListener(this);
        bind.setJumpToSeach(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                GoodFragment.this.getActivity().startActivityForResult(new Intent(GoodFragment.this.getContext(), SearchActivity.class), StartActivityCode.GOOD_TO_SEARCH_CODE);
                startActivityForResult(new Intent(GoodFragment.this.getContext(), SearchActivity.class), StartActivityCode.GOOD_TO_SEARCH_CODE);
            }
        });
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        customScroll.scrollTo(customScroll.getMMenuWidth(),0);
        if (requestCode == StartActivityCode.GOOD_TO_SEARCH_CODE && resultCode == StartActivityCode.SEARCH_TO_GOOD_CODE) {
            //TODO 得到用户搜索输入的结果
            String result = data.getStringExtra("search_content");
            Log.e("data", result);
            //根据输入结果请求网络
            requestNet(result);
            handlerResult();
        }
    }

    private void requestNet(String result) {
        List<NormalGood> list = RequestNetUtils.loadNormalGoodData(result);
        mNormalGoods.addAll(list);

    }

    private void handlerResult() {
        bind.allShopBtn.setVisibility(View.GONE);
        bind.filterContainer.setVisibility(View.VISIBLE);
        bind.setRvManager(new GridLayoutManager(GoodFragment.this.getContext(),RecyclerViewProperty.GOOD_SPANS_DOUBLE,LinearLayoutManager.VERTICAL,false));
        bind.setGoodAdapter(new CommonRVAdapter(mNormalGoods, BR.normalGood,R.layout.normal_good_item));
    }

    @Override
    protected void loadData() {

//        Log.e("lazy Load ", "商品列表加载数据中...");
        for (int i = 0; i < 10; i++) {
            Good good = new Good("茶叶" + i, null);
            good.setPosition(mDataList.size());
            mDataList.add(good);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.toggleCategory:
                customScroll.toggle();
                startRotateAnimation(view);
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
    public void onItemClick(View view, int position) {
        //先清除所有item的选中效果
        for (int i = 0; i < mCategorys.size(); i++) {
            mCategorys.get(i).setClick(false);
        }
        //给指定的item设置点击效果
        mCategorys.get(position).setClick(true);
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
    protected int getLayoutId() {
        return R.layout.good_layout;
    }

}
