package com.pax.javacomponentparentissubcomponent.bindings;

import java.util.Locale;

import javax.inject.Inject;

public class PeopleB {
    @Inject
    Car mCar;

    @Inject
    Bike mBike;

    @Inject
    public PeopleB() {

    }

    public void drive() {
        System.out.println(String.format(Locale.US, "%s can drive %s and %s", this,
                mCar, mBike));
    }
}
