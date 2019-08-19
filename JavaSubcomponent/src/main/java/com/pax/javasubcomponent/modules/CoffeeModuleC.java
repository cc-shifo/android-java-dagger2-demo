package com.pax.javasubcomponent.modules;


import com.pax.javasubcomponent.objects.ElectricHeater;
import com.pax.javasubcomponent.objects.Heater;
import com.pax.javasubcomponent.quialifier.HeaterQualifier;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeModuleC {
    /**
     * ElectricHeater has no @Inject constructor. Its instance can be only obtained through new a
     * instance or with @Provides-annotated method
     */
    @Provides
//    @Singleton
    @HeaterQualifier("0XC1")
    public Heater provideHeaterC1() {
        return new ElectricHeater(0Xc1);
    }

    @Provides
//    @Singleton
    @Named("0XC2")
    public Heater provideHeaterC2() {
        return new ElectricHeater(0xc2);
    }

}
