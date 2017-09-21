package com.example.dhadotid.recyrleviewmore.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by dhadotid on 21/09/2017.
 */

public abstract class BaseApplicationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        initiateItem();
    }

    public void showToast(String message){
        Toast.makeText(this, "" + message, Toast.LENGTH_SHORT).show();
    }

    public abstract int getLayoutId();
    public abstract void initiateItem();
}
