package com.cielyang.android.daggerdemo.di.module;


import com.example.mine.FragmentScoped;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 *
 */
@Module
public class DummyFragmentModule {
    
    @FragmentScoped
    @Provides
    @Named("dummy")
    static String provideContent() {
        return "Fragment injection succeed!";
    }

    @FragmentScoped
    @Provides
    @Named("content")
    static String provideString(String content) {
        return content;
    }
}
