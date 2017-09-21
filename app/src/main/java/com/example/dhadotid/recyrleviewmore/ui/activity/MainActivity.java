package com.example.dhadotid.recyrleviewmore.ui.activity;

import android.widget.TextView;

import com.example.dhadotid.recyrleviewmore.R;
import com.example.dhadotid.recyrleviewmore.base.BaseApplicationActivity;
import com.example.dhadotid.recyrleviewmore.ui.activity.controller.MainController;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by dhadotid on 21/09/2017.
 */

public class MainActivity extends BaseApplicationActivity {


    MainController controller;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initiateItem() {
        ButterKnife.bind(this);
        controller = new MainController(this);
    }

}
