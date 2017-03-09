package com.gshl.tea.module.order.bean;

import android.databinding.ObservableField;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * Created by ZengLingWen on 2017/3/1.
 */

public class OrderList {
    public ObservableField orderNumber = new ObservableField("DH95278866888");
    public ObservableField orderState = new ObservableField("-待审核订单-");
    public ObservableField orderCount = new ObservableField("共3款，总数60");
    public ObservableField orderMoney = new ObservableField("￥1089.00（已付款）");
    public ObservableField orderTime = new ObservableField(getCurDate());

    private String getCurDate(){
        long l = System.currentTimeMillis();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-DD hh:mm:ss");
        return format.format(new Date(l));
    }
}
