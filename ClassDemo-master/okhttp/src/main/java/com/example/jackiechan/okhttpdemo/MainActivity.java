package com.example.jackiechan.okhttpdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;
import java.util.HashMap;

import de.greenrobot.event.EventBus;
import de.greenrobot.event.Subscribe;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    OkHttpClient okHttpClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EventBus.getDefault().register(this);
        okHttpClient = new OkHttpClient();
        tv1 = (TextView) findViewById(R.id.content);
    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.get:
                get();
                break;
            case R.id.post:
                post();
                break;
        }
    }

    /**
     * get 请求
     */
    public void get() {
        //addHeader()添加请求头,比如 数据格式
        Request request = new Request.Builder().url("http://www.baidu.com").get().build();
        // Response execute = okHttpClient.newCall(request).execute();//如果当前execute是异步的,那么代表不是会立刻又返回值,那么返回值就有可能为空
        //如果是异步的说明下面不能立刻就执行拿取数据
        //上面的代码是同步的,只有执行完后才会结束,会阻塞主线程
        okHttpClient.newCall(request).enqueue(new Callback() {//这个是异步的
            @Override
            public void onFailure(Call call, IOException e) {//失败的的时候调用,什么时候是失败, 比如网络错误,服务器异常等非2xx 3xx 的操作

            }

            /**
             * 有返回结果的时候
             * @param call
             * @param response 返回的数据
             * @throws IOException
             */
            @Override
            public void onResponse(Call call, Response response) throws IOException {//根据最终结果测试,这里不是主线程
                final String string = response.body().string();//还在网络中//需要在子线程中获取
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        tv1.setText(string);
                    }
                });

            }
        });

    }

    /**
     * post请求
     */
    public void post() {


        // MultipartBody multipartBody;//这个是用于传递多种格式数据的请求,比如既有表单,又有文件
        // addFormDataPart()//添加表单数据
//        RequestBody requestBody = RequestBody.create(MediaType.parse("application/octet-stream"), new File(Environment.getExternalStorageDirectory() + "/111.txt"));
//        MultipartBody multipartBody = new MultipartBody.Builder().addFormDataPart("发顺丰", "圆通快递", requestBody).build();
//        Request request = new Request.Builder().url("http://api.meishi.cc/v5/faxian_new.php?format=json").post(multipartBody).build();
//        okHttpClient.newCall(request).enqueue(new Callback() {
//            @Override
//            public void onFailure(Call call, final IOException e) {
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        tv1.setText(e.getMessage());
//                    }
//                });
//            }
//
//            @Override
//            public void onResponse(Call call, Response response) throws IOException {
//                final String s = response.body().toString();
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        tv1.setText(s);
//                    }
//                });
//            }
//        });
//        FormBody formBody = new FormBody.Builder().add("source", "android").add("lon", "4.9E-324").add("lat", "4.9E-324").add("format", "json").build();
//        Request build = new Request.Builder().url("http://api.meishi.cc/v5/faxian_new.php?format=json").post(formBody).build();
//        okHttpClient.newCall(build).enqueue(new Callback() {
//            @Override
//            public void onFailure(Call call, final IOException e) {
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        tv1.setText(e.getMessage());
//                    }
//                });
//            }
//
//            @Override
//            public void onResponse(Call call, Response response) throws IOException {
//                final String s = response.body().string();
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        tv1.setText(s);
//                    }
//                });
//            }
//        });
//        FormBody formBody = new FormBody.Builder().add("source", "android").add("lon", "4.9E-324").add("lat", "4.9E-324").add("format", "json").build();
//        Request build = new Request.Builder().url("http://api.meishi.cc/v5/faxian_new.php?format=json").post(formBody).build();
//        okHttpClient.newCall(build).enqueue(new JsonCallBack(new A()));
        HashMap<String, String> map = new HashMap<>();
        map.put("source", "android");
        map.put("lon", "4.9E-324");
        map.put("lat", "4.9E-324");
        map.put("format", "json");
        MyFormBody.getData(map, "http://api.meishi.cc/v5/faxian_new.php?format=json", new JsonCallBack(new A()));
    }

    @Subscribe
    public void getData(final A a) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                tv1.setText("收到数据了===="+a.getMsg());
            }
        });

    }

}
