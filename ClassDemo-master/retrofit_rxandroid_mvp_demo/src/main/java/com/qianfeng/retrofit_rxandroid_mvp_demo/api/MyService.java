package com.qianfeng.retrofit_rxandroid_mvp_demo.api;

//                            _ooOoo_  
//                           o8888888o  


import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jackiechan on 16/8/7.
 */
public class MyService {
    private static final String SERVERURL = "http://www.tngou.net/";//接口地址
    private static Retrofit retrofit = new Retrofit.Builder().baseUrl(SERVERURL).addConverterFactory(GsonConverterFactory.create()).addCallAdapterFactory(RxJavaCallAdapterFactory.create()).build();

    public static <T> T getApi(Class<T> tClass) {
        return retrofit.create(tClass);
    }
}
