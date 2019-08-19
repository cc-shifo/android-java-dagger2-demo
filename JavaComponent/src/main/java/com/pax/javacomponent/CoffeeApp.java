package com.pax.javacomponent;

import com.pax.javacomponent.objects.CoffeeMaker;

import dagger.Component;

/**
 * Exception in thread "main" java.lang.NullPointerException
 * at com.pax.javainject.objects.CoffeeMaker.brew(CoffeeMaker.java:16)
 * at com.pax.javainject.CoffeeApp.main(CoffeeApp.java:12)
 */
public class CoffeeApp {
    @Component
    public interface CoffeeShop {
        CoffeeMaker maker();
    }

    public static void main(String[] args) {
        System.out.println("hello world!");
        CoffeeShop shop = DaggerCoffeeApp_CoffeeShop.builder().build();
        shop.maker().brew();
    }
}
