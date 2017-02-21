package com.example.jackiechan.listviewquestionsdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by jackiechan on 16/1/11.
 */
public class BaseFragment extends Fragment {
    public TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, null);
        textView = (TextView) view.findViewById(R.id.tv1);
        textView.setText(getClass().getName());//把类名设置给 textview 上面 显示
        return view;
    }
}
