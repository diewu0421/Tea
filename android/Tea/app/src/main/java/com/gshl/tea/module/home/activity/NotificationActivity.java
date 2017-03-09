package com.gshl.tea.module.home.activity;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.gshl.tea.BR;
import com.gshl.tea.R;
import com.gshl.tea.activity.BaseActivity;
import com.gshl.tea.adapter.CommonRVAdapter;
import com.gshl.tea.databinding.ActivityNotificationBinding;
import com.gshl.tea.module.home.bean.Notification;
import com.gshl.tea.module.home.bean.NotificationDetail;

import java.util.ArrayList;
import java.util.List;

public class NotificationActivity extends BaseActivity implements CommonRVAdapter.OnItemClickListener, View.OnClickListener {

    private ActivityNotificationBinding bind;
    private List<Notification> mNotificationLists;

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
        bind = (ActivityNotificationBinding) this.binding;
        mNotificationLists = new ArrayList<>();
    }

    private void initView() {

    }

    private void initData() {
        for (int i = 0; i < 10; i++) {
            mNotificationLists.add(new Notification(
                    "员工请假制度已发生变更了",
                    "2017-01-17"
            ));
        }
    }

    private void initAdapter() {
        bind.setRvLinearManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        CommonRVAdapter adapter = new CommonRVAdapter(
                mNotificationLists, BR.notification,
                R.layout.notification_head, R.layout.notification_item);
        adapter.setOnItemClickListener(this);
        bind.setRvAdapter(adapter);
    }

    private void initEvent() {
        bind.notiGoback.setOnClickListener(this);
    }

    @Override
    public void onItemClick(View view, int position) {
        startActivity(new Intent(this, NotificationDetailActivity.class));
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_notification;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.noti_goback:
                finish();
                break;
        }
    }
}
