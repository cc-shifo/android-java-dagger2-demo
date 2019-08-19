package com.pax.bindingset.objects;


import java.util.Locale;

public class ElectricHeater implements Heater {
    boolean heating;
    int temperature;

    public ElectricHeater(int t) {
        temperature = t;
    }


    @Override
    public void on() {
        System.out.println(String.format(Locale.US, "~ ~ ~ heating ~ ~ ~: %s", this));
        System.out.println(String.format(Locale.US, "~ ~ ~ heating ~ ~ ~: temperature name " +
                "is %02x.", temperature));
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
