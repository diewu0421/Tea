package com.gshl.tea.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gshl.tea.R;
import com.gshl.tea.constant.RecyclerViewProperty;
import com.gshl.tea.databinding.HistoryHeadBinding;

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
    public void onBindViewHolder(BaseHolder holder, int position) {

        if (layoutId.length == 1) {
            holder.binding.setVariable(variableId, mDataList.get(position));
        } else {
            if (getItemViewType(position) == HEAD) {
                holder.binding.setVariable(getHeadVariabled(), getHeadValue());
//                ((HistoryHeadBinding) holder.binding).setHistoryHead();
            } else {
                holder.binding.setVariable(variableId, mDataList.get(position - 1));
            }
        }
    }

    protected Object getHeadValue() {
        return null;
    }

    protected int getHeadVariabled() {
        return 0;
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
        if (mDataList != null) {
            if (layoutId.length >= 2) {
                return mDataList.size() + RecyclerViewProperty.HISTORY_HEAD_COUNT;
            } else {
                return mDataList.size();
            }
        }else {
            return 0;
        }
    }

//    protected abstract void fillData(ViewDataBinding binding, int variableId, int position);

    class HeadHolder extends BaseHolder {

        public HeadHolder(View itemView) {
            super(itemView);
        }
    }

    class ViewHolder extends BaseHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }

    class BaseHolder extends RecyclerView.ViewHolder {
        ViewDataBinding binding;

        public BaseHolder(View itemView) {
            super(itemView);
        }
    }

}
