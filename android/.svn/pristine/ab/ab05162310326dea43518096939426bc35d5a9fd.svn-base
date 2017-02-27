package com.gshl.tea.module.good.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;

import com.gshl.tea.BR;
import com.gshl.tea.utils.ShowToast;

/**
 * Created by ZengLingWen on 2017/2/24.
 */

public class Category extends BaseObservable{
    private String name;
    private boolean isClick;
    private int position;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Category(String name) {
        this.name = name;
    }

    @Bindable
    public boolean isClick() {
        return isClick;
    }

    public void setClick(boolean click) {
        isClick = click;
        notifyPropertyChanged(BR.click);
    }

    @Override
    public String toString() {

        return "Category{" +
                "name='" + name + '\'' +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void onItemClick(View view) {
        //当前itme的状态反向
        isClick = !isClick;
        if (listener != null) {
            listener.onItemClick(view,position);
        }
    }

    public interface OnItemClickListener{
        void onItemClick(View view,int position);
    }

    private OnItemClickListener listener;

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }
}
