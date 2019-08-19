package com.pax.javainject.objects;

import javax.inject.Inject;

import dagger.Lazy;

public class CoffeeMaker {
    @Inject
    ElectricHeater mHeater;

    @Inject
    public CoffeeMaker() {
    }

    public void brew() {
        mHeater.on();
        System.out.println(" [_]P coffee! [_]P ");
        mHeater.off();
    }
}
