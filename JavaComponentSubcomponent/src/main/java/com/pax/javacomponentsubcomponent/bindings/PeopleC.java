package com.pax.javacomponentsubcomponent.bindings;

import java.util.Locale;

import javax.inject.Inject;

public class PeopleC {
    @Inject
    Car mCar;

//    @Inject
//    Bike mBike;

    @Inject
    Moto mMoto;

    @Inject
    public PeopleC() {

    }

    public void drive() {
//        System.out.println(String.format(Locale.US, "%s can drive %s, %s\n and %s", this,
//                mCar, mBike, mMoto));
        System.out.println(String.format(Locale.US, "%s can drive %s and %s", this,
                mCar, mMoto));
    }
}
