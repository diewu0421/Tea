package com.gshl.tea.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.gshl.tea.activity.GoodAttachmentFragment;
import com.gshl.tea.activity.GoodProduceFragment;

/**
 * Created by ZengLingWen on 2017/3/8.
 */

public class GoodDetailPagerAdapter extends FragmentPagerAdapter {
    public static final int FRAGMENT_COUNT = 2;

    public GoodDetailPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        if (position == 0) {
            fragment = new GoodProduceFragment();
        } else {
            fragment = new GoodAttachmentFragment();
        }
        Bundle bundle = new Bundle();
        bundle.putInt("position",position);
        fragment.setArguments(bundle);
        return fragment;
    }


    @Override
    public int getCount() {
        return FRAGMENT_COUNT;
    }
}
