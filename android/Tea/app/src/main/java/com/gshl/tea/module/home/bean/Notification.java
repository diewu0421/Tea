package com.gshl.tea.module.home.bean;

/**
 * Created by ZengLingWen on 2017/3/6.
 */

public class Notification {
    //通知是标题
    private String notificationTitle;

    public String getNotificationTime() {
        return notificationTime;
    }

    public void setNotificationTime(String notificationTime) {
        this.notificationTime = notificationTime;
    }

    public Notification(String notificationTitle, String notificationTime) {
        this.notificationTitle = notificationTitle;
        this.notificationTime = notificationTime;
    }

    public Notification(){

    }

    public String getNotificationTitle() {
        return notificationTitle;
    }

    public void setNotificationTitle(String notificationTitle) {
        this.notificationTitle = notificationTitle;
    }

    //通知的时间
    private String notificationTime;
}