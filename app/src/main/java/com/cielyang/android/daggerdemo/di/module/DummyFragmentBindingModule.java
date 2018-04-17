package com.cielyang.android.daggerdemo.di.module;

import com.cielyang.android.daggerdemo.dummy.DummyFragment;
import com.example.mine.FragmentScoped;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 *
 */
@Module
public abstract class DummyFragmentBindingModule {

    @FragmentScoped
    @ContributesAndroidInjector(modules = DummyFragmentModule.class)
    abstract DummyFragment bindDummyFragment();
}
