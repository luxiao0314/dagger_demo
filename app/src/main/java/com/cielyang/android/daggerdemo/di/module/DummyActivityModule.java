package com.cielyang.android.daggerdemo.di.module;

import com.cielyang.android.daggerdemo.dummy.DummyContract;
import com.cielyang.android.daggerdemo.dummy.DummyPresenter;
import com.example.mine.ActivityScoped;

import dagger.Binds;
import dagger.Module;

/** */
@Module
public abstract class DummyActivityModule {

    @ActivityScoped
    @Binds
    abstract DummyContract.Presenter bindDummyPresenter(DummyPresenter presenter);
}
