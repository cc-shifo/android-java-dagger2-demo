package com.pax.javabindsoptional.optional;


import java.util.Locale;
import java.util.Optional;

public class CoffeeCozyC implements Cozy {
    private int temp;

    public CoffeeCozyC(Optional<CoffeeCozyA> cozy) {
        temp = 0x0C;
    }

    @Override
    public void cozy() {
        System.out.println(String.format(Locale.US, "~ ~ ~ CoffeeCozyC ~ ~ ~: %02x", temp));
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}
