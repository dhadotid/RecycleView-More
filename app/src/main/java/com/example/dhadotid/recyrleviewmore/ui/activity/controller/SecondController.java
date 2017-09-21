package com.example.dhadotid.recyrleviewmore.ui.activity.controller;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;

import com.example.dhadotid.recyrleviewmore.R;
import com.example.dhadotid.recyrleviewmore.adapter.ViewPagerAdapter;
import com.example.dhadotid.recyrleviewmore.ui.activity.AddTaskActivity;
import com.example.dhadotid.recyrleviewmore.ui.activity.SecondActivity;

import butterknife.BindDrawable;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by dhadotid on 21/09/2017.
 */

public class SecondController  {

    SecondActivity secondActivity;
    @BindDrawable(R.drawable.ic_action_name)
    Drawable iconHome;
    @BindDrawable(R.drawable.ic_list)
    Drawable iconList;

    public SecondController(SecondActivity secondActivity){
        this.secondActivity = secondActivity;
        ButterKnife.bind(this, secondActivity);
        initViewPager();
        initTabLayout();
    }

    private void initViewPager(){
        ViewPagerAdapter adapter = new ViewPagerAdapter(secondActivity.getSupportFragmentManager());
        secondActivity.getViewPager().setAdapter(adapter);
    }
    private void initTabLayout(){
        secondActivity.getTabLayout().setupWithViewPager(secondActivity.getViewPager());

        secondActivity.getTabLayout().removeAllTabs();

        secondActivity.getTabLayout().addTab(secondActivity.getTabLayout().newTab().setIcon(iconHome));
        secondActivity.getTabLayout().addTab(secondActivity.getTabLayout().newTab().setIcon(iconList));

    }

    @OnClick(R.id.activity_second_floatingactionbutton)
    public void onFabClicked(){
        Intent intent = new Intent(secondActivity, AddTaskActivity.class);
        secondActivity.startActivity(intent);
        secondActivity.finish();
    }
}
