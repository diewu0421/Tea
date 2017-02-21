package com.example.listviewwithbuttondemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jackiechan on 16/1/11.
 */
public class MyAdapter2 extends BaseAdapter implements View.OnClickListener {
    private Context context;
    private List<String> integers = new ArrayList<>();

    public MyAdapter2(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 100;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item1, null);
        }
        CheckBox button = (CheckBox) convertView.findViewById(R.id.bt1);
        button.setTag(position);//把位置设置为 tag
//        button.setTag(R.id.aaaaaa,"fsdfsfsdf");
//        button.getTag(R.id.aaaaaa);
//        button.setText(10);//android.content.res.Resources$NotFoundException: String resource ID #0xa异常
        if (integers.contains("" + position)) {
            button.setChecked(true);
        } else {
            button.setChecked(false);
        }
//        button.setOnCheckedChangeListener(onCheckedChangeListener);
        button.setOnClickListener(this);
        return convertView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt1: //用点击事件 的原因: 如果是用选择状态变化的监听,那么控件复用的时候发生的状态变化 都走监听, 会导致执行很多无谓的代码:
                //而用点击事件的监听,那么只有点击具体按钮的时候才会执行, 其他的时候不执行,减少代码的执行量
                int posistion = (int) v.getTag();

                if (!((CheckBox) v).isChecked()) {//当前是没有选择
//                    ((CheckBox) v).setChecked(false);
                    integers.remove("" + posistion);
                } else {
//                    ((CheckBox) v).setChecked(true);
                    if (integers.contains("" + posistion)) {
                        return;
                    }
                    integers.add("" + posistion);
                    //做具体操作
                }
                break;
        }
    }
//    private CompoundButton.OnCheckedChangeListener onCheckedChangeListener=new CompoundButton.OnCheckedChangeListener() {
//        @Override
//        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//            int position = (int) buttonView.getTag();
//            if (isChecked&&!integers.contains(""+position)) {//变成选中并且集合中没有当前位置的时候
//                integers.add(position + "");
//            } else {
//                integers.remove(position + "");
//            }
//                }
//    };
}
