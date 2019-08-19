package com.pax.javacomponentsubcomponent.bindings;

import com.pax.javacomponentsubcomponent.quialifier.VehicleQualifier;

import java.util.Locale;

import javax.inject.Inject;

public class PeopleD {
    @Inject
    Car mCar;

    @Inject
    Bike mBike;

    @VehicleQualifier
    @Inject
    Moto mMoto;

    @Inject
    public PeopleD() {

    }

    public void drive() {
        System.out.println(String.format(Locale.US, "%s can drive %s, %s\n and %s", this,
                mCar, mBike, mMoto));
    }
}
