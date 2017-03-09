package com.gshl.tea.module.home.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.gshl.tea.R;
import com.gshl.tea.activity.BaseActivity;
import com.gshl.tea.databinding.ActivityNotificationDetailBinding;
import com.gshl.tea.module.home.bean.NotificationDetail;

public class NotificationDetailActivity extends BaseActivity implements View.OnClickListener {

    private ActivityNotificationDetailBinding bind;

    @Override
    protected void init() {
        //初始化一些属性
        initProperty();
        //初始化控件
        initView();
        //初始化数据
        initData();
        //初始化事件
        initEvent();
    }

    private void initProperty() {
        bind = (ActivityNotificationDetailBinding) this.binding;
        bind.setNotificationDetail(new NotificationDetail(
                "员工请假制度通知",
                "2017-01-18",
                "古树互联",
                "当时发的说法答复asdfasdf答复大师傅打首发的大神大神发的说法asdfasdf大师傅asdfasdf当时发的说法答复asdfasdf答复大师傅打首发的大神大神发的说法asdfasdf大师傅asdfasdf当时发的说法答复asdfasdf答复大师傅打首发的大神大神发的说法asdfasdf大师傅asdfasdf当时发的说法答复asdfasdf答复大师傅打首发的大神大神发的说法asdfasdf大师傅asdfasdf当时发的说法答复asdfasdf答复大师傅打首发的大神大神发的说法asdfasdf大师傅asdfasdf当时发的说法答复asdfasdf答复大师傅打首发的大神大神发的说法asdfasdf大师傅asdfasdf当时发的说法答复asdfasdf答复大师傅打首发的大神大神发的说法asdfasdf大师傅asdfasdf当时发的说法答复asdfasdf答复大师傅打首发的大神大神发的说法asdfasdf大师傅asdfasdf当时发的说法答复asdfasdf答复大师傅打首发的大神大神发的说法asdfasdf大师傅asdfasdf当时发的说法答复asdfasdf答复大师傅打首发的大神大神发的说法asdfasdf大师傅asdfasdf当时发的说法答复asdfasdf答复大师傅打首发的大神大神发的说法asdfasdf大师傅asdfasdf当时发的说法答复asdfasdf答复大师傅打首发的大神大神发的说法asdfasdf大师傅asdfasdf当时发的说法答复asdfasdf答复大师傅打首发的大神大神发的说法asdfasdf大师傅asdfasdf当时发的说法答复asdfasdf答复大师傅打首发的大神大神发的说法asdfasdf大师傅asdfasdf当时发的说法答复asdfasdf答复大师傅打首发的大神大神发的说法asdfasdf大师傅asdfasdf当时发的说法答复asdfasdf答复大师傅打首发的大神大神发的说法asdfasdf大师傅asdfasdf当时发的说法答复asdfasdf答复大师傅打首发的大神大神发的说法asdfasdf大师傅asdfasdf当时发的说法答复asdfasdf答复大师傅打首发的大神大神发的说法asdfasdf大师傅asdfasdf当时发的说法答复asdfasdf答复大师傅打首发的大神大神发的说法asdfasdf大师傅asdfasdf当时发的说法答复asdfasdf答复大师傅打首发的大神大神发的说法asdfasdf大师傅asdfasdf当时发的说法答复asdfasdf答复大师傅打首发的大神大神发的说法asdfasdf大师傅asdfasdf当时发的说法答复asdfasdf答复大师傅打首发的大神大神发的说法asdfasdf大师傅asdfasdf当时发的说法答复asdfasdf答复大师傅打首发的大神大神发的说法asdfasdf大师傅asdfasdf当时发的说法答复asdfasdf答复大师傅打首发的大神大神发的说法asdfasdf大师傅asdfasdf当时发的说法答复asdfasdf答复大师傅打首发的大神大神发的说法asdfasdf大师傅asdfasdf"
        ));
    }

    private void initView() {

    }

    private void initData() {

    }

    private void initEvent() {
        bind.notiDetailGoback.setOnClickListener(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_notification_detail;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.noti_detail_goback:
                finish();
                break;
        }
    }
}
