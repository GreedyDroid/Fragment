package com.example.nurud.fragment;

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

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        FragmentOne  fragmentOne = new FragmentOne();
        ft.add(R.id.fragmentContainer, fragmentOne);
        ft.addToBackStack(null);
        ft.commit();

    }

    public void ChangeFragment(View view) {

        Fragment fragment = null;
        switch (view.getId()){
            case R.id.f1:
                fragment = new FragmentOne();

                break;

            case R.id.f2:
                fragment = new FragmentTwo();
                break;
            case R.id.f3:
                fragment = new FragmentThree();
                break;
        }
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragmentContainer, fragment);
        ft.addToBackStack(null);
        ft.commit();
    }
}
