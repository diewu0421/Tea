package com.example.listviewwithbuttondemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener,Aaaaaaaaaaaaa {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.lv);
        listView.setAdapter(new MyAdapter2(this));
        listView.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.e("listview 项目", "当前点击的是"+position );
        //我把当前点击的位置传递给下一个页面,然后传递回调接口对象到下个页面
    }

    @Override
    public void onChange(String tag) {
        //在这里代表详情页点赞成功, 需要改变当前页面的图标
        View viewWithTag = listView.findViewWithTag(tag);
        if (viewWithTag != null) {//一定要判空
            //在这里改变图片控件的内容
        }
    }
}
