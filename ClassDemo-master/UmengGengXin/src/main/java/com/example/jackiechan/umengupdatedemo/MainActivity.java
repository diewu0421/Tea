package com.example.jackiechan.umengupdatedemo;

import android.net.ConnectivityManager;
import android.os.Bundle;

/**
 * 更新的实现方式:
 * 1 自己写,服务端提供一个接口 请求后会返回软件的最新版本号和下载地址,拿到版本号后和自己的版本号进行比较,如果不一致,就下载服务端返回的地址的软件,然后安装
 * 2 使用友盟,集成 sdk  一行更新的指令,U 盟会自己检查,有更新就提示用户,
 * 3 强制更新, 服务端提供一个接口,客户端将当前的版本号传递到服务端,服务端进行判断, 返回数据,根据设定的值来判断是不是停用了
 *  服务端接口一般两个参数  一个是当前软件的版本号,另外一个是系统(android, ios)
 *  数据版本:一个接口返回不同的数据 接口中带一个数据版本号 ,服务端根据这个版本号来判断返回什么数据,这个数据版本号可能不变
 *  不是说我增加一个接口 数据版本号就升级, 只有同一个接口返回的数据发生变化的的情况下 这个版本号才增加,不应该同时支持很多个数据版本
 */
public class MainActivity extends BaseActivity {
//    int i = 0;
//    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConnectivityManager ConnectivityManager;
//        NetworkInfo networkInfo = ConnectivityManager.getNetworkInfo(android.net.ConnectivityManager.TYPE_MOBILE);

//        random = new Random();
    }

//    public void onClick(View view) {
//        switch (view.getId()) {
//            case R.id.checkupdate:
////                UmengUpdateAgent.update(this);
//                i = random.nextInt(2);
//                if (i == 1) {//需要强制更新
//                    Log.e("自动更新", "强制更新" + i);
//                    setDefault(false);
//                } else {
//                    Log.e("自动更新", "软件可用" + i);
//                    setDefault(true);
//                }
//                break;
//        }
//    }


//    public void setDefault(boolean isNotTingYong) {
//        UmengUpdateAgent.setUpdateOnlyWifi(isNotTingYong);//只允许在 wifi 下下载
//        // UmengUpdateAgent.setDeltaUpdate(true);//增量更新,仅限于混淆或者是任何防护措施都没做过的,如果加密过了就不能用了
//        UmengUpdateAgent.setUpdateAutoPopup(isNotTingYong);//对话框是否弹出
//        UmengUpdateAgent.setRichNotification(true);//是否使用通知栏暂停取消i
//        UmengUpdateAgent.setUpdateUIStyle(UpdateStatus.STYLE_DIALOG);// 提示的样式,对话框或者通知栏
////        UmengUpdateAgent.setUpdateListener(null);//更新的监听
//        UmengUpdateAgent.setDialogListener(null);//对话框的监听
//        UmengUpdateAgent.setDownloadListener(null);//更新下载的监听
//        UmengUpdateAgent.setUpdateListener(new UmengUpdateListener() {
//            @Override
//            public void onUpdateReturned(int updateStatus, UpdateResponse updateInfo) {
//                switch (updateStatus) {
//                    case UpdateStatus.Yes: // has update
//                        Toast.makeText(MainActivity.this, "有更新了,不更新的话弄死你", Toast.LENGTH_SHORT).show();
//                        if (i != 1) {//代表正常的
//                            UmengUpdateAgent.showUpdateDialog(MainActivity.this, updateInfo);
//                        } else {
//                            CheckUpdate.showUpdateDialog(MainActivity.this, updateInfo);
//                        }
//                        break;
//                    case UpdateStatus.No: // has no update
//                        Toast.makeText(MainActivity.this, "没有更新", Toast.LENGTH_SHORT).show();
//                        break;
//                    case UpdateStatus.NoneWifi: // none wifi
//                        Toast.makeText(MainActivity.this, "没有wifi连接， 只在wifi下更新", Toast.LENGTH_SHORT).show();
//                        break;
//                    case UpdateStatus.Timeout: // time out
//                        Toast.makeText(MainActivity.this, "超时", Toast.LENGTH_SHORT).show();
//                        break;
//                }
//            }
//        });
//        UmengUpdateAgent.setDownloadListener(new UmengDownloadListener() {//设置下载的监听
//            @Override
//            public void OnDownloadStart() {//开始下载
//                Log.e("自动更新", "文件开始下载");
//            }
//
//            @Override
//            public void OnDownloadUpdate(int i) {//下载过程中
//                Log.e("自动更新", "文件正在下载");
//            }
//
//            @Override
//            public void OnDownloadEnd(int i, String s) {//下载结束
//                Log.e("自动更新", "文件下载完成");
//            }
//        });
//        UmengUpdateAgent.update(this);//开始检查
//    }
}
