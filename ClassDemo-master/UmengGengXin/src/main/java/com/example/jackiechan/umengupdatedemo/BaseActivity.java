package com.example.jackiechan.umengupdatedemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.umeng.update.UmengDownloadListener;
import com.umeng.update.UmengUpdateAgent;
import com.umeng.update.UmengUpdateListener;
import com.umeng.update.UpdateResponse;
import com.umeng.update.UpdateStatus;

import java.util.Random;

/**
 * Created by jackiechan on 16/1/25.
 */
public class BaseActivity extends AppCompatActivity {

    protected int i = 0;
    protected Random random;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setDefault(true);
        random = new Random();
        i = random.nextInt(2);
        if (i == 1) {//需要强制更新
            Log.e("自动更新", "强制更新" + i);
            setDefault(false);
        } else {
            Log.e("自动更新", "软件可用" + i);
            setDefault(true);
        }
    }

    public void setDefault(boolean isNotTingYong) {
        UmengUpdateAgent.setUpdateOnlyWifi(isNotTingYong);//只允许在 wifi 下下载
        // UmengUpdateAgent.setDeltaUpdate(true);//增量更新,仅限于混淆或者是任何防护措施都没做过的,如果加密过了就不能用了
        UmengUpdateAgent.setUpdateAutoPopup(isNotTingYong);//对话框是否弹出
        UmengUpdateAgent.setRichNotification(true);//是否使用通知栏暂停取消i
        UmengUpdateAgent.setUpdateUIStyle(UpdateStatus.STYLE_DIALOG);// 提示的样式,对话框或者通知栏
//        UmengUpdateAgent.setUpdateListener(null);//更新的监听
//        UmengUpdateAgent.setDialogListener(null);//对话框的监听
//        UmengUpdateAgent.setDownloadListener(null);//更新下载的监听
        UmengUpdateAgent.setUpdateListener(new UmengUpdateListener() {
            @Override
            public void onUpdateReturned(int updateStatus, UpdateResponse updateInfo) {
                switch (updateStatus) {
                    case UpdateStatus.Yes: // has update
                        Toast.makeText(BaseActivity.this, "有更新了,不更新的话弄死你", Toast.LENGTH_SHORT).show();
                        if (i != 1) {//代表正常的
                            UmengUpdateAgent.showUpdateDialog(BaseActivity.this, updateInfo);
                        } else {
                            CheckUpdate.showUpdateDialog(BaseActivity.this, updateInfo);
                        }
                        break;
                    case UpdateStatus.No: // has no update
                        Toast.makeText(BaseActivity.this, "没有更新", Toast.LENGTH_SHORT).show();
                        break;
                    case UpdateStatus.NoneWifi: // none wifi
                        Toast.makeText(BaseActivity.this, "没有wifi连接， 只在wifi下更新", Toast.LENGTH_SHORT).show();
                        break;
                    case UpdateStatus.Timeout: // time out
                        Toast.makeText(BaseActivity.this, "超时", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
        UmengUpdateAgent.setDownloadListener(new UmengDownloadListener() {//设置下载的监听
            @Override
            public void OnDownloadStart() {//开始下载
                Log.e("自动更新", "文件开始下载");
            }

            @Override
            public void OnDownloadUpdate(int i) {//下载过程中
                Log.e("自动更新", "文件正在下载");
            }

            @Override
            public void OnDownloadEnd(int i, String s) {//下载结束
                Log.e("自动更新", "文件下载完成");
            }
        });
        UmengUpdateAgent.update(this);//开始检查
    }
}
