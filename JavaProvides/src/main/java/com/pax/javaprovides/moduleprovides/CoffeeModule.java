package com.pax.javaprovides.moduleprovides;


import com.pax.javaprovides.objects.ElectricHeater;
import com.pax.javaprovides.objects.Heater;
import com.pax.javaprovides.objects.Pump;
import com.pax.javaprovides.objects.Thermosiphon;
import com.pax.javaprovides.qualifie.HeaterQualifier;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeModule {
    /**
     * ElectricHeater has no @Inject constructor. Its instance can be only obtained through new a
     * instance or with @Provides-annotated method
     */
    @Provides
    @Singleton
    public Heater provideHeater() {
        return new ElectricHeater();
    }


    @Provides
    @Singleton
    @HeaterQualifier("70")
    public Heater provideHeater70() {
        return new ElectricHeater(70);
    }

    @Provides
    @Singleton
    @Named("80")
    public Heater provideHeater80() {
        return new ElectricHeater(80);
    }

    /**
     * As Thermosiphon class has @Inject constructor，its instance will be provided by @Inject
     * constructor
     */
    @Provides
    public Pump providePump(Thermosiphon thermosiphon) {
        return thermosiphon;
    }
}
