package com.gshl.tea.module.home.activity;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.gshl.tea.BR;
import com.gshl.tea.R;
import com.gshl.tea.activity.BaseActivity;
import com.gshl.tea.adapter.CommonRVAdapter;
import com.gshl.tea.databinding.ActivityMessageBinding;
import com.gshl.tea.module.home.bean.Message;

import java.util.ArrayList;
import java.util.List;

public class MessageActivity extends BaseActivity implements View.OnClickListener, CommonRVAdapter.OnItemClickListener {

    private ActivityMessageBinding bind;
    private CommonRVAdapter adapter;
    private List<Message> mMessageLists;

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
        bind = (ActivityMessageBinding) this.binding;
        mMessageLists = new ArrayList<>();
    }

    private void initView() {

    }

    private void initData() {
        //模拟一些数据
        for (int i = 0; i < 10; i++) {
            mMessageLists.add(new Message("业务消息" + i, null, "09:44", "您的订单1011151412已发货，点击查看详情！"));
        }
    }

    private void initAdapter() {
        bind.setRvLinearManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        adapter = new CommonRVAdapter(mMessageLists, BR.message, R.layout.message_item);
        adapter.setOnItemClickListener(this);
        bind.setRvAdapter(adapter);

    }

    private void initEvent() {
        bind.messageListGoback.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.message_list_goback:
                finish();
                break;
        }
    }

    @Override
    public void onItemClick(View view, int position) {
        startActivity(new Intent(this,SystemNotificationActivity.class));
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_message;
    }
}
