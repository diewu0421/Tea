package com.example.mylistviewdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ListView;

/**
 * Created by jackiechan on 16/1/5.
 */
public class MyListView extends ListView {
    private View headView;
    private ImageView imageView;
    private int MaxOverY,initHeight;//下拉可拖动的最大高,应当为图片的高度,初始高度,用于回弹
    private  OnLoadingListener onLoadingListener;
    private int totalY;//滑动的总距离,用于判断是否应该刷新,只有滑动超出一定距离后才可以
    private int canRefreshHeight=100;//只有当 totalY 大于这个值的时候才能刷新
    private Context context;
    public MyListView(Context context) {
        this(context,null);
    }

    public MyListView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MyListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics displayMetrics = new DisplayMetrics();//用于存储屏幕宽高度的对象
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);//将获取到的屏幕宽高度设置到displayMetrics 对象中
        canRefreshHeight = displayMetrics.heightPixels / 6 > 100 ? displayMetrics.heightPixels / 6 : 100;//将屏幕的高度除以6,如果大于100 就设置给canRefreshHeight,否则就设置100
    }

    public void setOnLoadingListener(OnLoadingListener onLoadingListener) {
        this.onLoadingListener = onLoadingListener;
    }

    public void setHeadView(View headView) {
        this.headView = headView;//将 view 设置为 headview 然后添加进去
        imageView = (ImageView) headView.findViewById(R.id.iv);
        Log.e("listview", "====" + imageView.getHeight());
        initHeight = imageView.getHeight();//将图片控件的初始高度设置后默认的初始值,用于图片回弹
        imageView.setDrawingCacheEnabled(true);
//        Bitmap drawingCache = imageView.getDrawingCache();
//        if (drawingCache != null) {
//            MaxOverY = imageView.getDrawingCache().getHeight();//将图片的高度设置为最大滑动高度
//        }
        MaxOverY = imageView.getDrawable().getIntrinsicHeight();//获取imageview 上面图片的高度
        imageView.setDrawingCacheEnabled(false);
//        addHeaderView(headView);
    }

    /**
     * 用于内部子控件超出控件本身范围滑动的监听
     *
     * @param deltaX         X 轴的滑动距离
     * @param deltaY         Y 轴的滑动距离,顶部超出的时候为负,底部超出的时候为正
     * @param scrollX
     * @param scrollY
     * @param scrollRangeX
     * @param scrollRangeY
     * @param maxOverScrollX
     * @param maxOverScrollY
     * @param isTouchEvent
     * @return
     */
    @Override
    protected boolean overScrollBy(int deltaX, int deltaY, int scrollX, int scrollY, int scrollRangeX, int scrollRangeY, int maxOverScrollX, int maxOverScrollY, boolean isTouchEvent) {
        Log.e("listview", "deltaY=======" + deltaY);
        if (deltaY < 0 && isTouchEvent) {//如果是手指拖动到达顶部并且下拉
            int height = imageView.getHeight() - deltaY/2;//imagview 变化后的高度
            totalY -= deltaY;//将滑动的距离添加给滑动总距离
            if (height < MaxOverY) {//如果当前控件的高度小于可滑动的最大值
                imageView.getLayoutParams().height = height;
                imageView.requestLayout();//设置高度后请求重新绘制位置
            }
        }
        return super.overScrollBy(deltaX, deltaY, scrollX, scrollY, scrollRangeX, scrollRangeY, maxOverScrollX, maxOverScrollY, isTouchEvent);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_UP:
                //在此应该加载数据,按照规范,应该提供一个接口给用户
                if (onLoadingListener != null&&totalY>canRefreshHeight) {//判断不为空并且滑动的总距离超出canRefreshHeight才执行滑动监听
                    onLoadingListener.onLoading();
                    totalY=0;
                } else{
                    onCompleteLoading();//请求重新测量 imageview 高度
                }
                //此处注意,如果要继承上拉和下拉两个功能, 此处应要判断当前是下拉还是上拉,然后执行不同的操作
                break;
        }
        return super.onTouchEvent(ev);
    }

    //完成请求数据,刷新imageview 高度
    public void onCompleteLoading() {
        totalY=0;
        MyAnimation myAnimation = new MyAnimation(initHeight, imageView);//创建动画,目标高度为初始高度,目标控件为图片控件
        startAnimation(myAnimation);
    }

    /**
     * 下拉刷新的回调监听
     */
    public  interface  OnLoadingListener{
        void onLoading();
    }
}
