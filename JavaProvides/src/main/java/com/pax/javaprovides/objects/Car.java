package com.pax.javaprovides.objects;


import javax.inject.Inject;

public class Car implements Vehicle{
    @Inject
    public Car() {
    }

    @Override
    public String getBrandName() {
        return this.getClass().getName();
    }

}
