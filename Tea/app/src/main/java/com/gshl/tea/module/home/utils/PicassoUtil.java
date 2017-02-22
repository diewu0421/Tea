package com.gshl.tea.module.home.utils;

        import android.widget.ImageView;

        import com.squareup.picasso.Picasso;

/**
 * Created by ZengLingWen on 2017/2/22.
 */

public class PicassoUtil {
    public static void loadImg(ImageView iv, String imgUrl) {
        Picasso.with(iv.getContext()).load(imgUrl).into(iv);
    }
}