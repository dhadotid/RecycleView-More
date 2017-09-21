package com.example.dhadotid.recyrleviewmore.ui.fragment;

import android.support.v7.widget.RecyclerView;

import com.example.dhadotid.recyrleviewmore.R;
import com.example.dhadotid.recyrleviewmore.base.BaseApplicationFragment;
import com.example.dhadotid.recyrleviewmore.ui.fragment.Controller.ListFragmentController;

import butterknife.BindView;

/**
 * Created by dhadotid on 21/09/2017.
 */

public class ListFragment extends BaseApplicationFragment {

    @BindView(R.id.fragment_list_recyclerview)
    RecyclerView recyclerView;

    ListFragmentController controller;

    @Override
    public int getLayoutID() {
        return R.layout.fragment_list;
    }

    @Override
    public void initDate() {
        controller = new ListFragmentController(this);
    }

    public RecyclerView getRecyclerView() {
        return recyclerView;
    }
}
