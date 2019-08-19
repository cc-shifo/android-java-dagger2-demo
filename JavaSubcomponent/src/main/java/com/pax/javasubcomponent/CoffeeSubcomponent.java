package com.pax.javasubcomponent;


import com.pax.javasubcomponent.modules.CoffeeModuleC;
import com.pax.javasubcomponent.objects.Heater;
import com.pax.javasubcomponent.quialifier.HeaterQualifier;

import javax.inject.Named;

import dagger.Subcomponent;

@Subcomponent(modules = {CoffeeModuleC.class})
public interface CoffeeSubcomponent {
    @HeaterQualifier("0XC1")
    Heater mkHeater0XC1();
    @Named("0XC2")
    Heater mkHeater0XC2();

    @Subcomponent.Builder
    interface Builder {
        CoffeeSubcomponent build();
    }
}
