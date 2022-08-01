package com.crud.crud.custom;


import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.crud.crud.R;
import com.crud.crud.fragment.BaseFragment;


public class TestFragment extends BaseFragment {

    public static TestFragment create(String text){
        TestFragment testFragment = new TestFragment();
        Bundle bundle = new Bundle();
        bundle.putString("text", text);
        testFragment.setArguments(bundle);
        return testFragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.test_fragment;
    }

    @Override
    public void init(View view) {
        String text = getArguments().getString("text", "XPopup");
        view.<TextView>findViewById(R.id.tv).setText(text);
    }
}