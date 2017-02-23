package com.gshl.tea.module.home.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by ZengLingWen on 2017/2/22.
 */

public abstract class CommonRVAdapter<T> extends RecyclerView.Adapter<CommonRVAdapter<T>.ViewHolder>{

//    private Context
    private List<T> mDataList;
    private int layoutId;
    private int variableId;

    public CommonRVAdapter(List<T> mDataList, int layoutId, int variableId) {
        this.mDataList = mDataList;
        this.layoutId = layoutId;
        this.variableId = variableId;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), layoutId, parent, false);
        ViewHolder holder = new ViewHolder(binding.getRoot());
        holder.binding = binding;
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
//        ((HotSellerItemLayoutBinding) holder.binding).setHotSeller(mDataList.get(position));
        fillData(holder.binding,variableId,position);
    }


    @Override
    public int getItemCount() {
        return mDataList == null ? 0 : mDataList.size();
    }


    protected abstract void fillData(ViewDataBinding binding, int variableId, int position);

    class ViewHolder extends RecyclerView.ViewHolder {
        ViewDataBinding binding;
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
