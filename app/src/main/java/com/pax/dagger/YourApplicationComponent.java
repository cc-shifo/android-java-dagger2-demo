package com.pax.dagger;

import com.pax.dagger.activity.SecondActivityModule;

import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {
        AndroidSupportInjectionModule.class,
        YourActivityModule.class,
        SecondActivityModule.class
})
interface YourApplicationComponent {
    void inject(DemoApplication application);
}