package com.qianfeng.bluetoothdemo;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 蓝牙的操作流程
 * 1 你的设备要支持蓝牙 然后打开蓝牙
 * 2 扫描设备
 * 3 连接设备
 * 4 数据交换(通过 socket 传输流)
 */

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_ENABLE_BT = 1000;//启动蓝牙的请求码
    private BluetoothAdapter mBluetoothAdapter;//蓝牙是入口
    private MyBroadCastReciver myBroadCastReciver;//用于接收设备的广播
    private List<BluetoothDevice> mList;//存放蓝牙设备的集合
    private ListView listView;
    private MyAdapter myAdapter;
    private BluetoothDevice mBluetoothDevice;//将要连接的指定设备
    private OutputStream outputStream;
    private BluetoothSocket mBluethoothSocket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();//获取默认的  蓝牙adapter
        if (mBluetoothAdapter == null) {//如果返回空,代表设备不支持蓝牙
            Toast.makeText(this, "什么破手机,连个蓝牙都不支持,给我一百万,我帮你砸了", Toast.LENGTH_SHORT).show();
            return;
        }
        listView = (ListView) findViewById(R.id.listview);//用于显示所有蓝牙设备的列表
        mList = new ArrayList<>();
        myAdapter = new MyAdapter(mList, this);
        listView.setAdapter(myAdapter);
        IntentFilter mIntentFilter = new IntentFilter(BluetoothDevice.ACTION_FOUND);//发现蓝牙设备的意图过滤器
        mIntentFilter.addAction(BluetoothAdapter.ACTION_DISCOVERY_STARTED);//开始扫描的广播
        mIntentFilter.addAction(BluetoothAdapter.ACTION_DISCOVERY_FINISHED);//扫描结束的广播
        myBroadCastReciver = new MyBroadCastReciver();
        registerReceiver(myBroadCastReciver, mIntentFilter);//注册广播
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.startdis://开始扫描
                mList.clear();//清理掉集合
                if (!mBluetoothAdapter.isEnabled()) {// 如果蓝牙被禁用,应该要求用户启用蓝牙
                    Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                    startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
                }
                // mBluetoothAdapter.enable();//启用蓝牙.但是不推荐这种方式
                mBluetoothAdapter.startDiscovery();//启动扫描
                break;
            case R.id.openlight://开灯
                //01 99 01 00 99  十六进制
                sendControl(new byte[]{0x01, (byte) 0x99, 0x01, 0x00, (byte) 0x99});
                break;
            case R.id.closelight://关灯
                //01 99 01 01 99 十六进制
                sendControl(new byte[]{0x01, (byte) 0x99, 0x01, 0x01, (byte) 0x99});
                break;
        }
    }

    /**
     * 发送指令
     *
     * @param bs
     */
    private void sendControl(byte[] bs) {
        //应该在子线程中执行
        if (mBluetoothDevice != null) {//如果发现了指定的设备
            try {
                if (mBluethoothSocket == null) {//如果没有建立网络连接,就创建
                    mBluethoothSocket = mBluetoothDevice.createRfcommSocketToServiceRecord(UUID.fromString("00001101-0000-1000-8000-00805F9B34FB"));
                    //开始交换数据
                    mBluethoothSocket.connect();//连接
                    //获取输出流

                    outputStream = mBluethoothSocket.getOutputStream();
                }
                if (outputStream != null) {
                    outputStream.write(bs);//写入数据
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    /**
     * 用于接收蓝牙设备的广播
     */
    private class MyBroadCastReciver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            //在这里处理收到的蓝牙设备即可
            switch (intent.getAction()) {
                case BluetoothDevice.ACTION_FOUND://匹配一个发现蓝牙设备的广播
                    BluetoothDevice mBluetoothDevice = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);//通过意图获取到被发现的蓝牙设备
                    Log.e("自定义标签", "类名==MyBroadCastReciver" + "方法名==onReceive=====:" + "name===" + mBluetoothDevice.getName() + "add==" + mBluetoothDevice.getAddress());
                    if ("BRK05".equals(mBluetoothDevice.getName()) || "98:D3:31:20:7E:F1".equals(mBluetoothDevice.getAddress())) {
                        //如果是我想要的设备
                        MainActivity.this.mBluetoothDevice = mBluetoothDevice;
                    }
                    mList.add(mBluetoothDevice);
                    myAdapter.notifyDataSetChanged();
                    break;
                case BluetoothAdapter.ACTION_DISCOVERY_STARTED:
                    Toast.makeText(MainActivity.this, "开始扫描蓝牙", Toast.LENGTH_SHORT).show();
                    //  Log.e("自定义标签", "类名==MyBroadCastReciver" + "方法名==onReceive=====:" + "开始扫描蓝牙");
                    break;
                case BluetoothAdapter.ACTION_DISCOVERY_FINISHED:
                    Toast.makeText(MainActivity.this, "蓝牙扫描结束", Toast.LENGTH_SHORT).show();
                    // Log.e("自定义标签", "类名==MyBroadCastReciver" + "方法名==onReceive=====:" + "蓝牙扫描结束");

                    break;
            }
        }
    }

    /**
     * 释放资源
     */
    @Override
    protected void onDestroy() {
        unregisterReceiver(myBroadCastReciver);
        outputStream = null;
        mBluethoothSocket = null;
        mBluetoothDevice = null;
        myBroadCastReciver = null;
        super.onDestroy();
    }
}
