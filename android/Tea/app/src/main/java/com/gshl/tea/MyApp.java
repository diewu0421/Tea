package com.gshl.tea;

import android.app.Application;
import android.graphics.Typeface;
import com.gshl.tea.utils.CrashUtils;
import com.gshl.tea.utils.LogUtils;
import com.gshl.tea.utils.Utils;
import com.se7en.utils.DeviceUtils;
import com.se7en.utils.SystemUtil;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.cookie.CookieJarImpl;
import com.zhy.http.okhttp.cookie.store.PersistentCookieStore;
import com.zhy.http.okhttp.https.HttpsUtils;
import com.zhy.http.okhttp.log.LoggerInterceptor;

import java.lang.reflect.Field;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * Created by ZengLingWen on 2017/2/23.
 */

public class MyApp extends Application {
    private static MyApp appContext;

    public static MyApp getInstance() {
        return appContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化工具类
        initializeUtil();
        //初始化initDeviceTools.jar
        initLibs();
        //设置app全局字体
        setTypeface();
        //初始化okHttpUtils
        initOkhttp();
    }

    private void initOkhttp() {
        //设置可访问所有的https网站
        HttpsUtils.SSLParams sslParams = HttpsUtils.getSslSocketFactory(null, null, null);
        CookieJarImpl cookieJar = new CookieJarImpl(new PersistentCookieStore(getApplicationContext()));
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(10000L, TimeUnit.MILLISECONDS)
                .readTimeout(10000L, TimeUnit.MILLISECONDS)
                .cookieJar(cookieJar)
                .addInterceptor(new LoggerInterceptor("CharYueKeHttp"))
                .sslSocketFactory(sslParams.sSLSocketFactory, sslParams.trustManager)
                //其他配置
                .build();

        OkHttpUtils.initClient(okHttpClient);

    }

    private void initLibs() {
        DeviceUtils.setContext(this);
        SystemUtil.setContext(this);
    }

    private void initializeUtil() {
        appContext = this;
        Utils.init(appContext);
        //初始化崩溃
        CrashUtils.getInstance().init();
        //初始化日志
        LogUtils.getBuilder().setLog2FileSwitch(false).setTag("ChaYueKe").setLogFilter('v').setLogSwitch(true).create();
    }

    public void setTypeface() {
        //加载assets中的字体文件
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/Hiragino Sans GB W3.otf");
        try {
            Field field_3 = Typeface.class.getDeclaredField("SANS_SERIF");
            field_3.setAccessible(true);
            field_3.set(null, typeface);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
