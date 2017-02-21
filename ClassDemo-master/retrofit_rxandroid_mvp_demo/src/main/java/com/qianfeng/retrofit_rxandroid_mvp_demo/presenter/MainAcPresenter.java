package com.qianfeng.retrofit_rxandroid_mvp_demo.presenter;



import com.qianfeng.retrofit_rxandroid_mvp_demo.bean.Tngou;
import com.qianfeng.retrofit_rxandroid_mvp_demo.model.MainAcModel;
import com.qianfeng.retrofit_rxandroid_mvp_demo.model.MyModel;
import com.qianfeng.retrofit_rxandroid_mvp_demo.view.iview.MyView;

import rx.functions.Action1;

/**
 * Created by jackiechan on 16/8/7.
 */
public class MainAcPresenter extends BasePresenter<MyView> {
    private MyModel<Tngou> myModel;

    public MainAcPresenter() {
        myModel = new MainAcModel();
    }

    public void load() {
       myModel.loadData(new Action1<Tngou>() {
           @Override
           public void call(Tngou tngou) {
               //获取到数据了
               getView().showView(tngou.getTngou());
           }
       });
    }
}
