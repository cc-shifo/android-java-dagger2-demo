package com.pax.bindinginstance.objects;


import java.util.Locale;

import javax.annotation.Nullable;

public class HeaterNullable implements Heater {
    boolean heating;
    String temperature;

    public HeaterNullable(@Nullable String t) {
        temperature = t;
    }

    @Override
    public void on() {
        System.out.println(String.format(Locale.US, "~ ~ ~ heating ~ ~ ~: %s", this));
        if (temperature == null) {
            System.out.println(String.format(Locale.US, "~ ~ ~ heating ~ ~ ~: temperature name " +
                    "is null."));
        } else {
            System.out.println(String.format(Locale.US, "~ ~ ~ heating ~ ~ ~: temperature name " +
                    "is %s.", temperature));
        }
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
