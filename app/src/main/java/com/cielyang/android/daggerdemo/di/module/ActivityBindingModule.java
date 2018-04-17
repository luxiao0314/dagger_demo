package com.cielyang.android.daggerdemo.di.module;

import com.cielyang.android.daggerdemo.dummy.DummyActivity;
import com.cielyang.android.daggerdemo.main.MainActivity;
import com.example.mine.ActivityScoped;
import com.example.mine.MineActivity;
import com.example.mine.MineActivityModule;
import com.example.mine.OtherActivity;
import com.example.mine.OtherActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/** */
@Module
public abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindMainActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = {DummyActivityModule.class,DummyFragmentBindingModule.class})
    abstract DummyActivity bindDummyActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = MineActivityModule.class)
    abstract MineActivity bindDummyFragment();

    @ActivityScoped
    @ContributesAndroidInjector(modules = OtherActivityModule.class)
    abstract OtherActivity bindOtherActivity();
}
