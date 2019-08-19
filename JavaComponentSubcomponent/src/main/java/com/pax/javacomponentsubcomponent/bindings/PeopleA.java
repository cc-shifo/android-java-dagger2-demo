package com.pax.javacomponentsubcomponent.bindings;

import java.util.Locale;

import javax.inject.Inject;

public class PeopleA {
    @Inject
    Car mCar;

    @Inject
    public PeopleA() {
    }

    public void drive() {
        System.out.println(String.format(Locale.US, "%s drive %s", this,
                mCar));
    }
}
