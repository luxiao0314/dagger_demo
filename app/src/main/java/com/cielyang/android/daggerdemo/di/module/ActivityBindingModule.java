package com.cielyang.android.daggerdemo.di.module;

import com.cielyang.android.daggerdemo.dummy.DummyActivity;
import com.cielyang.android.daggerdemo.main.MainActivity;
import com.example.mine.ActivityScoped;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/** */
@Module
public abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindMainActivity();

    @ActivityScoped
    @ContributesAndroidInjector(
            modules = {DummyActivityModule.class,DummyFragmentBindingModule.class}
    )
    abstract DummyActivity bindDummyActivity();
}
