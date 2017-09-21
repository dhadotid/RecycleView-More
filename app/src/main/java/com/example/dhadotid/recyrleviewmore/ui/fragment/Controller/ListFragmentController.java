package com.example.dhadotid.recyrleviewmore.ui.fragment.Controller;

import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;

import com.example.dhadotid.recyrleviewmore.adapter.TodoListAdapter;
import com.example.dhadotid.recyrleviewmore.connection.TodoListRequest;
import com.example.dhadotid.recyrleviewmore.connection.listener.RequestAllDataListener;
import com.example.dhadotid.recyrleviewmore.model.TodoListModel;
import com.example.dhadotid.recyrleviewmore.ui.fragment.ListFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dhadotid on 21/09/2017.
 */

public class ListFragmentController {
    ListFragment fragment;
    ArrayList<TodoListModel> todoList = new ArrayList<>();
    TodoListAdapter adapter;

    public ListFragmentController(ListFragment fragment){
        this.fragment = fragment;
        requestData();
    }

    private void initRecycleView(){
        adapter = new TodoListAdapter(fragment.getContext(), todoList);

        fragment.getRecyclerView().setItemAnimator(new DefaultItemAnimator());
        fragment.getRecyclerView().setLayoutManager(new LinearLayoutManager(fragment.getActivity()));
        fragment.getRecyclerView().setAdapter(adapter);
    }

    private void requestData(){
        new TodoListRequest(fragment.getContext()).requestAllData(new RequestAllDataListener() {
            @Override
            public void onDataSetResult(ArrayList<TodoListModel> response) {
                todoList = response;
                initRecycleView();
            }

            @Override
            public void onDataIsEmpty() {
                fragment.showToast("Data Kosong");
            }

            @Override
            public void onRequestError(String errorMessage) {
                fragment.showToast(errorMessage);
            }
        });
    }
}
