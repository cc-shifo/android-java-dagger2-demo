package com.pax.javacomponent.objects;

import javax.inject.Inject;

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
