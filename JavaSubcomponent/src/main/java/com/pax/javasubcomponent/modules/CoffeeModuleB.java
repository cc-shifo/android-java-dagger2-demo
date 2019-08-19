package com.pax.javasubcomponent.modules;


import com.pax.javasubcomponent.CoffeeSubcomponent;
import com.pax.javasubcomponent.objects.ElectricHeater;
import com.pax.javasubcomponent.objects.Heater;
import com.pax.javasubcomponent.quialifier.HeaterQualifier;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeModuleB {
    /**
     * ElectricHeater has no @Inject constructor. Its instance can be only obtained through new a
     * instance or with @Provides-annotated method
     */
    @Provides
    @Singleton
    public Heater provideHeaterb0() {
        return new ElectricHeater();
    }


    @Provides
    @Singleton
    @HeaterQualifier("0Xb1")
    public Heater provideHeaterb1() {
        return new ElectricHeater(0Xb1);
    }

    @Provides
    @Singleton
    @Named("0Xb2")
    public Heater provideHeaterb2() {
        return new ElectricHeater(0xb2);
    }

}
