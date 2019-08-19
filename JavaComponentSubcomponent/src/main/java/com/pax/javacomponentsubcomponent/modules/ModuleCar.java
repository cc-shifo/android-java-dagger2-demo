package com.pax.javacomponentsubcomponent.modules;

import com.pax.javacomponentsubcomponent.CSubcomponent;
import com.pax.javacomponentsubcomponent.CSubcomponent2;
import com.pax.javacomponentsubcomponent.bindings.Car;
import com.pax.javacomponentsubcomponent.scope.AScope;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = {CSubcomponent.class, CSubcomponent2.class})
public class ModuleCar {
    @AScope
    @Provides
    public Car provideCar() {
        return new Car();
    }
}
