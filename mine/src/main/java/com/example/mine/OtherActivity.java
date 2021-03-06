package com.example.mine;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.AndroidInjection;


public class OtherActivity extends AppCompatActivity {

    @Inject
    public Other user;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        TextView tvUser = findViewById(R.id.tv_other);
        tvUser.setText(user.name + "  " + user.sex);
    }
}
