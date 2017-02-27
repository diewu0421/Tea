package com.gshl.tea.module.good.bean;

import android.view.View;

import com.gshl.tea.utils.ShowToast;

/**
 * Created by ZengLingWen on 2017/2/24.
 */

public class Good {
    private String shopName;
    private String imgUrl;
    private int position;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Good(String shopName, String imgUrl) {
        this.shopName = shopName;
        this.imgUrl = imgUrl;
    }

    public Good() {

    }

    public String getShopName() {

        return shopName;
    }

    @Override
    public String toString() {
        return "Good{" +
                "imgUrl='" + imgUrl + '\'' +
                ", shopName='" + shopName + '\'' +
                '}';
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void onItemClick(View view) {
        ShowToast.showShortToast(view.getContext(), position + "");
    }
}
