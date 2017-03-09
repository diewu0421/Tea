package com.gshl.tea.module.good.utils;

import com.gshl.tea.module.good.bean.NormalGood;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZengLingWen on 2017/2/28.
 */

public class RequestNetUtils {

    public static List<NormalGood> loadNormalGoodData(String message) {
        List<NormalGood> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
//            "http://www.baidu.com","红茶","￥800.00"
            NormalGood normalGood = new NormalGood();
            normalGood.price.set("800");
            normalGood.title.set(message + "红茶");
            list.add(normalGood);
        }
        return list;
    }
}
