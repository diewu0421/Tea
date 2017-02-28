package com.gshl.tea.module.good.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.gshl.tea.BR;
import com.gshl.tea.R;
import com.gshl.tea.activity.BaseActivity;
import com.gshl.tea.adapter.CommonRVAdapter;
import com.gshl.tea.constant.RecyclerViewProperty;
import com.gshl.tea.databinding.ActivitySearchBinding;
import com.gshl.tea.databinding.HistoryHeadBinding;
import com.gshl.tea.module.good.bean.History;
import com.gshl.tea.module.good.bean.HistoryHead;
import com.gshl.tea.module.good.constant.StartActivityCode;
import com.gshl.tea.utils.ShowToast;
import com.gshl.tea.utils.StatusBarCompat;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends BaseActivity implements CommonRVAdapter.OnItemClickListener {

    private List<History> mDataList;
    private ActivitySearchBinding bind;
    private EditText et;
    private RecyclerView historyRv;
    private CommonRVAdapter rvAdapter;

    @Override
    protected void init() {
        StatusBarCompat.compat(this, getResources().getColor(R.color.bg_color_f4f4f4));
        bind = (ActivitySearchBinding) this.binding;
        mDataList = new ArrayList<>();
        initView();
        initData();

        bind.setRvManagerLinear(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rvAdapter = new CommonRVAdapter(mDataList, BR.history, R.layout.history_head, R.layout.history_item) {
            /**
             * 获取头部的DataBinding的变量值
             * @return
             */
            @Override
            protected int getHeadVariabled() {
                return BR.historyHead;
            }

            /**
             * 获取头部对象
             * @return
             */
            @Override
            protected Object getHeadValue() {
                HistoryHead historyHead = new HistoryHead();
                return historyHead;
            }

            /**
             * 获得头部视图中的子视图对象
             * @param binding
             * @return
             */
            @Override
            protected View getHeadView(ViewDataBinding binding) {
                return ((HistoryHeadBinding) binding).clearHistory;
            }

            /**
             * 设置头部子视图被点击的监听器
             * @return
             */
            @Override
            protected View.OnClickListener getHeadItemViewClickListener() {
                return new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //清空购物车
                        ShowToast.showShortToast(SearchActivity.this, getResources().getString(R.string.clear_history));
                        //讲当前的数据集合个数用变量先存储起来
                        int count = mDataList.size();
                        //清空数据集合
                        mDataList.clear();
                        //刷新recyclerview界面，带动画
                        notifyItemRangeRemoved(RecyclerViewProperty.HISTORY_HEAD_COUNT,count);
                    }
                };
            }
        };
        rvAdapter.setOnItemClickListener(this);
        bind.setHistoryRVAdapter(rvAdapter);

    }

    private void initView() {
        et = bind.historyEt;
        historyRv = bind.historyRv;
    }

    @Override
    protected void initEvent() {
        bind.setGoBack(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        historyRv.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                isActive(et);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
            }
        });
    }


    //判断输入法是否弹出，如果弹出，则关闭输入法
    private boolean isActive(EditText et) {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        if (inputMethodManager.isActive(et)) {
            bind.getRoot().requestFocus();
            inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
            return true;
        }

        return false;
    }

    private void initData() {
        for (int i = 0; i < 10; i++) {
            History history = new History("content " + i);
            mDataList.add(history);
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_search;
    }

    @Override
    public void onItemClick(View view, int position) {
        ShowToast.showShortToast(this, "position = " + position + "   content " + ((TextView) ((ViewGroup) view).getChildAt(0)).getText());
        //判断有没有打开输入法，如果已经打开，当点击item的时候把输入法给关掉
        isActive(et);
        et.setText(mDataList.get(position - RecyclerViewProperty.HISTORY_HEAD_COUNT).getContent());
        //TODO 然后联网请求数据
        Intent data = new Intent();
        data.putExtra("search_content", et.getText().toString());
        setResult(StartActivityCode.SEARCH_TO_GOOD_CODE,data);
        finish();
    }

}
