package com.pax.javacomponentdependency.bindings;

import java.util.Locale;

public class Car {
    public void drive(String driver) {
        System.out.println(String.format(Locale.US, "%s drives car %s", driver, this));
    }
}
