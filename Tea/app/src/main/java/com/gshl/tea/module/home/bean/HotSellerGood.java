package com.gshl.tea.module.home.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;
import android.widget.Toast;

import com.gshl.tea.BR;

/**
 * Created by ZengLingWen on 2017/2/22.
 */
//首页热销商品bean
public class HotSellerGood extends BaseObservable {
    private String goodImgUrl;
    private String title;
    private String price;
    private int position;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getGoodImgUrl() {
        return goodImgUrl;
    }

    public void setGoodImgUrl(String goodImgUrl) {
        this.goodImgUrl = goodImgUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Bindable
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
        notifyPropertyChanged(BR.price);
    }

    public void onItemClick(View view) {
//        ShowToast.showShortToast(view.getContext(), view.toString() + "  ");
        Toast.makeText(view.getContext(), "这是第" + position + "个位置", Toast.LENGTH_SHORT).show();
    }
}
