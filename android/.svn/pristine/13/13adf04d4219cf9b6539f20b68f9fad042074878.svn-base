package com.gshl.tea.module.order.utils;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by ZengLingWen on 2017/3/3.
 */

public class AnimatorUtil {
    /**
     * 传入一个view，计算它下面孩子的高度，然后根据孩子的总高度进行拉伸
     *
     * @param view
     */
    public static void stretchView(final View view,boolean flag) {
        int childCount = ((ViewGroup) view).getChildCount();
        int sum = 0;
        for (int i = 0; i < childCount; i++) {
            View childAt = ((ViewGroup) view).getChildAt(i);
            LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            sum += childAt.getMeasuredHeight() + params.bottomMargin + params.topMargin;
        }
        ObjectAnimator animator = null;
        if (flag) {
            animator = ObjectAnimator.ofFloat(view, "xxx", sum, 0).setDuration(200);
        } else {
            animator = ObjectAnimator.ofFloat(view, "xxx", 0, sum).setDuration(200);
        }
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float progress = (float) valueAnimator.getAnimatedValue();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = (int) progress;
                view.setLayoutParams(layoutParams);
            }
        });
        animator.start();
    }
}
