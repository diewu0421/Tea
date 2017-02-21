package com.qf.a72gzhuanba;

import android.app.Application;
import android.os.Environment;

import com.nostra13.universalimageloader.cache.disc.impl.UnlimitedDiskCache;
import com.nostra13.universalimageloader.cache.memory.impl.LruMemoryCache;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import java.io.File;

/**
 * Created by Administrator on 2016/10/24.
 */
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //TODO 库的初始化
//        initImageLoader();//初始化ImageLoader
    }

    private void initImageLoader() {
        String filePath = "";
        // 如果外部储存卡处于挂载状态则使用外部储存卡,否则使用内部储存卡
        if (Environment.MEDIA_MOUNTED
                .equals(Environment.getExternalStorageState())) {
            filePath = Environment.getExternalStorageDirectory()
                    .getAbsolutePath() + "/gamehelper";
        } else {
            filePath = Environment.getDataDirectory().getAbsolutePath()
                    + "/gamehelper";
        }
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this).
                threadPoolSize(8).memoryCache(new LruMemoryCache((int) (Runtime.getRuntime().maxMemory() / 4))).diskCache(new UnlimitedDiskCache(new File(filePath))).build();
        ImageLoader.getInstance().init(config);
    }
}
