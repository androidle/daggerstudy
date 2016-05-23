package com.thinkcoo.www.draggertest;

import dagger.Module;
import dagger.Provides;

/**
 * Created by admin on 2016/5/23.
 */
@Module
public class ActivityModule {

    @Provides
    UserModule provideUserModule() {
        return new UserModule();
    }
}
