package com.example.mine;

import android.app.Application;

import com.example.mine.base.MyApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/** */
@Singleton
@Component(modules = {AndroidSupportInjectionModule.class})
public interface MineComponent extends AndroidInjector<MyApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        MineComponent build();
    }
}
