package com.example.mine;


import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 *
 */
@Module
public abstract class MineActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = MineActivityModule.class)
    abstract MineActivity bindDummyFragment();
}
