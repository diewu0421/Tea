package com.qianfeng.zhibomvpdemo.view.activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.qianfeng.zhibomvpdemo.R;
import com.qianfeng.zhibomvpdemo.presenter.MainAcPresenter;
import com.qianfeng.zhibomvpdemo.view.iview.MvpView;

import java.util.List;

/**
 * MVP--->MVC演进  model获取数据 view展示内容 presenter沟通MV
 */
public class MainActivity extends BaseActivity<MvpView,MainAcPresenter> implements MvpView {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.lsitview);
        //需要通过某种方式获取数据源,然后设置给 listview
//        new MainAcPresenter(this).setModel(1).load();//创建 presenter, 调用内部的加载数据的方法
        basePresenter.setModel(1).load();
    }


    @Override
    public MainAcPresenter getBasePresenter() {
        return new MainAcPresenter();
    }

    /**
     * 在这里数据传回来了,更新界面即可
     * @param list
     */
    @Override
    public void showView(List<String> list) {
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);
    }
}
