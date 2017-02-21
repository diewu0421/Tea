package com.example.jackiechan.swipetodeletedemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jackiechan on 16/1/18.
 */
public class MyAdapter extends BaseAdapter implements View.OnClickListener {
    private List<String> strings;
    private Context context;
    private ListView listView;
    public MyAdapter(List<String> strings, Context context,ListView listView) {
        this.strings = strings;
        this.context = context;
        this.listView = listView;
    }

    @Override
    public int getCount() {
        return strings == null ? 0 : strings.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item, null);
        }
        viewHolder = getHolder(convertView);
        viewHolder.swipeview.setListView(listView);
        viewHolder.swipeview.setTag(viewHolder.swipeview.getId(),position);
        viewHolder.deleteView.setTag("" + position);//把它所在的位置设置为 tag
        viewHolder.contentView.setText("当前是" + position);
        viewHolder.deleteView.setOnClickListener(this);// 设置点击事件
        return convertView;
    }

    private ViewHolder getHolder(View convertView) {
        ViewHolder viewHolder = (ViewHolder) convertView.getTag();
        if (viewHolder == null) {
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        return viewHolder;
    }

    /**
     * 点击事件
     * @param v
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.delete:
                String postion = (String) v.getTag();//拿到位置
                // 为了防止出现覆用的错乱问题,需要在移除之前先关掉当前打开的这个
                ((MySwipeView) v.getParent()).quickClose();//因为当前的控件就在MyswipeView 内部吧,通过 getparent 就可以获取到
                strings.remove(Integer.parseInt(postion));
                notifyDataSetChanged();
                break;
        }
    }

    class ViewHolder {

        TextView contentView, deleteView;
        MySwipeView swipeview;
        public ViewHolder(View convertView) {
            contentView = (TextView) convertView.findViewById(R.id.content);
            deleteView = (TextView) convertView.findViewById(R.id.delete);
            swipeview = (MySwipeView) convertView;
        }
    }
}
