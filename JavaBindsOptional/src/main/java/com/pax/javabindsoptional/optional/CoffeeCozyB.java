package com.pax.javabindsoptional.optional;


import java.util.Locale;

public class CoffeeCozyB implements Cozy {
    private int temp;

    public CoffeeCozyB() {
        temp = 0x0B;
    }

    @Override
    public void cozy() {
        System.out.println(String.format(Locale.US, "~ ~ ~ CoffeeCozyB ~ ~ ~: %02x", temp));
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}
