package com.gshl.tea.module.order.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;

import com.gshl.tea.BR;

/**
 * Created by ZengLingWen on 2017/3/3.
 */

public class GoodList extends BaseObservable{
//    //图片地址
//    public ObservableField goodImg = new ObservableField("https://ss0.baidu.com/73t1bjeh1BF3odCf/it/u=1138257099,2647609701&fm=73");
//    //标题
//    public ObservableField goodTitle = new ObservableField("红茶 · 高等级祁门红茶茗 萃取自高山红树叶");
//    //味道
//    public ObservableField taste = new ObservableField("口味：酸甜");
//    //口味
//    public ObservableField privilege = new ObservableField("赠");
//    //价格
//    public ObservableField price = new ObservableField("￥6.00");
//    //数量
//    public ObservableField count = new ObservableField(2);
//    //备注
//    public ObservableField remark = new ObservableField("记得要三种不同颜色的各一个");

    private String goodImg;
    private String goodTitle;
    private String taste;
    private String privilege;
    private String price;
    private int count;
    private String remark;

    public GoodList() {

    }
    public GoodList(String goodImg, String goodTitle, String taste, String privilege, String price, int count, String remark) {
        this.goodImg = goodImg;
        this.goodTitle = goodTitle;
        this.taste = taste;
        this.privilege = privilege;
        this.price = price;
        this.count = count;
        this.remark = remark;
    }

    public String getGoodImg() {
        return goodImg;
    }

    public void setGoodImg(String goodImg) {
        this.goodImg = goodImg;
    }

    public String getGoodTitle() {
        return goodTitle;
    }

    public void setGoodTitle(String goodTitle) {
        this.goodTitle = goodTitle;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Bindable
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
        notifyPropertyChanged(BR.remark);
    }
}
