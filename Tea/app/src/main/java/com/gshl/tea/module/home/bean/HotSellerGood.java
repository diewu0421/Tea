package com.gshl.tea.module.home.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;

import com.gshl.tea.BR;
import com.gshl.tea.utils.ShowToast;

/**
 * Created by ZengLingWen on 2017/2/22.
 */
//首页热销商品bean
public class HotSellerGood extends BaseObservable {
    private String goodImgUrl;
    private String title;
    private String price;

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
        ShowToast.showShortToast(view.getContext(), view.toString() + "  ");
    }
}
