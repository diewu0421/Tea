package com.example.mylistviewdemo;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;

public class MainActivity extends AppCompatActivity {
    private MyListView listView;

    /**
     * 首先是一个自定义的 listview,顶部有一个 headview,是个图片控件
     * 随着滑动,图片控件越来越大,显示的图片内容越来越多
     * 松手后加载数据,加载完成后图片控件恢复到初始高度
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (MyListView) findViewById(R.id.listview);
        final View headView = LayoutInflater.from(this).inflate(R.layout.item_head, null);
        listView.addHeaderView(headView);
        listView.setAdapter(new MyAdadpter(MainActivity.this));
        //添加监听,监听某个 view 所在的 xml 文件全部加载完成后,并且绘制了位置之后的监听
        headView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                listView.setHeadView(headView);//给 listview set headview, 这样在内部就可以获取到这个 view
                headView.getViewTreeObserver().removeGlobalOnLayoutListener(this);// 完成后要移除,因为随着控件的变化 这个监听会多次调用
            }
        });
        listView.setOnLoadingListener(new MyListView.OnLoadingListener() {//设置建提欧诺个
            @Override
            public void onLoading() {
                //在此处请求网络,加载数据
                handler.sendEmptyMessageDelayed(1, 3000);
            }
        });
    }

    private Handler handler = new Handler(){

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            listView.onCompleteLoading();//通知请求完成,刷新 imagview 高度
        }
    };
}
