package com.pax.bindinginstance;

public class CoffeeApp {

    public static void main(String[] args) {
        System.out.println("hello world! " + CoffeeApp.class);
        // @Component-annotated class must be under same the package as CoffeeApp class
        CoffeeComponent shop = DaggerCoffeeComponent.builder()
                .setCValue(1)
                .setFValue(2)
                .setCStr("C")
                .setFStr("F")
                .setH1Str(null)
                .setH2Str("H2")
                .build();
        shop.maker().on();
        shop.makeH1().on();
        shop.makeH2().on();
    }
}