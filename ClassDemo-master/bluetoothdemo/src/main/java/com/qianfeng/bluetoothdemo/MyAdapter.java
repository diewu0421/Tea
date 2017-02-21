package com.qianfeng.bluetoothdemo;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jackiechan on 16/6/13.
 */
public class MyAdapter extends BaseAdapter {
    private List<BluetoothDevice> mBluetoothDevices;
    private Context mContext;

    public MyAdapter(List<BluetoothDevice> mBluetoothDevices, Context mContext) {
        this.mBluetoothDevices = mBluetoothDevices;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mBluetoothDevices == null ? 0 : mBluetoothDevices.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item, null);
        }
        BluetoothDevice mBluetoothDevice = mBluetoothDevices.get(position);
        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView address = (TextView) convertView.findViewById(R.id.address);
        name.setText(mBluetoothDevice.getName());//设置蓝牙名
        address.setText(mBluetoothDevice.getAddress());//设置蓝牙的地址
        return convertView;
    }
}
