package com.example.mine;

import dagger.Module;
import dagger.Provides;

/**
 * @Description
 * @Author luxiao418
 * @Email luxiao418@pingan.com.cn
 * @Date 17/04/2018 5:48 PM
 * @Version
 */
@Module
public class OtherActivityModule {

    @ActivityScoped
    @Provides
    Other provideOther() {
        return new Other("sean", "男");
    }
}
