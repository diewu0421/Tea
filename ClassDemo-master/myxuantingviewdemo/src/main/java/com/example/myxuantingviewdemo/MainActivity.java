package com.example.myxuantingviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/**
 * scollView里面有一个区域专门用来放置悬停的view
 * 当这个 view 滚动到屏幕顶部的时候,从它所在的区域移除
 * 在屏幕顶部本身就隐藏一个容易, 高度和 view 一样,当 view 被从 scrollview 中移除的时候 就添加到这里 然后显示出来
 * 如果是往下滑,再回到某个位置的时候,执行上面相反的侗族
 */
public class MainActivity extends AppCompatActivity  {

    private MyScrollView scrollView;
    private ViewGroup xuantingquyu,firstParent;
    private View moveView;
    private  int moveViewGetTopHeight;//悬停的控件距离 scrollview 顶部的距离
    private int moveViewHeight;//被移除的控件的高度,因为一旦移除后它的父控件内部没有内容了,但是又是包裹内容,会出现移除后控件瞬间移动的情况,需要给父控件设置和它一样高的高度
    private boolean isXuanting;//是不是处于悬停
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scrollView = (MyScrollView) findViewById(R.id.scrollview);
        xuantingquyu = (ViewGroup) findViewById(R.id.xuantingquyu);//用于显示悬停区域的
        firstParent = (ViewGroup) findViewById(R.id.parentfirst);//虚浮按钮原始所在的
        moveView =  findViewById(R.id.moveview);
//        scrollView.setOnXuanTingScrollListener(this);
        scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {

//                //在这里 控件已经绘制布局完成
//                moveViewGetTopHeight = firstParent.getTop();//获取到应当移除添加 view 的坐标点
//                moveViewHeight = moveView.getHeight();//获取高度
//                firstParent.getLayoutParams().height = moveViewHeight;
//                xuantingquyu.getLayoutParams().height = moveViewHeight;//将移除 view 的高度设置给后面放置区域的控件
//                scrollView.getViewTreeObserver().removeGlobalOnLayoutListener(this);

                scrollView.setXuantingquyu(xuantingquyu,firstParent,moveView);
                scrollView.getViewTreeObserver().removeGlobalOnLayoutListener(this);

            }
        });
    }

//    @Override
//    public void onXuanting(float moveY, int currentMoveY) {
//        Log.e("自定义", "curr" + currentMoveY + "====mmove" + moveViewGetTopHeight+"-----"+moveY);
//        if (currentMoveY> moveViewGetTopHeight&&!isXuanting) {//代表你应该是在悬停区域
//            if (moveView.getParent() != null) {
//                ((ViewGroup) moveView.getParent()).removeView(moveView);//从父容器中移除
//            }
//            xuantingquyu.addView(moveView);//加到悬停区域
//            xuantingquyu.setVisibility(View.VISIBLE);//悬停区域显示
//            isXuanting = true;//处于悬停状态
////            if (moveY < 0) {
////                if (moveView.getParent() != null) {
////                    ((ViewGroup) moveView.getParent()).removeView(moveView);//从父容器中移除
////                }
////                xuantingquyu.addView(moveView);//加到悬停区域
////                xuantingquyu.setVisibility(View.VISIBLE);//悬停区域显示
////            }else{
////                if (moveView.getParent() != null) {
////                    ((ViewGroup) moveView.getParent()).removeView(moveView);
////                }
////                xuantingquyu.setVisibility(View.GONE);
////                firstParent.addView(moveView);
////            }
//        }else if (currentMoveY<= moveViewGetTopHeight&&isXuanting){
//            if (moveView.getParent() != null) {
//                    ((ViewGroup) moveView.getParent()).removeView(moveView);
//                }
//                xuantingquyu.setVisibility(View.GONE);
//                firstParent.addView(moveView);
//            isXuanting = false;//处于滚动状态
//        }
//        //在这里 我已经知道移动方向和当前距离了.我只要知道当前的距离和被移除的控件距离父控件顶部的距离是否一致即可,一致则根据方向做具体处理
//
//    }

//    @Override
//    public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
//        Log.e("自定义", scrollX + "======" + scrollY + "====" + oldScrollX + "=====" + oldScrollY);
//    }
}
