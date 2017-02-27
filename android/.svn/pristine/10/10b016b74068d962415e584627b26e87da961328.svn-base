package com.gshl.tea.module.home.utils;

import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;

import com.gshl.tea.R;
import com.gshl.tea.utils.ShowToast;

/**
 * Created by ZengLingWen on 2017/2/22.
 */

public class DBUtils {

    @BindingAdapter({"hotSellerImg"})
    public static void loadHotSellerImg(ImageView iv, String imgUrl) {
        if (imgUrl != null) {
            PicassoUtil.loadImg(iv, imgUrl);
        } else {
            iv.setImageResource(R.mipmap.ic_launcher);
        }
    }

    public void onOrderInfoClick(View view) {
        ShowToast.showShortToast(view.getContext(), view.toString());
    }
}
