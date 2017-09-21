package com.example.dhadotid.recyrleviewmore.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dhadotid.recyrleviewmore.R;
import com.example.dhadotid.recyrleviewmore.adapter.ViewHolder.TodoListViewHolder;
import com.example.dhadotid.recyrleviewmore.model.TodoListModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dhadotid on 21/09/2017.
 */

public class TodoListAdapter extends RecyclerView.Adapter<TodoListViewHolder> {

    Context context;
    List<TodoListModel> todoList = new ArrayList<>();

    public TodoListAdapter(Context context, List<TodoListModel> todoList){
        this.context = context;
        this.todoList = todoList;
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public TodoListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.custom_layout_todolist, null);
        return new TodoListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(TodoListViewHolder holder, int position) {
        TodoListModel model = todoList.get(position);
        holder.bindDataToUI(model);
    }

    @Override
    public int getItemCount() {
        return todoList.size();
    }
}
