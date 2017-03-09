package com.gshl.tea.module.home.activity;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.gshl.tea.R;

/**
 * Created by ZengLingWen on 2017/3/6.
 */

public class AddShopcarDialogFragment extends DialogFragment implements View.OnClickListener {

    private AlertDialog dialog;
    private View view;
    private OnDialogViewClickListener listener;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        view = LayoutInflater.from(getContext()).inflate(R.layout.add_to_shopcar_dialog,new LinearLayout(getContext()));
        view.findViewById(R.id.add_to_shopcar_cancel).setOnClickListener(this);
        view.findViewById(R.id.add_to_shopcar_confirm).setOnClickListener(this);
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
