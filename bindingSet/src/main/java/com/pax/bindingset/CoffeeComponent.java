package com.pax.bindingset;


import com.pax.bindingset.objects.ElectricHeater;
import com.pax.bindingset.objects.Heater;

import java.util.Set;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {CoffeeModule.class})
@Singleton
public interface CoffeeComponent {
    ElectricHeater makeEH();

    @SetQualifier("s1")
    Set<Heater> makers1();

    @SetQualifier("s2")
    Set<Heater> makers2();
}
