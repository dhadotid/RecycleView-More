package com.example.dhadotid.recyrleviewmore.ui.activity.controller;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.TextView;

import com.example.dhadotid.recyrleviewmore.R;
import com.example.dhadotid.recyrleviewmore.connection.TodoListRequest;
import com.example.dhadotid.recyrleviewmore.connection.listener.PostTaskListener;
import com.example.dhadotid.recyrleviewmore.ui.activity.AddTaskActivity;
import com.example.dhadotid.recyrleviewmore.util.Constant;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by dhadotid on 21/09/2017.
 */

public class AddTaskController{

    AddTaskActivity addTaskActivity;
    private int year = 0;
    private int month = 0;
    private int day = 0;

    String task;
    long deadline;
    long created_date;

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-yyyy", Locale.US);
    public AddTaskController(AddTaskActivity addTaskActivity){
        this.addTaskActivity = addTaskActivity;
        ButterKnife.bind(this, addTaskActivity);
    }

    public Dialog onCreateDialog(int id, Bundle args) {
        if(id == Constant.FLAG_CALENDER) {
            Calendar calendar = Calendar.getInstance();
            year = calendar.get(Calendar.YEAR);
            month = calendar.get(Calendar.MONTH);
            day = calendar.get(Calendar.DATE);

            return new DatePickerDialog(addTaskActivity, datePickerDialog, year, month, day);
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener datePickerDialog = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(android.widget.DatePicker datePicker, int i, int i1, int i2) {
            String da = "" + i2 + "-" + (i1 + 1) + "-" + i;
            addTaskActivity.getGetTanggal().setText(simpleDateFormat.format(new Date(getTimeLong(da, "dd-MM-yyyy"))));
        }
    };

    private long getTimeLong(String date, String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format, Locale.US);

        try {
            Date d = dateFormat.parse(date);
            return d.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return 0;
    }

    private Map<String, String> setParameter(String task, long deadline, long created_time) {
        Map<String, String> params = new HashMap<>();
        params.put("task", task);
        params.put("deadline", String.valueOf(deadline));
        params.put("created_time", String.valueOf(created_time));
        return params;
    }

    private void getData(){
        task = addTaskActivity.getEditTextTask().getText().toString();
        deadline = getTimeLong(addTaskActivity.getGetTanggal().getText().toString(), "dd-MMMM-yyyy");
        created_date = new Date().getTime();
    }

    @OnClick(R.id.activity_addtask_button_tambahtugas)
    public void addTaskClicked(){
        getData();
        Map<String, String> params = setParameter(task, deadline, created_date);
        new TodoListRequest(addTaskActivity).POSTTask(params, new PostTaskListener() {
            @Override
            public void onPostSuccess(int id) {
                addTaskActivity.showToast("Task dengan id: " + id + "berhasil dibuat");
                addTaskActivity.finish();
            }

            @Override
            public void onPostFail() {
                addTaskActivity.showToast("Gagal!");
            }

            @Override
            public void onRequestError(String errorMessage) {
                addTaskActivity.showToast(errorMessage);
            }
        });
    }

    @OnClick(R.id.activity_addtask_relativelayout_tanggal)
    public void setTanggal(){
        addTaskActivity.showDialog(Constant.FLAG_CALENDER);
    }

}
