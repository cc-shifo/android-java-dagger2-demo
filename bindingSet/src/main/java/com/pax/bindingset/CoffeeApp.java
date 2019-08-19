package com.pax.bindingset;

import com.pax.bindingset.objects.Heater;

import java.util.Set;

public class CoffeeApp {

    public static void main(String[] args) {
        System.out.println("hello world! " + CoffeeApp.class);
        // @Component-annotated class must be under same the package as CoffeeApp class
        CoffeeComponent shop = DaggerCoffeeComponent.builder()
                .build();
        Set<Heater> mks1 = shop.makers1();
        for (Heater h : mks1) {
            h.on();
        }

        System.out.println();
        shop.makeEH().on();

        System.out.println();
        Set<Heater> mks2 = shop.makers2();
        for (Heater h : mks2) {
            h.on();
        }
    }
}