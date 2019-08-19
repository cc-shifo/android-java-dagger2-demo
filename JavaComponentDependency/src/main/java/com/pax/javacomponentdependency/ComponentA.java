package com.pax.javacomponentdependency;

import com.pax.javacomponentdependency.bindings.Car;
import com.pax.javacomponentdependency.module.ModuleCar;
import com.pax.javacomponentdependency.scope.AScope;
import com.pax.javacomponentdependency.scope.BScope;

import dagger.Component;

@AScope
@Component(modules = ModuleCar.class)
public interface ComponentA {
    PeopleA peopleA();
    Car getCar();
}
