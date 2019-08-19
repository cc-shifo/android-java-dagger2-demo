package com.pax.javasubcomponent.objects;


import java.util.Locale;

public class ElectricHeater implements Heater {
    String heat;
    boolean heating;
    int temp;

    public ElectricHeater() {
    }

    public ElectricHeater(int temp) {
        this.temp = temp;
    }

    public ElectricHeater(String heat) {
        this.heat = heat;
    }

    @Override
    public void on() {
        System.out.println();
        System.out.println(String.format(Locale.US, "%s: %02x", this, temp));
        System.out.println();
        this.heating = true;
    }

    @Override
    public void heatStr() {
        System.out.println();
        System.out.println(String.format(Locale.US, "%s: %s", this, heat));
        System.out.println();
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
