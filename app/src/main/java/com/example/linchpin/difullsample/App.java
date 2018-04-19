/******************************************************************************
 * Copyright 2015 Qualcomm Technologies International, Ltd.
 ******************************************************************************/

package com.example.linchpin.difullsample;

import android.app.Application;
import android.content.Context;

public class App extends Application {



    private static AppComponent mAppComponent;

    public static App get(Context context) {
        return (App) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        initializeInjector();

        // Initiate the mesh library here
//        MeshLibraryManager.initInstance(this, MeshLibraryManager.MeshChannel.BLUETOOTH);
    }

    private void initializeInjector() {

        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();

    }


    //Just a helper to provide appComponent to local components which depend on it
    static public AppComponent getAppComponent() {
        return mAppComponent;
    }

    public void setComponent(AppComponent appComponent) {
        this.mAppComponent = appComponent;
    }
}
