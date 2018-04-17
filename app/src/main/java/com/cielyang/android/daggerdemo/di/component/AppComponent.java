package com.cielyang.android.daggerdemo.di.component;

import com.cielyang.android.daggerdemo.di.module.ActivityBindingModule;
import com.cielyang.android.daggerdemo.di.module.AppModule;
import com.example.mine.AppScope;
import com.example.mine.MineActivityBindingModule;
import com.example.mine.MineComponent;
import com.example.mine.base.MyApplication;

import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

/** */
@AppScope
@Component(
        dependencies = MineComponent.class,
        modules = {AppModule.class, ActivityBindingModule.class, AndroidSupportInjectionModule.class, MineActivityBindingModule.class})
public interface AppComponent {
    void inject(MyApplication app);
}
