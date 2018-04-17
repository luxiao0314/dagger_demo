package com.cielyang.android.daggerdemo;

import com.cielyang.android.daggerdemo.di.component.DaggerAppComponent;
import com.example.mine.base.MyApplication;

/**
 * @Description
 * @Author luxiao418
 * @Email luxiao418@pingan.com.cn
 * @Date 17/04/2018 7:42 PM
 * @Version
 */
public class App extends MyApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent
                .builder()
                .mineComponent(MyApplication.mineComponent)
                .build()
                .inject(this);
    }
}
