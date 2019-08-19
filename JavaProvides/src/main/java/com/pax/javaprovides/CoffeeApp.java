package com.pax.javaprovides;

import com.pax.javaprovides.moduleprovides.CoffeeModule;

public class CoffeeApp {

    public static void main(String[] args) {
        System.out.println("hello world! " + CoffeeApp.class);
        // @Component-annotated class must be under same the package as CoffeeApp class
        CoffeeShop shop = DaggerCoffeeShop.builder().coffeeModule(new CoffeeModule()).build();
        shop.createMaker1().brew();
        shop.createMaker2().brew();
        shop.createMaker3().brew();

        System.out.println();
        System.out.println("car brand:");
        System.out.println(shop.getVehicle().getBrandName());
    }
}