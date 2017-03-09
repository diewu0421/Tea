package com.gshl.tea.module.home.activity;


import android.support.v7.widget.LinearLayoutManager;

import com.gshl.tea.BR;
import com.gshl.tea.R;
import com.gshl.tea.activity.BaseActivity;
import com.gshl.tea.adapter.CommonRVAdapter;
import com.gshl.tea.databinding.ActivitySystemNotificationBinding;
import com.gshl.tea.module.home.bean.SystemNotification;

import java.util.ArrayList;
import java.util.List;

public class SystemNotificationActivity extends BaseActivity {

    private ActivitySystemNotificationBinding bind;
    private List<SystemNotification> mSystemNotis;

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
        bind = (ActivitySystemNotificationBinding) this.binding;
        mSystemNotis = new ArrayList<>();
    }

    private void initView() {

    }

    private void initData() {
        for (int i = 0; i < 10; i++) {
            mSystemNotis.add(new SystemNotification(
                    "09:25",
                    " 这是系统消息的内容这是系统消息的内容这是系统消息的内容这是系统消息的内容这是系统消息的内容这是系统消息的内容这是系统消息的内容这是系统消息的内容这是系统消息的内容这是系统消息的内容这是系统消息的内容这是系统消息的内容这是系统消息的内容这是系统消息的内容这是系统消息的内容这是系统消息的内容这是系统消息的内容"
            ));
        }
    }

    private void initAdapter() {
        bind.setRvLinearManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        CommonRVAdapter adapter = new CommonRVAdapter(
                mSystemNotis, BR.systemNotification, R.layout.system_noti_item
        );
        bind.setRvAdapter(adapter);
    }

    private void initEvent() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_system_notification;
    }
}
