package com.pax.dagger;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
abstract class YourActivityModule {
    @ContributesAndroidInjector
    abstract MainActivity contributeYourAndroidInjector();
}