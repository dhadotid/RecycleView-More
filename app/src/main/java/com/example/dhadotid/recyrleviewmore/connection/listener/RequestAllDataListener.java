package com.example.dhadotid.recyrleviewmore.connection.listener;

import com.example.dhadotid.recyrleviewmore.model.TodoListModel;

import java.util.ArrayList;

/**
 * Created by dhadotid on 21/09/2017.
 */

public interface RequestAllDataListener {

    public void onDataSetResult(ArrayList<TodoListModel> response);
    public void onDataIsEmpty();
    public void onRequestError(String errorMessage);
}
