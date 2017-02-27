package com.gshl.tea.module.good.ui.activity;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import com.gshl.tea.BR;
import com.gshl.tea.R;
import com.gshl.tea.activity.BaseActivity;
import com.gshl.tea.adapter.CommonRVAdapter;
import com.gshl.tea.databinding.ActivitySearchBinding;
import com.gshl.tea.module.good.bean.History;
import com.gshl.tea.module.good.bean.HistoryHead;
import com.gshl.tea.utils.StatusBarCompat;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends BaseActivity implements History.OnItemClickListener, HistoryHead.OnClearHistoryListener {

    private List<History> mDataList;
    private ActivitySearchBinding bind;
    private EditText et;
    private RecyclerView historyRv;

    @Override
    protected void init() {
        StatusBarCompat.compat(this, getResources().getColor(R.color.bg_color_f4f4f4));
        bind = (ActivitySearchBinding) this.binding;
        mDataList = new ArrayList<>();
        initView();
        initData();

        bind.setRvManagerLinear(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        bind.setHistoryRVAdapter(new CommonRVAdapter(mDataList, BR.history, R.layout.history_head, R.layout.history_item) {
            @Override
            protected int getHeadVariabled() {
                return BR.historyHead;
            }

            @Override
            protected Object getHeadValue() {
                HistoryHead historyHead = new HistoryHead();
                historyHead.setOnClearHistoryListener(SearchActivity.this);
                return historyHead;
            }
        });
    }

    private void initView() {
        et = (EditText) bind.getRoot().findViewById(R.id.history_et);
        historyRv = (RecyclerView) bind.getRoot().findViewById(R.id.history_rv);
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
            history.setOnItemClickListener(this);
            mDataList.add(history);
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_search;
    }

    @Override
    public void onItemClick(View view) {
        InputMethodManager inputManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inputManager.hideSoftInputFromWindow(et.getWindowToken(), 0);
    }

    //当点击清空购物车的回调
    @Override
    public void onClearHistory() {
        Log.e("onclearhistory", "清空钱" + mDataList.size());
        mDataList.clear();
        Log.e("onclearhistory", "清空后" + mDataList.size());

    }

}
