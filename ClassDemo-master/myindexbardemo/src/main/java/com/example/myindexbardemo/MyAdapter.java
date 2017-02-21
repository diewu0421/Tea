package com.example.myindexbardemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jackiechan on 16/1/15.
 */
public class MyAdapter extends BaseAdapter {
    private List<Friend> friends;//数据源
    private Context context;

    public MyAdapter(List<Friend> friends, Context context) {
        this.friends = friends;
        this.context = context;
    }

    @Override
    public int getCount() {
        return friends == null ? 0 : friends.size();
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
    public View getView(int position, View convertView, ViewGroup parent) {
        Friend friend = friends.get(position);
        ViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_list, null);
        }
        viewHolder = getHolder(convertView);
//        viewHolder.index.setText(friend.getPinyin().charAt(0));// android.content.res.Resources$NotFoundException: String resource ID #0x41//资源找不到异常,因为 charat 方法返回的是 char, 但是没有一个方法接收 char 类型,于是自动转成 int, 调用了使用资源的方式,导致出现异常
        String indexWord=friend.getPinyin().charAt(0) + "";//
        if (position!=0&&indexWord.equals(friends.get(position - 1).getPinyin().charAt(0) + "")) {//如果我的索引和上一次的一致,我就不显示了
            viewHolder.index. setVisibility(View.GONE);
        }else{
            viewHolder.index. setVisibility(View.VISIBLE);
            viewHolder.index.setText(indexWord);
        }

        viewHolder.name.setText(friend.getName());
        return convertView;
    }

    /**
     * 获取 holder 的方法
     *
     * @param convertView
     * @return
     */
    private static ViewHolder getHolder(View convertView) {
        ViewHolder viewHolder = null;
        viewHolder = (ViewHolder) convertView.getTag();
        if (viewHolder == null) {
            viewHolder = new ViewHolder(convertView);
        }
        return viewHolder;
    }

    static class ViewHolder {
        TextView index, name;

        public ViewHolder(View convertView) {
            index = (TextView) convertView.findViewById(R.id.index);
            name = (TextView) convertView.findViewById(R.id.name);
            convertView.setTag(this);
        }
    }
}
