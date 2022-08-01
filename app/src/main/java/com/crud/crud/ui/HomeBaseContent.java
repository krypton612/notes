package com.crud.crud.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.crud.crud.R;
import com.crud.crud.fragment.BaseFragment;


public class HomeBaseContent extends BaseFragment {
    public static HomeBaseContent create(){
        HomeBaseContent testFragment = new HomeBaseContent(

        );

        return testFragment;
    }

    @Override
    protected int getLayoutId() {


        return R.layout.homepager;
    }

    @Override
    public void init(View view) {


    }
}