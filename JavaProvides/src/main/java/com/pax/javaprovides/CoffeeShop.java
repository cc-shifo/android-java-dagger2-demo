package com.pax.javaprovides;

import com.pax.javaprovides.moduleprovides.CoffeeModule;
import com.pax.javaprovides.moduleprovides.ModuleCar;
import com.pax.javaprovides.objects.CoffeeMaker;
import com.pax.javaprovides.objects.Vehicle;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {CoffeeModule.class, ModuleCar.class})
@Singleton
/**
 * 1. add @Singleton on component interface
 * 2. add @Singleton on an @Provides method or injectable class. In this example, CoffeeMaker,
 * Thermosiphon are injectable classes; provideHeater and providePump are @Provides methods.
 */
public interface CoffeeShop {
    /**
     * return 3 CoffeeMaker instances
     */
    CoffeeMaker createMaker1();
    CoffeeMaker createMaker2();
    CoffeeMaker createMaker3();
    Vehicle getVehicle();
}