package com.qianfeng.retrofit_rxandroid_mvp_demo.presenter;



import com.qianfeng.retrofit_rxandroid_mvp_demo.view.iview.MVPView;

import java.lang.ref.WeakReference;

/**
 * Created by jackiechan on 16/8/7.
 */
public class BasePresenter<V extends MVPView> {
    private WeakReference<V> weakReference;

    public void attch(V v) {
        weakReference = new WeakReference<V>(v);
    }

    public void deAttch() {
        if (weakReference != null) {
            weakReference.clear();
            weakReference = null;
        }
    }

    /**
     * 获取保持关系的 view
     * @return
     */
    public V getView() {
        return weakReference.get();
    }

}

