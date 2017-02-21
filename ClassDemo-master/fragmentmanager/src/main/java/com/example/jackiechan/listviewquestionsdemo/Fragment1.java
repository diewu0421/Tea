package com.example.jackiechan.listviewquestionsdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jackiechan on 16/1/11.
 */
public class Fragment1 extends Fragment{
    private ViewPager viewPager;
    private List<BaseFragment> baseFragmentList;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, null);
        viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        baseFragmentList = new ArrayList<>();
        baseFragmentList.add(new FragmentInner1());
        baseFragmentList.add(new FragmentInner2());
        baseFragmentList.add(new FragmentInner4());
        baseFragmentList.add(new FragmentInner5());
        baseFragmentList.add(new FragmentInner3());

        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(getChildFragmentManager(), baseFragmentList);
        viewPager.setAdapter(myPagerAdapter);
        return view;
    }
}
