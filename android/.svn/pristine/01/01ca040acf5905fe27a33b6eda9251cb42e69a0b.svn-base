package com.gshl.tea.module.order.ui.activity;

import android.app.Dialog;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.EditText;

import com.gshl.tea.BR;
import com.gshl.tea.R;
import com.gshl.tea.activity.BaseActivity;
import com.gshl.tea.adapter.CommonRVAdapter;
import com.gshl.tea.databinding.ActivityGoodListBinding;
import com.gshl.tea.databinding.GoodListItemBinding;
import com.gshl.tea.module.order.bean.GoodList;
import com.gshl.tea.module.order.ui.fragment.RemarkDialogFragment;
import com.gshl.tea.module.order.utils.OrderRequestNet;

import java.util.ArrayList;
import java.util.List;

public class GoodListActivity extends BaseActivity implements View.OnClickListener, RemarkDialogFragment.OnDialogViewClickListener {

    private ActivityGoodListBinding bind;
    private List<GoodList> mGoodLists;
    private CommonRVAdapter adapter;
    private RemarkDialogFragment dialogFragment;
    //记录点击的编辑备注按钮的位置
    private int editPosition = -1;

    @Override
    protected void init() {
        //初始化一些属性
        initProperty();
        //初始化控件
        initView();
        //初始化adapter
        initAdapter();
        //初始化数据
        initData();
        //初始化事件
        initEvent();
    }

    private void initProperty() {
        bind = (ActivityGoodListBinding) this.binding;
        mGoodLists = new ArrayList<>();
    }

    private void initView() {

    }

    private void initAdapter() {
        mGoodLists.addAll(OrderRequestNet.loadGoodList());
        bind.setGoodListManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        adapter = new CommonRVAdapter(mGoodLists, BR.goodList, R.layout.good_list_item) {
            @Override
            protected void setOnViewClick(ViewDataBinding holder, final int position) {
                //设置编辑备注按钮的点击事件
                ((GoodListItemBinding) holder).editRamark.setTag(R.id.edit_ramark, position);
                ((GoodListItemBinding) holder).editRamark.setOnClickListener(GoodListActivity.this);
            }
        };
        bind.setGoodListAdapter(adapter);

    }

    private void initData() {

    }

    private void initEvent() {
        bind.goodListGoback.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            //点击返回按钮
            case R.id.good_list_goback:
                finish();
                break;

            //点击编辑备注按钮
            case R.id.edit_ramark:
                this.editPosition = (int) view.getTag(R.id.edit_ramark);
                dialogFragment = new RemarkDialogFragment();
                dialogFragment.show(getSupportFragmentManager(), "edit_remark");
                dialogFragment.setOnDialogViewClickListener(this);
                break;

        }
    }

    //当对话框的按钮被点击的时候
    @Override
    public void onDialogViewClick(View view) {
        Dialog dialog = dialogFragment.getDialog();
        if (view.getId() == R.id.edit_remark_cancel) {         //如果是取消按钮，则对话框消失
            if (dialog.isShowing()) {
                dialog.dismiss();
            }
        } else if (view.getId() == R.id.edit_remark_confirm) { //如果是确认按钮，则将输入框中的内容设置到备注里
            if (editPosition != -1) {
                if (dialogFragment.getDialogView() != null) {
                    //获得用户输入的内容
                    String remarkContent = ((EditText) dialogFragment.getDialogView().findViewById(R.id.edit_remark_et)).getText().toString();
                    //将用户输入的内容设置到相应的控件
                    mGoodLists.get(editPosition).setRemark(remarkContent);
                }
            }
            dialog.dismiss();
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_good_list;
    }
}
