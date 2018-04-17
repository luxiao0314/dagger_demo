package com.cielyang.android.daggerdemo.di.module;


import com.example.mine.ActivityScoped;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 *
 */
@Module
public class MainActivityModule {

    @ActivityScoped
    @Provides
    @Named("main")
    String provideToastContent() {
        return "Main activity injection succeed!";
    }
}
