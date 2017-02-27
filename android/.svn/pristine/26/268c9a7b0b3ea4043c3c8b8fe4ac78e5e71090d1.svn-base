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

    public void startRotate(final View view, String animatorName, int duration, final float startValue, final float endValue, final View categoryRv) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, animatorName, startValue, endValue).setDuration(duration);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float value = (float) valueAnimator.getAnimatedValue();

                view.setRotation(value);
                ViewGroup.LayoutParams params = categoryRv.getLayoutParams();
                if (endValue != 0) {
                    params.width = (int) (value / endValue * 150);
                } else {
                    params.width = (int) (value / startValue * 150);
//                    categoryRv.setLayoutParams(params);
                }
                Log.e("params.width", params.width + "");
                categoryRv.setLayoutParams(params);
            }
        });
        animator.start();
    }
}
