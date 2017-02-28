package com.gshl.tea.module.good.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;
import android.view.View;
import android.widget.Toast;

import com.gshl.tea.BR;
import com.gshl.tea.utils.ShowToast;

/**
 * Created by ZengLingWen on 2017/2/22.
 */
public class NormalGood {
    public ObservableField<String> goodImgUrl = new ObservableField<>();
    public ObservableField<String> title = new ObservableField<>();
    public ObservableField<String> price = new ObservableField<>();


//    private String goodImgUrl;
//    private String title;
//    private String price;
//
//    public String getGoodImgUrl() {
//        return goodImgUrl;
//    }
//
//    public void setGoodImgUrl(String goodImgUrl) {
//        this.goodImgUrl = goodImgUrl;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    @Bindable
//    public String getPrice() {
//        return price;
//    }
//
//    public void setPrice(String price) {
//        this.price = price;
//        notifyPropertyChanged(BR.price);
//    }

}
