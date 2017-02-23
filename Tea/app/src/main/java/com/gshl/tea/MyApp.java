package com.gshl.tea;

import android.app.Application;
import android.graphics.Typeface;

import java.lang.reflect.Field;

/**
 * Created by ZengLingWen on 2017/2/23.
 */

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //设置app全局字体
        setTypeface();
    }

    public void setTypeface(){
        //加载assets中的字体文件
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/Hiragino Sans GB W3.otf");
        try
        {
            Field field_3 = Typeface.class.getDeclaredField("SANS_SERIF");
            field_3.setAccessible(true);
            field_3.set(null, typeface);
        }
        catch (NoSuchFieldException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
    }
}
