package com.example.dhadotid.recyrleviewmore.connection.listener;

/**
 * Created by dhadotid on 21/09/2017.
 */

public interface PostTaskListener {

    public void onPostSuccess(int id);
    public void onPostFail();
    public void onRequestError(String errorMessage);
}
