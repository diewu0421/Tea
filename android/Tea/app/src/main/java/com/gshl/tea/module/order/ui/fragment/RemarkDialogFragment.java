package com.gshl.tea.module.order.ui.fragment;

import android.app.Dialog;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.gshl.tea.R;
import com.gshl.tea.databinding.EditRemarkBinding;
import com.gshl.tea.utils.ToastUtils;
import com.se7en.utils.DeviceUtils;

/**
 * Created by ZengLingWen on 2017/3/6.
 */

public class RemarkDialogFragment extends DialogFragment implements View.OnClickListener {

    private AlertDialog dialog;
    private View view;
    private OnDialogViewClickListener listener;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        view = LayoutInflater.from(getContext()).inflate(R.layout.edit_remark,new LinearLayout(getContext()));
        view.findViewById(R.id.edit_remark_cancel).setOnClickListener(this);
        view.findViewById(R.id.edit_remark_confirm).setOnClickListener(this);
        dialog = new AlertDialog.Builder(getContext())
                .setView(view)
                .create();
        return dialog;
    }

    public View getDialogView(){
        return view;
    }

    @Override
    public void onClick(View view) {
        if (listener != null) {
            listener.onDialogViewClick(view);
        }
//        switch (view.getId()) {
//            case R.id.edit_remark_cancel:
////                if (dialog.isShowing()) {
////                    dialog.dismiss();
////                }
//                break;
//
//            case R.id.edit_remark_confirm:
//
//                break;
//        }
    }

    public interface OnDialogViewClickListener{
        void onDialogViewClick(View view);
    }

    public void setOnDialogViewClickListener(OnDialogViewClickListener listener) {
        this.listener = listener;
    }
}
