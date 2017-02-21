package com.qianfeng.rxandroiddemo1;

//                            _ooOoo_  
//                           o8888888o  
//                           88" . "88  
//                           (| -_- |)  
//                            O\ = /O  
//                        ____/`---'\____  
//                      .   ' \\| |// `.  
//                       / \\||| : |||// \  
//                     / _||||| -:- |||||- \  
//                       | | \\\ - /// | |  
//                     | \_| ''\---/'' | |  
//                      \ .-\__ `-` ___/-. /  
//                   ___`. .' /--.--\ `. . __  
//                ."" '< `.___\_<|>_/___.' >'"".  
//               | | : `- \`.;`\ _ /`;.`/ - ` : | |  
//                 \ \ `-. \_ __\ /__ _/ .-` / /  
//         ======`-.____`-.___\_____/___.-`____.-'======  
//                            `=---='  
//  
//         .............................................  
//                  佛祖镇楼                  BUG辟易  
//          佛曰:  
//                  写字楼里写字间，写字间里程序员；  
//                  程序人员写程序，又拿程序换酒钱。  
//                  酒醒只在网上坐，酒醉还来网下眠；  
//                  酒醉酒醒日复日，网上网下年复年。  
//                  但愿老死电脑间，不愿鞠躬老板前；  
//                  奔驰宝马贵者趣，公交自行程序员。  
//                  别人笑我忒疯癫，我笑自己命太贱；  
//                  不见满街漂亮妹，哪个归得程序员？  

import android.util.Log;

import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import rx.Observable;
import rx.Subscriber;

/**
 * Created by jackiechan on 16/6/19.
 */
public class HttpUtils {
    private static OkHttpClient mOkHttpClient = new OkHttpClient();

    //上网请求数据的封装方法
    public static void getData(String url, Callback callback) {
        Request.Builder mBuilder = new Request.Builder();
        Request build = mBuilder.url(url).get().build();
        mOkHttpClient.newCall(build).enqueue(callback);
    }

    /**
     * 利用RXandroid 请求
     *
     * @param url
     */
    public static Observable<MyBaseJson> jsonRequest(String url, Class clzz) {
        Observable<MyBaseJson> myBaseJsonObservable = Observable.create(new Observable.OnSubscribe<MyBaseJson>() {
            @Override
            public void call(Subscriber<? super MyBaseJson> subscriber) {
                Log.e("自定义标签", "类名==HttpUtils()" + "方法名==call()"+Thread.currentThread().getName());
                //获取数据并且发射数据
                Request.Builder mBuilder = new Request.Builder();
                Request build = mBuilder.url(url).get().build();
                mOkHttpClient.newCall(build).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {

                    }

                    /**
                     * 这个方法在子线程
                     * @param call
                     * @param response
                     * @throws IOException
                     */
                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        //获取网络数据
                        String json = response.body().string();
                        MyBaseJson myBaseJson = (MyBaseJson) new Gson().fromJson(json, clzz);
                        subscriber.onNext(myBaseJson);
                    }
                });
            }
        });
        return myBaseJsonObservable;
    }

    public static Observable<String> threadMethod() {
        Observable<String> observable=Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                //假如这里要执行耗时操作,应该放到子线程,RxAndroid 提供了一个切换线程的方法
                Log.e("自定义标签", "类名==HttpUtils()" + "方法名==call()="+Thread.currentThread().getName());
                subscriber.onNext("这是测试线程用的");
            }
        });

        return observable;
    }
}
