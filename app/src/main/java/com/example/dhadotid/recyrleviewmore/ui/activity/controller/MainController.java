package com.example.dhadotid.recyrleviewmore.ui.activity.controller;

import android.content.Intent;
import android.widget.TextView;

import com.example.dhadotid.recyrleviewmore.R;
import com.example.dhadotid.recyrleviewmore.ui.activity.MainActivity;
import com.example.dhadotid.recyrleviewmore.ui.activity.SecondActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by dhadotid on 21/09/2017.
 */

public class MainController {
    MainActivity activity;

    public MainController(MainActivity activity){
        this.activity = activity;
        penghitungmundur();
    }

    private void penghitungmundur(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(activity, SecondActivity.class);
                    activity.startActivity(intent);
                    activity.finish();
                }
            }
        });
        thread.start();
    }
}
