package com.crud.crud.custom;



import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.crud.crud.MainActivity;
import com.crud.crud.ui.WriteFragment;
import com.google.android.material.tabs.TabLayout;
import com.lxj.xpopup.core.BasePopupView;
import com.lxj.xpopup.core.DrawerPopupView;
import com.crud.crud.R;

import java.util.ArrayList;
import java.util.List;

public class pagerdrawer extends DrawerPopupView {


    public pagerdrawer(@NonNull Context context) {
        super(context);
    }

    @Override
    protected int getImplLayoutId() {
        return R.layout.list_drawable;
    }

    @Override
    protected void onCreate() {
        super.onCreate();


    }

    @Override
    protected List<String> getInternalFragmentNames() {
        ArrayList<String> list = new ArrayList<>();
        list.add(TestFragment.class.getSimpleName());
        return list;
    }

    @Override
    protected void onShow() {
        super.onShow();
        Log.e("tag", "PagerDrawerPopup onShow");
    }

    @Override
    protected void onDismiss() {
        super.onDismiss();
        Log.e("tag", "PagerDrawerPopup onDismiss");
    }


}
