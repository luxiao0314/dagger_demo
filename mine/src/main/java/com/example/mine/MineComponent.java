package com.example.mine;

import com.example.mine.base.MyApplication;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/** */
@Singleton
@Component(modules = {AndroidSupportInjectionModule.class})
public interface MineComponent extends AndroidInjector<MyApplication> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<MyApplication> {
    }
}
