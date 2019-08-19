package com.pax.javabindsoptional.optional;


import java.util.Locale;

import javax.inject.Singleton;

@Singleton
public class CoffeeCozyA implements Cozy {
    private int temp;

    public CoffeeCozyA() {
        temp = 0x0A;
    }

    @Override
    public void cozy() {
        System.out.println(String.format(Locale.US, "~ ~ ~ CoffeeCozyA ~ ~ ~: %02x", temp));
    }

    public int getTemp() {
        return temp;
    }
}
