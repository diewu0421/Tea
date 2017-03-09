package com.gshl.tea.module.shopCar.bean;

/**
 * Created by ZengLingWen on 2017/3/7.
 */

public class ShopCarInfo {
    private String imgUrl;

    private String title;

    private String dx;

    private String taste;

    private String price;

    private String count;

    public ShopCarInfo(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ShopCarInfo(String imgUrl, String name, String dx, String taste, String price, String count) {
        this.imgUrl = imgUrl;
        this.title = name;
        this.dx = dx;
        this.taste = taste;
        this.price = price;
        this.count = count;
    }

    public String getImgUrl() {

        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDx() {
        return dx;
    }

    public void setDx(String dx) {
        this.dx = dx;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
