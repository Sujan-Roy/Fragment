package com.example.android.fragmentlayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        Fragment_One fragment_one=new Fragment_One();
        ft.add(R.id.fragmentcontainer,fragment_one);
        ft.commit();
    }

    public void framgmentbtn(View view) {
        Fragment fragment=null;
        switch (view.getId()){
            case R.id.btn1:
                fragment=new Fragment_One();
                break;
            case R.id.btn2:
                fragment = new BlankFragment();
                break;
        }
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragmentcontainer,fragment);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.addToBackStack(null);
        ft.commit();
    }
}
