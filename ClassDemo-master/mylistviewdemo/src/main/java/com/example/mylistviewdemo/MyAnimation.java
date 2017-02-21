package com.example.mylistviewdemo;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/**
 * Created by jackiechan on 16/1/5.
 */
public class MyAnimation extends Animation {
    //当前高度是100,目标高度是50  ,变化距离为50
    //
    // 0.5*50=25
    //100-25=75
    private int currentHeight;// 控件当前的高度
    private int targetHeight;//目标高度
    private View targetView;//想要变化高度是控件

    public MyAnimation(int targetHeight, View targetView) {
        this.currentHeight = targetView.getHeight();
        this.targetHeight = targetHeight;
        this.targetView = targetView;
        setDuration(500);//设置动画持续时间
    }

    /**
     * 0-1之间的数值
     * @param interpolatedTime
     * @param t
     */
    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        int height = (int) (currentHeight - (currentHeight - targetHeight) * interpolatedTime);//根据动画的完成度,来计算当前控件应该有多高
        targetView.getLayoutParams().height = height;//将高度设置为控件的高度
        targetView.requestLayout();//请求重新绘制位置
        super.applyTransformation(interpolatedTime, t);
    }
}
