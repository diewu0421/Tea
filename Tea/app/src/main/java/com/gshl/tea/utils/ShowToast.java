package com.gshl.tea.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by ZengLingWen on 2017/2/21.
 */

public class ShowToast {
    public static void showShortToast(Context context,String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void showLongToast(Context context,String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
