package com.pax.javasubcomponent;


import com.pax.javasubcomponent.modules.CoffeeModuleA;
import com.pax.javasubcomponent.modules.CoffeeModuleB;
import com.pax.javasubcomponent.objects.Heater;
import com.pax.javasubcomponent.quialifier.HeaterQualifier;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {CoffeeModuleA.class, CoffeeModuleB.class})
@Singleton
public interface CoffeeComponent {
    @Named("Heater")
    Heater mkNamedHeater();

    Heater mkHeater0Xb0();
    @HeaterQualifier("0Xb1")
    Heater mkHeater0Xb1();
    @Named("0Xb2")
    Heater mkHeater0Xb2();

//    CoffeeSubcomponent getCoffeeSubcomponent();

    CoffeeSubcomponent.Builder subcomponentBuilder();
}
