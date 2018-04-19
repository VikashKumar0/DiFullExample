package com.example.linchpin.difullsample;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by linchpin on 19/4/18.
 */

@Singleton
@Component(
        modules = AppModule.class
)
public interface AppComponent {

    void inject(App app);

    App getApplication();

    DBManager getDBManager();

    DeviceManager getDeviceManager();

//    StatusManager getStatusManager();
}
