package com.example.dhadotid.recyrleviewmore.ui.fragment;

import com.example.dhadotid.recyrleviewmore.R;
import com.example.dhadotid.recyrleviewmore.base.BaseApplicationFragment;
import com.example.dhadotid.recyrleviewmore.ui.fragment.Controller.HomeFragmentController;

/**
 * Created by dhadotid on 21/09/2017.
 */

public class HomeFragment extends BaseApplicationFragment {

    HomeFragmentController controller;

    @Override
    public int getLayoutID() {
        return R.layout.fragment_home;
    }

    @Override
    public void initDate() {

        controller = new HomeFragmentController(this);
    }
}
