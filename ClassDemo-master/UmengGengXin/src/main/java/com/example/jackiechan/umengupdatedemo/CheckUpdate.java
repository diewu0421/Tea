package com.example.jackiechan.umengupdatedemo;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.umeng.update.UmengUpdateAgent;
import com.umeng.update.UpdateResponse;

import java.io.File;

/**
 * Created by jackiechan on 16/1/25.
 */
public class CheckUpdate {
  private static boolean isDownLoad=false;//文件是否已经下载过
    /**
     * 弹出强制更新的对话框
     */
    public static void showUpdateDialog(final Context context, final UpdateResponse updateInfo) {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        View view = LayoutInflater.from(context).inflate(R.layout.umeng_update_dialog1, null);
        TextView textView = (TextView) view.findViewById(R.id.umeng_update_content);//显示更新内容的区域
        final File file = UmengUpdateAgent.downloadedFile(context, updateInfo);
        if (file != null) {// 文件已经下载完成,不应该重新下载
            isDownLoad = true;
        }
        textView.setText("最新版本:" + updateInfo.version + "\n" +( isDownLoad?"文件已经下载完成,是否立即安装":"我也不知道些什么,随便写") + "\n" + "更新内容:" + "\n" + updateInfo.updateLog);
        Button button = (Button) view.findViewById(R.id.umeng_update_id_ok);//立即更新
        Button quit = (Button) view.findViewById(R.id.quit);//立即退出
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //点击的时候判断,如果已经下载完成 直接安装,
                if (!isDownLoad) {
                    //在这里理论上应该给用户一个提示,在手机网络的情况下, 提示用户 你正在使用手机网络,是否继续(自己写对话框提示)
                    UmengUpdateAgent.startDownload(context, updateInfo);//开始下载
                }else{//安装
                    UmengUpdateAgent.startInstall(context,file);//立即安装
                }
            }
        });
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
        builder.setCancelable(false);// 禁止取消
        builder.setView(view);
        builder.create().show();
    }
}
