package com.pax.dagger.activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = SecondActivityComponent.class)
public abstract class SecondActivityModule {
    @Binds
    @IntoMap
    @ClassKey(SecondActivity.class)
    abstract AndroidInjector.Factory<?>
    bindAndroidInjectorFactory(SecondActivityComponent.Factory factory);
}
