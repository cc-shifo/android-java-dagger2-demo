package com.pax.dagger.java.objects;

import javax.inject.Inject;

public class Thermosiphon implements Pump {
    private final Heater heater;

    @Inject
    public Thermosiphon(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void pump() {

    }
}
