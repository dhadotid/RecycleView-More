package com.example.dhadotid.recyrleviewmore.ui.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;

import com.example.dhadotid.recyrleviewmore.R;
import com.example.dhadotid.recyrleviewmore.base.BaseApplicationActivity;
import com.example.dhadotid.recyrleviewmore.ui.activity.controller.SecondController;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by dhadotid on 21/09/2017.
 */

public class SecondActivity extends BaseApplicationActivity{

    @BindView(R.id.second_activity_tabLayout)
            TabLayout tabLayout;
    @BindView(R.id.second_activity_ViewPager)
    ViewPager viewPager;

    SecondController secondController;

    @Override
    public int getLayoutId() {
        return R.layout.activity_second;
    }

    @Override
    public void initiateItem() {
        ButterKnife.bind(this);
        secondController = new SecondController(this);
    }

    public TabLayout getTabLayout() {
        return tabLayout;
    }

    public ViewPager getViewPager() {
        return viewPager;
    }
}
