package com.example.dhadotid.recyrleviewmore.connection.listener;

/**
 * Created by dhadotid on 21/09/2017.
 */

public interface DisposeDataListener {

    public void onDisposeDataSuccess();
    public void onDisposeDataFailed();
    public void onRequestError(String errorMessage);
}