package com.example.nurud.fragment;

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

    }

    public void ChangeFragment(View view) {
        switch (view.getId()){
            case R.id.f1:

                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();

                FragmentOne fragmentOne = new FragmentOne();
                ft.add(R.id.fragmentContainer,fragmentOne);
                ft.commit();
                break;

            case R.id.f2:
                FragmentManager fm2 = getSupportFragmentManager();
                FragmentTransaction ft2 = fm2.beginTransaction();

                FragmentTwo fragmentTwo = new FragmentTwo();
                ft2.replace(R.id.fragmentContainer,fragmentTwo);
                ft2.commit();
                break;
            case R.id.f3:
                FragmentManager fm3 = getSupportFragmentManager();
                FragmentTransaction ft3 = fm3.beginTransaction();

                FragmentThree fragmentThree = new FragmentThree();
                ft3.replace(R.id.fragmentContainer,fragmentThree);
                ft3.commit();
                break;
        }
    }
}
