package com.gshl.tea.module.good.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.gshl.tea.R;
import com.gshl.tea.utils.StatusBarCompat;

/**
 * Created by Administrator on 2016/12/13.
 */
public class CustomHorizontalScrollView extends HorizontalScrollView {
    private int mStatusHeight;
    private float customRight;
    private Context mContext;
    private LinearLayout mLinearLayout;
    private ViewGroup mMenu, mContent;
    private int mMenuWidth, mPaddingleft;
    private int screenWidth;
    private int screenHeight;
    private boolean isFirst = true;
    private boolean isOpen;
    private OnScrollChangeListener listener;
    private float old;

    public CustomHorizontalScrollView(Context context) {
        this(context, null);
    }

    public CustomHorizontalScrollView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomHorizontalScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;

        screenWidth = mContext.getResources().getDisplayMetrics().widthPixels;
        screenHeight = mContext.getResources().getDisplayMetrics().heightPixels;
        mStatusHeight = StatusBarCompat.getStatusBarHeight(context);
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.CustomHorizontalScrollView);
        customRight = array.getDimension(R.styleable.CustomHorizontalScrollView_customRight, 50);
        mPaddingleft = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, customRight,
                context.getResources().getDisplayMetrics());
        array.recycle();

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (isFirst) {
            mLinearLayout = (LinearLayout) getChildAt(0);
            mMenu = (ViewGroup) mLinearLayout.getChildAt(0);
            mContent = (ViewGroup) mLinearLayout.getChildAt(1);
            mMenuWidth = mMenu.getLayoutParams().width = screenWidth
                    - mPaddingleft;
            mContent.getLayoutParams().width = screenWidth;
            isFirst = false;
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_UP:
                //scrollX 获得scrollView划动的x方向上的距离
                int scrollX = getScrollX();
                Log.e("onScrollChange", "scrollX " + scrollX + "");
                if (scrollX > mMenuWidth / 2)   {
                    //TODO 菜单栏划回去
                    Toast.makeText(mContext, "收缩菜单", Toast.LENGTH_SHORT).show();
                    smoothScrollTo(mMenuWidth, 0);
                    isOpen = false;

                } else {
                    //TODO 菜单栏弹出来
                    Toast.makeText(mContext, "弹出菜单", Toast.LENGTH_SHORT).show();
                    smoothScrollTo(0, 0);
                    isOpen = true;
                }
                return true;
        }
        return super.onTouchEvent(ev);
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        /**
         * 内容区域： 缩放： 1 - 0.7
         * 菜单区域  缩放：0.7 - 1  透明度：0.5 - 1
         */
//        float scale = 1.0f * l / mMenuWidth;
//        float contentScale = (float) (0.8 + 0.2 * scale);
////        1 - 0  0.8 - 1
//        float menuScale = 1 - 0.2f * scale;
//        float menuAlpha = 1 - 0.2f * scale;
//        ViewHelper.setTranslationX(mMenu, l * 0.8F);
//        ViewHelper.setPivotX(mContent, 0);
//        ViewHelper.setPivotY(mContent, mContent.getMeasuredHeight() / 2);
//        ViewHelper.setScaleX(mContent, contentScale);
//        ViewHelper.setScaleY(mContent, contentScale);
//        //对菜单区域的缩放
//        ViewHelper.setAlpha(mMenu, menuAlpha);
//        ViewHelper.setScaleX(mMenu, menuScale);
//        ViewHelper.setScaleY(mMenu, menuScale);

        ViewGroup.LayoutParams params = mContent.getChildAt(0).getLayoutParams();
        ViewGroup.LayoutParams params1 = mContent.getChildAt(1).getLayoutParams();
        params.width = l + screenWidth - mMenuWidth;
        params1.width = l + screenWidth - mMenuWidth;
        params1.height = mContent.getChildAt(1).getMeasuredHeight();
        Log.e("onScrollChange", "params.width = "+params.width + "");
        mContent.getChildAt(0).setLayoutParams(params);
        mContent.getChildAt(1).setLayoutParams(params1);
        if (listener != null) {
            listener.onScrollChange(l,t,oldl,oldt);
        }
        super.onScrollChanged(l, t, oldl, oldt);
    }


    public interface OnScrollChangeListener{
        void onScrollChange(int l, int t, int oldl, int oldt);
    }

    public void addOnScrollChangeListener(OnScrollChangeListener listener) {
        this.listener = listener;
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        if (changed) {
            scrollTo(mMenuWidth, 0);
            isOpen = false;
        }

    }

    public void open() {
        if (isOpen) return;
        smoothScrollTo(0, 0);
        isOpen = true;
    }

    public void colse() {
        if (!isOpen) return;
        smoothScrollTo(mMenuWidth, 0);
        isOpen = false;
    }

    public void toggle() {
        if (isOpen) {
            colse();
        } else {
            open();
        }
    }
}
