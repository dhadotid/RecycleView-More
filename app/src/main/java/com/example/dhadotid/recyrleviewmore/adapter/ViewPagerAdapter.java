package com.example.dhadotid.recyrleviewmore.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.dhadotid.recyrleviewmore.ui.fragment.HomeFragment;
import com.example.dhadotid.recyrleviewmore.ui.fragment.ListFragment;

/**
 * Created by dhadotid on 21/09/2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 : {
                return new HomeFragment();
            }
            case 1: {
                return new ListFragment();
            }
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
