package com.pax.dagger.java;

import com.pax.dagger.java.objects.ElectricHeater;
import com.pax.dagger.java.objects.Heater;
import com.pax.dagger.java.objects.Pump;
import com.pax.dagger.java.objects.Thermosiphon;

import dagger.Module;
import dagger.Provides;

@Module
public class DripCoffeeModule {

    @Provides
    static Heater provideHeater() {
        return new ElectricHeater();
    }

    @Provides
    static Pump providePump(Thermosiphon pump) {
        return pump;
    }
}
