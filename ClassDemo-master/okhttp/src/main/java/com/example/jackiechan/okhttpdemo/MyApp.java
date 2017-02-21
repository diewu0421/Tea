package com.example.jackiechan.okhttpdemo;

import android.app.Application;

import okhttp3.OkHttpClient;

/**
 * Created by jackiechan on 16/1/28.
 */
public class MyApp extends Application {

   public static OkHttpClient okHttpClient;
    @Override
    public void onCreate() {
        super.onCreate();
        okHttpClient=new OkHttpClient();
    }
}
