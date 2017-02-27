package com.gshl.tea.utils;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
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

    public void startRotate(final View view, String animatorName, int duration, final float startValue, final float endValue) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, animatorName, startValue, endValue).setDuration(duration);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float value = (float) valueAnimator.getAnimatedValue();
                view.setRotation(value);
                if (value == endValue) {
                    if (value != 0) {
                        view.setTag(true);
                    } else {
                        view.setTag(false);
                    }
                }
            }
        });
        animator.start();
    }
}
