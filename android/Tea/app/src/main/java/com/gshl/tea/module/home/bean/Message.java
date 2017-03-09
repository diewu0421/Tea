package com.gshl.tea.module.home.bean;

/**
 * Created by ZengLingWen on 2017/3/6.
 */
public class Message {
    //消息的标题
    private String messageTitle;
    //消息的图标地址
    private String messageIcon;
    //消息的时间
    private String time;
    //消息的描述
    private String description;

    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }

    public Message(){

    }

    public Message(String messageTitle, String messageIcon, String time, String description) {
        this.messageTitle = messageTitle;
        this.messageIcon = messageIcon;
        this.time = time;
        this.description = description;
    }

    public String getMessageIcon() {
        return messageIcon;
    }

    public void setMessageIcon(String messageIcon) {
        this.messageIcon = messageIcon;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
