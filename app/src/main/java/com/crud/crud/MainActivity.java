package com.crud.crud;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.crud.crud.custom.pagerdrawer;
import com.lxj.xpopup.XPopup;

import java.util.concurrent.Executor;

public class MainActivity extends AppCompatActivity {

    private ImageButton drawer_imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawer_imagen = findViewById(R.id.drawer_button);

        drawer_imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new XPopup.Builder(MainActivity.this)
                        .isDestroyOnDismiss(true) //对于只使用一次的弹窗，推荐设置这个
//                        .asCustom(new CustomDrawerPopupView(getContext()))
//                        .hasShadowBg(false)
                        .isViewMode(true) //使用了Fragment，必须开启View模式
                        .asCustom(new pagerdrawer(MainActivity.this))
//                        .asCustom(new ListDrawerPopupView(getContext()))
                        .show();
            }
        });
    }

}