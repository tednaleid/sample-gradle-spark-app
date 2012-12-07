package com.naleid.sample;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module(entryPoints = ApiController.class)
public class ApiModule {

    @Provides
    @Singleton
    CookieHolder provideCookieHolder() {
        return new CookieHolder();
    }

}
