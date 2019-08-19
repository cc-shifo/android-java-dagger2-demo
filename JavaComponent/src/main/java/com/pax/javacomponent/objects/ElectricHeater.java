package com.pax.javacomponent.objects;

import javax.inject.Inject;

public class ElectricHeater implements Heater {
    boolean heating;

    @Inject
    public ElectricHeater() {
    }

    @Override
    public void on() {
        System.out.println("~ ~ ~ heating ~ ~ ~");
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
