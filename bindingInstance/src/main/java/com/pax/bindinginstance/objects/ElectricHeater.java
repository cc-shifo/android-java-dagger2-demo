package com.pax.bindinginstance.objects;


import java.util.Locale;

import javax.annotation.Nullable;

public class ElectricHeater implements Heater {
    boolean heating;
    int t1;
    int t2;
    String s1;
    String s2;
    String temperature;

    public ElectricHeater(@Nullable String t) {
        temperature = t;
    }

    public ElectricHeater(int t1, int t2, String s1, String s2) {
        this.t1 = t1;
        this.t2 = t2;
        this.s1 = s1;
        this.s2 = s2;
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
        System.out.println(String.format(Locale.US, "~ ~ ~ heating ~ ~ ~: %02x%s", t1, s1));
        System.out.println(String.format(Locale.US, "~ ~ ~ heating ~ ~ ~: %02x%s", t2, s2));
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
