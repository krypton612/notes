package com.crud.crud;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.database.sqlite.SQLiteDatabase;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.load.engine.Resource;
import com.crud.crud.custom.pagerdrawer;
import com.crud.crud.db.NotesSqlite;
import com.crud.crud.fragment.BaseFragment;
import com.crud.crud.ui.AllnoteFragment;
import com.crud.crud.ui.HomeFragment;
import com.crud.crud.ui.RewriteFragment;
import com.crud.crud.ui.WriteFragment;
import com.lxj.xpopup.XPopup;
import com.lxj.xpopup.core.BasePopupView;
import com.lxj.xpopup.interfaces.OnInputConfirmListener;

import java.util.concurrent.Executor;

public class MainActivity extends AppCompatActivity {

    private ImageButton drawer_imagen;
    public static BasePopupView field;
    public static BasePopupView username_popup;

    HomeFragment cool = new HomeFragment();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.content2, new HomeFragment(), "fieldhome").commit();

        // database create
        NotesSqlite dbhelper = new NotesSqlite(MainActivity.this);
        SQLiteDatabase db = dbhelper.getWritableDatabase();

        //

        drawer_imagen = findViewById(R.id.drawer_button);
        drawer_imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                field = new XPopup.Builder(MainActivity.this)
                        .isDestroyOnDismiss(true) //对于只使用一次的弹窗，推荐设置这个
//                        .asCustom(new CustomDrawerPopupView(getContext()))
//                        .hasShadowBg(false)
                        .isViewMode(true) //使用了Fragment，必须开启View模式
                        .asCustom(new pagerdrawer(MainActivity.this));
//                        .asCustom(new ListDrawerPopupView(getContext())

                field.show();
            }
        });




    }


    public void HomeClick(View v){
        TextView comple = findViewById(R.id.homeToolbar);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        ft.replace(R.id.content2, cool).commit();
        comple.setText("Home");

        field.dismiss();

    }
    public void WriteClick(View v){
        TextView comple = findViewById(R.id.homeToolbar);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        ft.replace(R.id.content2, new WriteFragment(), "killer").commit();
        comple.setText("Write");
        field.dismiss();


    }
    public void RewriteClick(View v){
        TextView comple = findViewById(R.id.homeToolbar);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        ft.replace(R.id.content2, new RewriteFragment()).commit();
        comple.setText("Rewrite");
        field.dismiss();
    }
    public void ALLnotClick(View v){
        TextView comple = findViewById(R.id.homeToolbar);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        comple.setText("Allnotes");
        ft.replace(R.id.content2, new AllnoteFragment()).commit();

        field.dismiss();
    }

}