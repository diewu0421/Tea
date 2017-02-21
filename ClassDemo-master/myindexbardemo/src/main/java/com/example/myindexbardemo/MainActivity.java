package com.example.myindexbardemo;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 左侧是一个 listview,用于显示具体的数据
 * 右侧 如果是一个 listview, 因为 listview 的高度不确定,那就无法确定每个 item 有多高,我们写一个自定义的 view
 * 直接在内部画出26个英文字母,每个英文字母所占的区域就是 自定义 view 所占的高度的1/26
 * 左侧的自定义 view 区域  有点击事件,每个字母都可以点击,还有滑动事件,要重写 ontouchevent
 * 在 ontouchevent 中定义回调接口,给外部的页面使用,用于更新 listview 的位置,listview.setselection(position)
 */
public class MainActivity extends AppCompatActivity implements MyIndexBar.OnIndexBarChangeListener {

    private ListView listView;
    private List<Friend> friends;
    private MyIndexBar indexBar;
    private TextView currentindex;//用于在屏幕中间显示当前是哪个
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listview);
        indexBar = (MyIndexBar) findViewById(R.id.indexbar);
        currentindex = (TextView) findViewById(R.id.currentindex);
        friends = new ArrayList<>();
        friends.add(new Friend("飞洒"));
        friends.add(new Friend("干撒高"));
        friends.add(new Friend("啊是伽师瓜"));
        friends.add(new Friend("第三方和"));
        friends.add(new Friend("瑞特"));
        friends.add(new Friend("的份上"));
        friends.add(new Friend("额也让"));
        friends.add(new Friend("适度腐败啥地方"));
        friends.add(new Friend("啥地方洒"));
        friends.add(new Friend("很多事"));
        friends.add(new Friend("好的大幅度是"));
        friends.add(new Friend("活生生的"));
        friends.add(new Friend("额外人"));
        friends.add(new Friend("符合"));
        friends.add(new Friend("和人"));
        friends.add(new Friend("金额图"));
        friends.add(new Friend("而为台湾"));
        friends.add(new Friend("的双方各"));
        friends.add(new Friend("的份上"));
        friends.add(new Friend("人工费是"));
        friends.add(new Friend("而我国高"));
        friends.add(new Friend("发的水电费"));
        friends.add(new Friend("二五热管"));
        friends.add(new Friend("的双方各"));
        friends.add(new Friend("特让我听"));
        friends.add(new Friend("发的鬼地方是"));
        friends.add(new Friend("瓦特"));
        friends.add(new Friend("和二恶"));
        friends.add(new Friend("没买过"));
        friends.add(new Friend("来衡量"));
        friends.add(new Friend("联合国了"));
        friends.add(new Friend("妈妈"));
        friends.add(new Friend("那你还"));
        friends.add(new Friend("你的飞"));
        friends.add(new Friend("哦经济法"));
        friends.add(new Friend("偶偶i"));
        friends.add(new Friend("璞玉普用品"));
        friends.add(new Friend("朋友退款"));
        friends.add(new Friend("全国各水电费"));
        friends.add(new Friend("奇怪的风格"));
        friends.add(new Friend("让让让"));
        friends.add(new Friend("如果恢复到"));
        friends.add(new Friend("退换货好"));
        friends.add(new Friend("为我国的风格"));
        friends.add(new Friend("我热土上"));
        friends.add(new Friend("幸福好得很"));
        friends.add(new Friend("新股申购"));
        friends.add(new Friend("这个地方是固定"));
        Collections.sort(friends);
        MyAdapter myAdapter = new MyAdapter(friends, this);
        listView.setAdapter(myAdapter);
        indexBar.setOnIndexBarChangeListener(this);
    }

    /**
     * 在这里根据回传回来的字母 设置 listview 滚动到相应的位置
     * @param word  回传回来的字母
     */
    @Override
    public void onIndexChange(String word) {
        for (int i = 0; i < friends.size(); i++) {
            Friend friend = friends.get(i);
            if (word.equals(friend.getPinyin().charAt(0) + "")) {//如果当前对象的首字母和传递回来的一致
                listView.setSelection(i);//直接滚过去
                currentindex.setVisibility(View.VISIBLE);
                currentindex.setText(word);
                handler.removeCallbacksAndMessages(null);//发送之前先移除之前所有发送的消息,防止突然莫名其妙消失了
                handler.sendEmptyMessageDelayed(1, 3000);//三秒后隐藏界面
                return;//一定要 return 防止 for 循环继续执行,导致滚动到的不是第一个而是最后一个
            }
        }
    }

    private Handler handler
            = new Handler(){

        @Override
        public void handleMessage(Message msg) {
            currentindex.setVisibility(View.GONE);
        }
    };
}
