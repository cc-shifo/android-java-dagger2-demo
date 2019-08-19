package com.pax.javacomponentparentissubcomponent.bindings;


public class Car {
    public Car() {
    }

    public String getBrandName() {
        return this.getClass().getName();
    }

}
