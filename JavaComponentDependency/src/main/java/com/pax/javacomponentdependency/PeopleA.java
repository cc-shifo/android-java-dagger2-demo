package com.pax.javacomponentdependency;

import com.pax.javacomponentdependency.bindings.Car;

import javax.inject.Inject;

public class PeopleA {
    @Inject
    Car mCar;

    @Inject
    public PeopleA() {
    }

    public void gotoWork() {
        mCar.drive(this.getClass().getName());
    }
}
