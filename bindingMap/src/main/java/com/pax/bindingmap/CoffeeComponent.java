package com.pax.bindingmap;


import com.pax.bindingmap.mapkey.MyCompositeKey;
import com.pax.bindingmap.mapkey.TestEnum;
import com.pax.bindingmap.objects.ElectricHeater;
import com.pax.bindingmap.objects.Heater;

import java.util.Map;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {CoffeeModule.class})
@Singleton
public interface CoffeeComponent {
    ElectricHeater makeEH();

    @SetQualifier("s1")
    Map<String, Heater> makers1();

    @SetQualifier("s2")
    Map<String, Heater> makers2();

    Map<TestEnum, String> makerEnum();
    Map<Class<?>, String> getClassMap();

    Map<MyCompositeKey, String> makeCompositeKeyMap();
}
