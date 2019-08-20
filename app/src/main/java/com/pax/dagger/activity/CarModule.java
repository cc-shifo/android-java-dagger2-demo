package com.pax.dagger.activity;

import com.pax.dagger.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module
public class CarModule {

    @ActivityScope
    @Provides
    public Car newCar() {
        return new Car();
    }
}
