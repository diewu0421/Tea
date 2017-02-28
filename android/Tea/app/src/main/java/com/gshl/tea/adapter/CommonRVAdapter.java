package com.gshl.tea.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gshl.tea.constant.RecyclerViewProperty;

import java.util.List;

/**
 * Created by ZengLingWen on 2017/2/22.
 */

public class CommonRVAdapter<T> extends RecyclerView.Adapter<CommonRVAdapter<T>.BaseHolder> {

    private List<T> mDataList;
    private int[] layoutId;
    private int variableId;
    private static final int HEAD = 1;
    private static final int CONTENT = 2;
    private OnItemClickListener listener;

    public CommonRVAdapter(List<T> mDataList, int variableId, int... layoutId) {
        this.mDataList = mDataList;
        this.layoutId = layoutId;
        this.variableId = variableId;
    }

    @Override
    public BaseHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        ViewDataBinding binding;
        if (layoutId.length == 1) {
            binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), layoutId[0], parent, false);
        } else {
            if (viewType == HEAD) {
                binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), layoutId[0], parent, false);
            } else {
                binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), layoutId[1], parent, false);
            }
        }

        BaseHolder holder = new BaseHolder(binding.getRoot());
        holder.binding = binding;
        return holder;
    }

    @Override
    public void onBindViewHolder(final BaseHolder holder, final int position) {

        if (layoutId.length == 1) {  //没有头部视图
            holder.binding.setVariable(variableId, mDataList.get(position));
        } else {                     //有头部视图
            if (getItemViewType(position) == HEAD) {  //是头部视图
                holder.binding.setVariable(getHeadVariabled(), getHeadValue());
                getHeadView(holder.binding).setOnClickListener(getHeadItemViewClickListener());

            } else {                                 //不是头部视图
                holder.binding.getRoot().setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (listener != null) {
                            listener.onItemClick(view, holder.getLayoutPosition());
                        }
                    }
                });
                holder.binding.setVariable(variableId, mDataList.get(holder.getLayoutPosition() - RecyclerViewProperty.HISTORY_HEAD_COUNT));
            }
        }
    }

    protected View.OnClickListener getHeadItemViewClickListener() {
        return null;
    }

    protected View getHeadView(ViewDataBinding binding) {
        return null;
    }

    //获得头部的DataBinding的值
    protected Object getHeadValue() {
        return null;
    }

    //获取头部的DataBinding的变量ID值
    protected int getHeadVariabled() {
        return 0;
    }

    /**
     * 定义 当Item被点击的时候回调接口
     */
    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    @Override
    public int getItemViewType(int position) {
        if (layoutId.length >= 2) {
            if (position < RecyclerViewProperty.HISTORY_HEAD_COUNT) {
                return HEAD;
            } else {
                return CONTENT;
            }
        } else {
            return CONTENT;
        }
    }

    @Override
    public int getItemCount() {
//        return mDataList == null ? 0 : (mDataList.size() + RecyclerViewProperty.HISTORY_HEAD_COUNT);
        int count = -1;
        if (mDataList != null) {
            if (layoutId.length >= 2) {
                count = mDataList.size() + RecyclerViewProperty.HISTORY_HEAD_COUNT;
            } else {
                count = mDataList.size();
            }
        } else {
            count = 0;
        }
        Log.e("recyclerview" , "recyclerview的itemd数量为" + count);
        return count;
    }


    class BaseHolder extends RecyclerView.ViewHolder {
        ViewDataBinding binding;

        public BaseHolder(View itemView) {
            super(itemView);
        }
    }

//    protected abstract void fillData(ViewDataBinding binding, int variableId, int position);

//    class HeadHolder extends BaseHolder {
//
//        public HeadHolder(View itemView) {
//            super(itemView);
//        }
//    }
//
//    class ViewHolder extends BaseHolder {
//
//        public ViewHolder(View itemView) {
//            super(itemView);
//        }
//    }

}
