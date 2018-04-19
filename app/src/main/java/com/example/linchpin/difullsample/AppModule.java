package com.example.linchpin.difullsample;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by linchpin on 19/4/18.
 */

@Module
public class AppModule {

    private final App mApp;

    public AppModule(App app) {

        this.mApp = app;
    }

    @Provides
    @Singleton
    App provideApp() {
        return mApp;
    }

    @Provides
    @Singleton
    DeviceManager provideDeviceManager(App app, DBManager dbManager) {
        return new DeviceManager(app, dbManager);
    }

//    @Provides
//    @Singleton
//    StatusManager provideStatusManager(App app) {
//        return new StatusManager(app);
//    }
}