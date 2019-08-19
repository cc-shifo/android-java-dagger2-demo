package com.pax.javacomponentdependency.module;

import com.pax.javacomponentdependency.bindings.Car;
import com.pax.javacomponentdependency.scope.AScope;

import dagger.Module;
import dagger.Provides;

@Module
public class ModuleCar {
    @AScope
    @Provides
    public Car provideCar() {
        return new Car();
    }
}
