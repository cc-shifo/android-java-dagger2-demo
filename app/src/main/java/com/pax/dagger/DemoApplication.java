package com.pax.dagger;


import android.app.Application;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;

/**
 * java.lang.RuntimeException: android.app.Application does not implement dagger.android.HasAndroidInjector
 *
 * add <application android:name=".DemoApplication"> in AndroidManifest.xml
 */
public class DemoApplication extends Application implements HasAndroidInjector {
    @Inject
    DispatchingAndroidInjector<Object> dispatchingAndroidInjector;

    private YourApplicationComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerYourApplicationComponent.builder().build();
        mAppComponent.inject(this);
    }

    @Override
    public AndroidInjector<Object> androidInjector() {
        return dispatchingAndroidInjector;
    }
}
