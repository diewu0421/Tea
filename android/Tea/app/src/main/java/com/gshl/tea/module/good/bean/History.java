package com.gshl.tea.module.good.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;

import com.gshl.tea.BR;
import com.gshl.tea.utils.ShowToast;

/**
 * Created by ZengLingWen on 2017/2/27.
 */

public class History {
    private String content;
    private OnItemClickListener listener;

    public String getContent() {
        return content;
    }

    public History(String content) {
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void onItemClick(View view){
        ShowToast.showShortToast(view.getContext(),view.toString());
        if (listener != null) {
            listener.onItemClick(view);
        }
    }

    public interface OnItemClickListener{
        void onItemClick(View view);

    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }
}
