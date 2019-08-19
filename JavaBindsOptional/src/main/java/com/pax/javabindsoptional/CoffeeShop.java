package com.pax.javabindsoptional;

import com.pax.javabindsoptional.optional.CoffeeCozyOptionalModule;
import com.pax.javabindsoptional.optional.CoffeeCozyProvideModule;
import com.pax.javabindsoptional.optional.CoffeeMakerA;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {/*CoffeeCozyAProvideModule.class,*/
        CoffeeCozyOptionalModule.class,
        CoffeeCozyProvideModule.class})
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
    CoffeeMakerA createMakerA();
}