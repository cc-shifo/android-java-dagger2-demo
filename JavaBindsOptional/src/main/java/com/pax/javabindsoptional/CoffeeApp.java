package com.pax.javabindsoptional;

import com.pax.javabindsoptional.optional.CoffeeCozyProvideModule;

public class CoffeeApp {

    public static void main(String[] args) {
        System.out.println("hello world! " + CoffeeApp.class);
        // @Component-annotated class must be under same the package as CoffeeApp class
        CoffeeShop shop =
                DaggerCoffeeShop.builder().coffeeCozyProvideModule(new CoffeeCozyProvideModule()).build();

        shop.createMakerA().brew();
    }
}