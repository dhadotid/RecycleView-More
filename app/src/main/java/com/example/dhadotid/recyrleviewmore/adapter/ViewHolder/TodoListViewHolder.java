package com.example.dhadotid.recyrleviewmore.adapter.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.dhadotid.recyrleviewmore.R;
import com.example.dhadotid.recyrleviewmore.adapter.TodoListAdapter;
import com.example.dhadotid.recyrleviewmore.model.TodoListModel;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by dhadotid on 21/09/2017.
 */

public class TodoListViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.custom_layout_todolist_textviewnamatask)
    TextView namatask;
    @BindView(R.id.custom_layout_todolist_tanggaldeadline)
    TextView tanggaldeadline;
    @BindView(R.id.custom_layout_todolist_textviewdibuat)
    TextView tanggaldibuat;

    public TodoListViewHolder(View view){
        super(view);
        ButterKnife.bind(this, view);
    }

    public void bindDataToUI(TodoListModel todoList){
        namatask.setText(todoList.getNamaTask());
        tanggaldeadline.setText(getTanggal(todoList.getTanggalDeadline()));
        tanggaldibuat.setText(getTanggal(todoList.getTanggalDibikin()));
    }

    private String getTanggal(long tanggal){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-yyyy", Locale.US);
        return simpleDateFormat.format(new Date(tanggal));
    }
}
