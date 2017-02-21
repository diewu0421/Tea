package com.example.jackiechan.swipetodeletedemo;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * 是一个自定义的 viewgroup, 拖动的时候出现删除,
 * 我们不是重写 listview,我们自己定义一个 viewgroup,内部有两部份区域,一个是内容区域,一个是删除区域
 * 我们不去继承 viewgroup,我们继承一个系统自带的 layout, 比如线性布局 帧布局,因为他们系统已经帮我测量好了自己有多宽多高,不需要我们自己再写
 */
public class MainActivity extends AppCompatActivity implements AbsListView.OnScrollListener, AdapterView.OnItemClickListener {

    private ListView listView;//listview
    private List<String> strings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listview);
        strings = new ArrayList<>();
        strings.add("fdgfdsfgdf");
        strings.add("fdgfdsfgdf");
        strings.add("fdgfdsfgdf");
        strings.add("fdgfdsfgdf");
        strings.add("fdgfdsfgdf");
        strings.add("fdgfdsfgdf");
        strings.add("fdgfdsfgdf");
        strings.add("fdgfdsfgdf");
        strings.add("fdgfdsfgdf");
        strings.add("fdgfdsfgdf");
        strings.add("fdgfdsfgdf");
        strings.add("fdgfdsfgdf");
        strings.add("fdgfdsfgdf");
        strings.add("fdgfdsfgdf");
        strings.add("fdgfdsfgdf");
        strings.add("fdgfdsfgdf");
        strings.add("fdgfdsfgdf");
        strings.add("fdgfdsfgdf");
        strings.add("fdgfdsfgdf");
        strings.add("fdgfdsfgdf");
        strings.add("fdgfdsfgdf");
        strings.add("fdgfdsfgdf");
        strings.add("fdgfdsfgdf");
        strings.add("fdgfdsfgdf");
        listView.setAdapter(new MyAdapter(strings,this,listView));
        listView.setOnScrollListener(this);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {

    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        for (int i = 0; i < MySwipeView.unClosedSwipeViews.size(); i++) {//滑动的时候把所有已经打开的关闭掉
            MySwipeView.unClosedSwipeViews.get(i).quickClose();
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        final Snackbar snackbar=Snackbar.make(view,"当前点击的是"+position,Snackbar.LENGTH_SHORT);
        snackbar.setAction("这就是爱", new View.OnClickListener() {
            public void onClick(View v) {
                snackbar.dismiss();//点击事件中关闭 snackbar
            }
        });
        snackbar.show();
    }
}
