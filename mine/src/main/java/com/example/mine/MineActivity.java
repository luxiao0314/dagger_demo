package com.example.mine;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.AndroidInjection;


public class MineActivity extends AppCompatActivity {

    @Inject
    public User user;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine);
        TextView tvUser = findViewById(R.id.tv_user);
        tvUser.setText(user.name + "  " + user.sex);

        tvUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MineActivity.this, OtherActivity.class));
            }
        });
    }
}
