package com.gshl.tea.module.home.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;

import com.gshl.tea.R;

/**
 * Created by ZengLingWen on 2017/2/22.
 * 首页消息气泡控件
 */


public class MessageView extends View {

    private Bitmap bitmap;

    public MessageView(Context context) {
        this(context, null);
    }

    public MessageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MessageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private Paint paint;
    private Paint textPaint;
    //圆的半径
    private float radius;
    //圆心的x坐标
    private float cx;
    //圆心的y坐标
    private float cy;
    //要绘制的数字
    private int text;
    private String drawText;
    //要绘制的文字的x坐标
    private float textX;
    //要绘制的文字的y坐标
    private float textY;

    private void init() {
        paint = new Paint();
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.WHITE);

        textPaint = new Paint();
        textPaint.setDither(true);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        textPaint.setColor(Color.RED);
        textPaint.setTextSize(18);
        textPaint.setStrokeWidth(1);

        radius = 13;
        text = 1;
        drawText = String.valueOf(text);
        bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.btn_news);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        cx = getMeasuredWidth() - radius;
        cy = radius;

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawBitmap(bitmap, 0, radius, paint);
        canvas.drawCircle(cx, cy, radius, paint);
        Rect textRect = getTextRect(drawText);
        if (!TextUtils.isEmpty(drawText) && drawText != null) {
            //如果消息个数大于99，则把要绘制的文字改为 "99+"
            if (text > 99) {
                drawText = "99+";
            }
            canvas.drawText(drawText, cx - textRect.width() / 2, cy + textRect.height() / 2, textPaint);
        }
    }

    private Rect getTextRect(String text) {
        Rect rect = new Rect();
        textPaint.getTextBounds(text, 0, text.length(), rect);
        return rect;
    }

    public void setText(int text) {
        this.text = text;
        if (getContext().getMainLooper() == Looper.myLooper()) {
            //主线程重绘方法
            invalidate();
        } else {
            //子线程重绘方法
            postInvalidate();
        }
    }
}
