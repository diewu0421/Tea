package com.gshl.tea.activity;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ZengLingWen on 2017/2/21.
 */

public abstract class BaseFragment extends Fragment {

    private int position1;
    protected boolean isVisible;
    protected ViewDataBinding binding;

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        position1 = getArguments().getInt("position");
        if (isVisibleToUser) {
            isVisible = true;
            onVisible();
        } else {
            isVisible = false;
            onInVisible();
        }
        Log.e("BaseFragment", "setUserVisibleHint  position  " + position1 + isVisibleToUser);
        super.setUserVisibleHint(isVisibleToUser);
    }

    //当fragment可见的时候
    protected void onInVisible() {

    }

    //当fragment不可见的时候
    protected void onVisible() {

    }

    @Override
    public boolean getUserVisibleHint() {
        int position = getArguments().getInt("position");
        Log.e("BaseFragment", "getUserVisibleHint  position  " + position);
        return super.getUserVisibleHint();
    }

    protected boolean isPrepared;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(), container, false);
//        binding = DataBindingUtil.bind(view);
        isPrepared = true;
        lazyLoad();

        return view;
    }

    protected abstract void init();

    protected void loadData(){}

    private void lazyLoad() {
        if (!isPrepared || !isVisible) return;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding = DataBindingUtil.bind(view);
        init();
        loadData();
        fillData();
    }

    //
    protected void fillData(){}

    protected abstract int getLayoutId();
}
