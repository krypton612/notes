package com.crud.crud.custom;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.crud.crud.ui.HomeBaseContent;

public  class PAdapter extends FragmentPagerAdapter {
    String[] titles;
    public PAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public PAdapter(@NonNull FragmentManager fm, String[] titles) {
        super(fm);

    }


    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0){

            return HomeBaseContent.create();

        }
        else {

            return TestFragment.create("Hola mundo");

        }
    }



}