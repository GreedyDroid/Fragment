package com.example.nurud.fragment;

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
                break;
            case R.id.f2:
                break;
            case R.id.f3:
                break;
        }
    }
}
