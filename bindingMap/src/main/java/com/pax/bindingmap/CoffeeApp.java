package com.pax.bindingmap;

import com.pax.bindingmap.mapkey.ClassKey;
import com.pax.bindingmap.mapkey.MyCompositeKey;
import com.pax.bindingmap.mapkey.TestEnum;
import com.pax.bindingmap.objects.Heater;

import java.math.BigDecimal;
import java.util.Map;

public class CoffeeApp {

    public static void main(String[] args) {
        System.out.println("hello world! " + CoffeeApp.class);
        // @Component-annotated class must be under same the package as CoffeeApp class
        CoffeeComponent shop = DaggerCoffeeComponent.builder()
                .build();
        Map<String, Heater> mks1 = shop.makers1();
        for (Heater h : mks1.values()) {
            h.on();
        }

        System.out.println();
        shop.makeEH().on();

        System.out.println();
        Map<String, Heater>  mks2 = shop.makers2();
        for (Map.Entry<String, Heater> entry : mks2.entrySet()) {
            entry.getValue().on();
        }

        System.out.println();
        Map<TestEnum, String>  mkEnum = shop.makerEnum();
        for (Map.Entry<TestEnum, String> entry : mkEnum.entrySet()) {
            System.out.println(entry.getValue());
        }

        System.out.println();
        System.out.println("BigDecimal.clss");
        Map<Class<?>, String>  mkClass = shop.getClassMap();
        for (Map.Entry<Class<?>, String> entry : mkClass.entrySet()) {
            System.out.println(entry.getValue());
        }

        System.out.println();
        Map<MyCompositeKey, String> m = shop.makeCompositeKeyMap();
        for (Map.Entry<MyCompositeKey, String> entry : m.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}