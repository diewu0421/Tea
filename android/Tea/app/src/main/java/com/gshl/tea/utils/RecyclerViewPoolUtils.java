package com.gshl.tea.utils;

import android.support.v7.widget.RecyclerView;

/**
 * Created by ZengLingWen on 2017/3/9.
 */

public class RecyclerViewPoolUtils {
    private static RecyclerViewPoolUtils instance = null;
    private RecyclerView.RecycledViewPool pool;

    private RecyclerViewPoolUtils() {
        if (pool == null) {
            pool = new RecyclerView.RecycledViewPool();
        }

    }
    public static RecyclerViewPoolUtils getInstance() {
        if (instance == null) {
            synchronized (RecyclerViewPoolUtils.class) {
                if (instance == null) {
                    instance = new RecyclerViewPoolUtils();
                }
            }
        }
        return instance;
    }

    public RecyclerView.RecycledViewPool getRecyclerViewPool() {
        return this.pool;
    }
}
