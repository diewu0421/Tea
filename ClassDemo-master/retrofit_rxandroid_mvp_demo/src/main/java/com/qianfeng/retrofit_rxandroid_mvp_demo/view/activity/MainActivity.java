package com.qianfeng.retrofit_rxandroid_mvp_demo.view.activity;

import android.os.Bundle;
import android.widget.ListView;

import com.qianfeng.retrofit_rxandroid_mvp_demo.R;
import com.qianfeng.retrofit_rxandroid_mvp_demo.adapter.MyAdapter;
import com.qianfeng.retrofit_rxandroid_mvp_demo.bean.Cook;
import com.qianfeng.retrofit_rxandroid_mvp_demo.presenter.MainAcPresenter;
import com.qianfeng.retrofit_rxandroid_mvp_demo.view.iview.MyView;

import java.util.List;

/**
 * 用 retrofit 请求数据,然后通过 rxandroid 返回数据, 结合 mvp 模式
 */
public class MainActivity extends BaseActivity<MyView,MainAcPresenter> implements MyView {

    private ListView listView;
    private MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listview);
        //获取数据 展示内容
        presenter.load();
    }

    @Override
    public MainAcPresenter createPresenter() {
       return new MainAcPresenter();
    }

    @Override
    public void showView(List<Cook> list) {
        myAdapter = new MyAdapter(R.layout.item, list);
        listView.setAdapter(myAdapter);
    }
}
