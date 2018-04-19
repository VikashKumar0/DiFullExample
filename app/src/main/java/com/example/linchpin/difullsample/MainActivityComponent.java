package com.example.linchpin.difullsample;

import dagger.Component;

/**
 * Created by linchpin on 19/4/18.
 */


@ActivityScope
@Component(
        modules = MainActivityModule.class,
        dependencies = AppComponent.class
)
public interface MainActivityComponent {

    MainActivity inject(MainActivity mainActivity);
}
