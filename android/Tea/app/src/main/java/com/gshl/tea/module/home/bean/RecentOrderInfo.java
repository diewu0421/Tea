package com.gshl.tea.module.home.bean;

/**
 * Created by Administrator on 2017/3/7.
 */

public class RecentOrderInfo {
    //图片链接地址
    private String imgUrlString;

    //标题
    private String title;

    //规格数量
    private String specificationCount;

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    //口味
    private String taste;

    //优惠
    private String privilege;

    //价格
    private String price;

    public RecentOrderInfo(){}

    public RecentOrderInfo(String imgUrlString, String title, String specificationCount, String taste,String privilege, String price) {
        this.imgUrlString = imgUrlString;
        this.title = title;
        this.specificationCount = specificationCount;
        this.taste = taste;
        this.privilege = privilege;
        this.price = price;
    }

    public String getImgUrlString() {
        return imgUrlString;
    }

    public void setImgUrlString(String imgUrlString) {
        this.imgUrlString = imgUrlString;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSpecificationCount() {
        return specificationCount;
    }

    public void setSpecificationCount(String specificationCount) {
        this.specificationCount = specificationCount;
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
}
