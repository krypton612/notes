package com.crud.crud.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.blankj.utilcode.util.ToastUtils;
import com.crud.crud.MainActivity;
import com.crud.crud.R;
import com.crud.crud.custom.PAdapter;
import com.google.android.material.tabs.TabLayout;




public class HomeFragment extends Fragment {

    TabLayout tabLayout;
    ViewPager pager;

    public HomeFragment() {

    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tabLayout = (TabLayout) getView().findViewById(R.id.tabLayout);
        pager = (ViewPager) getView().findViewById(R.id.pager);
        pager.setOffscreenPageLimit(2);
        FragmentActivity activity = (FragmentActivity) getContext();
        pager.setAdapter(new PAdapter(activity.getSupportFragmentManager()));
        tabLayout.setupWithViewPager(pager);

        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            if (i == 0) {
                tabLayout.getTabAt(i).setIcon(R.drawable.ic_home);
            } else if (i == 1){
                tabLayout.getTabAt(i).setIcon(R.drawable.ic_favorites);
            } else if (i == 2){
                tabLayout.getTabAt(i).setIcon(R.drawable.ic_like);
            }
        }

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}