package com.example.dhadotid.recyrleviewmore.ui.activity;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.EditText;
import android.widget.TextView;

import com.example.dhadotid.recyrleviewmore.R;
import com.example.dhadotid.recyrleviewmore.base.BaseApplicationActivity;
import com.example.dhadotid.recyrleviewmore.ui.activity.controller.AddTaskController;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by dhadotid on 21/09/2017.
 */

public class AddTaskActivity extends BaseApplicationActivity {

    @BindView(R.id.activity_addtask_edittext_tambahtugas)
    EditText editText;
    @BindView(R.id.activity_addtask_edittext_gettanggal)
    TextView getTanggal;

    AddTaskController addTaskController;

    @Override
    public int getLayoutId() {
        return R.layout.activity_addtask;
    }

    @Override
    public void initiateItem() {
        addTaskController = new AddTaskController(this);
        ButterKnife.bind(this);
    }

    @Nullable
    @Override
    protected Dialog onCreateDialog(int id, Bundle args) {
        return addTaskController.onCreateDialog(id, args);
    }


    public EditText getEditTextTask(){
        return editText;
    }

    public TextView getGetTanggal() {
        return getTanggal;
    }
}
