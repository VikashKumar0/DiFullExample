package com.example.linchpin.difullsample;

import dagger.Module;
import dagger.Provides;

/**
 * Created by linchpin on 19/4/18.
 */

@Module
class MainActivityModule {

    private MainActivity mainActivity;

    public MainActivityModule(MainActivity deviceAdapter) {
        this.mainActivity = deviceAdapter;
    }

    @Provides
    @FragmentScope
    MainActivity MainActivityModule() {
        return mainActivity;
    }

}
