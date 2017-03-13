package com.gshl.tea.module.me.activity;

import android.databinding.ViewDataBinding;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;

import com.gshl.tea.BR;
import com.gshl.tea.R;
import com.gshl.tea.activity.BaseActivity;
import com.gshl.tea.adapter.CommonRVAdapter;
import com.gshl.tea.constant.RequestUrl;
import com.gshl.tea.databinding.ActivityReceivingAddressBinding;
import com.gshl.tea.databinding.ReceivingAddressItemBinding;
import com.gshl.tea.i.BaseOkhttpCallback;
import com.gshl.tea.module.me.bean.ReceivingAddressInfo;
import com.gshl.tea.utils.LogUtils;
import com.gshl.tea.utils.RecyclerViewPoolUtils;
import com.gshl.tea.utils.RequestNetUtils;
import com.gshl.tea.utils.StatusBarCompat;
import com.gshl.tea.utils.ToastUtils;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;

public class ReceivingAddressActivity extends BaseActivity implements View.OnClickListener {

    private ActivityReceivingAddressBinding bind;

    private List<ReceivingAddressInfo.DataBean.AddressListBean> mAddress;
    private CommonRVAdapter adapter;
    private List<ViewDataBinding> itemBindings;

    @Override
    protected void init() {
        //初始化一些属性
        initProperty();
        //初始化控件
        initView();
        //初始化数据
        initData();
        //初始化adapter
        initAdapter();
        //初始化事件
        initEvent();
    }

    private void initProperty() {
        bind = (ActivityReceivingAddressBinding) this.binding;
        StatusBarCompat.compat(this, R.color.bg_color_f4f4f4);
        mAddress = new ArrayList<>();
    }

    private void initView() {

    }

    private void initData() {

        RequestNetUtils.get(
                RequestUrl.RECEIVING_ADDRESS,
                null,
                new BaseOkhttpCallback<ReceivingAddressInfo>() {
                    @Override
                    public void onResponse(ReceivingAddressInfo response, int id) {
                        if (response == null) return;
                        if (response.getData() == null) return;
                        if (response.getData().getAddressList() == null && response.getData().getAddressList().size() == 0) {
                            ToastUtils.showShortToast(ReceivingAddressActivity.this,"获取数据失败...");
                            return;
                        }else {
                            LogUtils.e(response.getData().getAddressList().toString());
                        }
                        handlerRequestResult(response);
                    }

                    @Override
                    public void onError(Call call, Exception e, int id) {
                        ToastUtils.showShortToast(ReceivingAddressActivity.this,"获取数据失败...");

                    }

                    @Override
                    protected Class<ReceivingAddressInfo> getClassObject() {
                        return ReceivingAddressInfo.class;
                    }
                });
    }

    /**
     * 处理请求结果
     * @param response
     */
    private void handlerRequestResult(ReceivingAddressInfo response) {
        final List<ReceivingAddressInfo.DataBean.AddressListBean> addressList = response.getData().getAddressList();
        adapter.notifyItemInsert(addressList, 0);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                setDefaultReceiving(mAddress,getDefaultReceivingPosition(mAddress));
            }
        }, 10);

    }

    /**
     * 设置默认的收货地址
     * @param mAddress
     */
    private void setDefaultReceiving(List<ReceivingAddressInfo.DataBean.AddressListBean> mAddress,int position) {
//        if (itemBindings.size() == 0) return;
//        for (int i = 0; i < mAddress.size(); i++) {
//            if (mAddress.get(i).getState() == 2) {
//                ((ReceivingAddressItemBinding) itemBindings.get(i)).receivingDefault.setImageResource(R.mipmap.btn_quan_h);
//            }else {
//                ((ReceivingAddressItemBinding) itemBindings.get(i)).receivingDefault.setImageResource(R.mipmap.btn_quan);
//
//            }
//        }

        if (itemBindings.size() == 0) return;
        if (position == -1 ) {
            ((ReceivingAddressItemBinding) itemBindings.get(0)).receivingDefault.setImageResource(R.mipmap.btn_quan_h);
            return;
        }


        //先把所有的item设置为不是默认的状态
        for (int i = 0; i < mAddress.size(); i++) {
            ((ReceivingAddressItemBinding) itemBindings.get(i)).receivingDefault.setImageResource(R.mipmap.btn_quan);
        }

        // 然后把指定位置的position设置为默认状态
        ((ReceivingAddressItemBinding) itemBindings.get(position)).receivingDefault.setImageResource(R.mipmap.btn_quan_h);
    }

    /**
     * 获取默认地址的位置
     * @param mAddress
     * @return
     */
    private int getDefaultReceivingPosition(List<ReceivingAddressInfo.DataBean.AddressListBean> mAddress) {
        if (itemBindings.size() == 0) return -1;
        for (int i = 0; i < mAddress.size(); i++) {
            if (mAddress.get(i).getState() == 2) {
                return i;
            }
        }
        return -1;
    }

    private void initAdapter() {
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        //开始RecyclerViewPool特性
        manager.setRecycleChildrenOnDetach(true);
        bind.setRvLinearManager(manager);
        //如果item的高度是固定值的话，设置true可以提高性能
        bind.receiveRv.setHasFixedSize(true);
        //设置共享的pool，提高性能
        bind.receiveRv.setRecycledViewPool(RecyclerViewPoolUtils.getInstance().getRecyclerViewPool());
        adapter = new CommonRVAdapter(mAddress, BR.addressInfo, R.layout.receiving_address_item){
            @Override
            protected void setOnViewClick(ViewDataBinding itemBinding, int position) {
                ((ReceivingAddressItemBinding) itemBinding).receiveSetDefault.setTag(R.id.receive_set_default,position);
                ((ReceivingAddressItemBinding) itemBinding).receiveSetDefault.setOnClickListener(ReceivingAddressActivity.this);
            }
        };
        itemBindings = adapter.getmItemBindings();
        bind.setRvAdapter(adapter);

    }

    private void initEvent() {
        bind.receiveGoback.setOnClickListener(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_receiving_address;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            //返回
            case R.id.receive_goback:
                finish();
                break;

            //点击item的设置默认地址
            case R.id.receive_set_default:
                setDefaultReceiving(mAddress, ((int) view.getTag(R.id.receive_set_default)));
                break;

        }
    }
}
