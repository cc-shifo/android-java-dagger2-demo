package com.pax.javacomponentdependency;

import com.pax.javacomponentdependency.bindings.Car;

import javax.inject.Inject;

public class PeopleB {
    @Inject
    Car mCar;

    @Inject
    public PeopleB() {
    }

    public void gotoWork() {
        mCar.drive(this.getClass().getName());
    }
}
