package com.pax.javacomponentparentissubcomponent.modules;

import com.pax.javacomponentparentissubcomponent.CSubcomponent;
import com.pax.javacomponentparentissubcomponent.bindings.Car;
import com.pax.javacomponentparentissubcomponent.scope.AScope;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = {CSubcomponent.class})
public class ModuleCar {
    @AScope
    @Provides
    public Car provideCar() {
        return new Car();
    }
}
