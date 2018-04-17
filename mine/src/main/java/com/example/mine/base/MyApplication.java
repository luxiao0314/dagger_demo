package com.example.mine.base;



import com.example.mine.DaggerMineComponent;
import com.example.mine.MineComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/** */
public class MyApplication extends DaggerApplication {

    public static MineComponent mineComponent;

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        mineComponent = DaggerMineComponent.builder().application(this).build();
        return mineComponent;
    }
}
