package com.gshl.tea.utils;

import java.util.HashMap;

/**
 * Created by ZengLingWen on 2017/3/10.
 */

public class ParamsUtils {

    private static ParamsUtils instance;

    private HashMap<String, String> map;

    private ParamsUtils() {
        map = new HashMap<>();
    }

    public static ParamsUtils getInstance() {
        if (instance == null) {
            synchronized (AnimatorUtil.class) {
                if (instance == null) {
                    instance = new ParamsUtils();
                }
            }
        }
        return instance;
    }

    /**
     * 添加参数
     *
     * @param key
     * @param value
     * @return
     */
    public ParamsUtils putParams(String key, String value) {
        map.put(key, value);
        return this;
    }


    /**
     * 清空所有参数
     *
     * @return
     */
    public ParamsUtils clearAll() {
        map.clear();
        return this;
    }

    public HashMap getMap() {
        if (map != null) {
            return map;
        }
        return null;
    }

    //得到map对象
    public HashMap create() {
        return map;
    }

}
