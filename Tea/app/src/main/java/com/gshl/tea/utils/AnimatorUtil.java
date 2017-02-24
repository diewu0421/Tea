package com.gshl.tea.utils;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ZengLingWen on 2017/2/24.
 */

public class AnimatorUtil {

    private static AnimatorUtil instance = null;

    private AnimatorUtil() {

    }
    public static AnimatorUtil getInstance() {
        if (instance == null) {
            synchronized (AnimatorUtil.class) {
                if (instance == null) {
                    instance = new AnimatorUtil();
                }
            }
        }
        return instance;
    }

    public void startRotate(final View view, String animatorName, int duration, float startValue, final float endValue, final View categoryRv, final float width) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, animatorName, startValue, endValue).setDuration(duration);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float value = (float) valueAnimator.getAnimatedValue();
                Log.e("progress", value + "");
                view.setRotation(value);
                ViewGroup.LayoutParams params = categoryRv.getLayoutParams();
                params.width = (int) (value / endValue * width);
//                categoryRv.
                categoryRv.setLayoutParams(params);
            }
        });
        animator.start();
    }
}
