package com.pax.javaprovides.objects;


import java.util.Locale;

public class ElectricHeater implements Heater {
    boolean heating;
    int temp;

    public ElectricHeater() {
    }

    public ElectricHeater(int temp) {
        this.temp = temp;
    }

    @Override
    public void on() {
        System.out.println(String.format(Locale.US, "~ ~ ~ heating ~ ~ ~: %d", temp));
        this.heating = true;
    }

    @Override
    public void off() {
        this.heating = false;
    }

    @Override
    public boolean isHot() {
        return heating;
    }
}
