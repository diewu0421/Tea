package com.gshl.tea.module.good.activity;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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
import com.gshl.tea.utils.AnimatorUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZengLingWen on 2017/2/21.
 */

public class GoodFragment extends BaseFragment implements View.OnClickListener, Category.OnItemClickListener {

    private GoodLayoutBinding bind;
    private List<Good> mDataList;
    private ImageView toggle;
    private List<Category> mCategorys;
    private RecyclerView categoryRv;

    @Override
    protected void init() {
        bind = (GoodLayoutBinding) this.binding;
        initView();
        mDataList = new ArrayList<>();
        mCategorys = new ArrayList<>();
        //初始化类别
        initCategorys();
        bind.setRvManager(new GridLayoutManager(getActivity(), RecyclerViewProperty.GOOD_SPANS, GridLayoutManager.VERTICAL, false));
        bind.setGoodAdapter(new CommonRVAdapter(mDataList, R.layout.good_item_layout, BR.good));

        bind.setRvManagerLinear(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        bind.setCategoryAdapter(new CommonRVAdapter(mCategorys, R.layout.category_item, BR.category));
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
        toggle = (ImageView) bind.getRoot().findViewById(R.id.toggleCategory);
        categoryRv = (RecyclerView) bind.getRoot().findViewById(R.id.category_id);
        toggle.setTag(false);
        toggle.setOnClickListener(this);
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
    protected void fillData() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.good_layout;
    }


    @Override
    public void onClick(View view) {
        startRotateAnimation(view);

    }

    private void startRotateAnimation(final View view) {
        if (!(boolean) view.getTag()) {
            view.setTag(true);
            AnimatorUtil.getInstance().startRotate(view, "rotate", 300, 0, 90,categoryRv,150);
        } else {
            view.setTag(false);
            AnimatorUtil.getInstance().startRotate(view, "rotate", 300, 90, 0,categoryRv,0);
        }
    }

    @Override
    public void onItemClick(View view, int position) {
        //先清除item的选中效果
        for (int i = 0; i < mCategorys.size(); i++) {
            mCategorys.get(i).setClick(false);
        }
        //给指定的item设置点击效果
        mCategorys.get(position).setClick(true);
    }
}
