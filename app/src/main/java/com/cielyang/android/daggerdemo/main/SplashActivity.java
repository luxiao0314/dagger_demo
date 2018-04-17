package com.cielyang.android.daggerdemo.main;

import android.content.Intent;
import android.os.Bundle;

import com.example.mine.base.BaseActivity;


public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, MainActivity.class));
    }

}
