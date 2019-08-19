package com.pax.javasubcomponent.modules;

import com.pax.javasubcomponent.CoffeeSubcomponent;
import com.pax.javasubcomponent.objects.ElectricHeater;
import com.pax.javasubcomponent.objects.Heater;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = CoffeeSubcomponent.class)
public class CoffeeModuleA {
    @Provides
    @Singleton
    @Named("Heater")
    public Heater provideHeaterHeat() {
        return new ElectricHeater("heat=ModuleA");
    }
}
