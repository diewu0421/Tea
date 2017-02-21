package com.qianfeng.retrofit_rxandroid_mvp_demo.view.iview;
 

import com.qianfeng.retrofit_rxandroid_mvp_demo.bean.Cook;

import java.util.List;

/**
 * Created by jackiechan on 16/8/7.
 */
public interface MyView extends MVPView{
    void showView(List<Cook> list);
}
