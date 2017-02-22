package com.gshl.tea.module.home.utils;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.gshl.tea.R;

/**
 * Created by ZengLingWen on 2017/2/22.
 */

public class DBUtils {

    @BindingAdapter({"hotSellerImg"})
    public static void loadHotSellerImg(ImageView iv, String imgUrl) {
        if (imgUrl != null) {
            PicassoUtil.loadImg(iv, imgUrl);
        } else {
            iv.setImageResource(R.drawable.shop_car_img);
        }
    }
}
