package com.gshl.tea.module.good.bean;

import android.view.View;

import com.gshl.tea.utils.ShowToast;

/**
 * Created by ZengLingWen on 2017/2/27.
 */

public class HistoryHead {

    private OnClearHistoryListener listener;

    public void clearHistory(View view){
        ShowToast.showShortToast(view.getContext(),"清空历史记录");
        if (listener != null) {
            listener.onClearHistory();
        }
    }

    public interface OnClearHistoryListener{
        void onClearHistory();
    }

    public void setOnClearHistoryListener(OnClearHistoryListener listener){
        this.listener = listener;
    }
}