package com.pax.javainject;

import com.pax.javainject.objects.CoffeeMaker;

/**
 * Exception in thread "main" java.lang.NullPointerException
 * at com.pax.javainject.objects.CoffeeMaker.brew(CoffeeMaker.java:16)
 * at com.pax.javainject.CoffeeApp.main(CoffeeApp.java:12)
 */
public class CoffeeApp {

    public static void main(String[] args) {
        System.out.println("hello world!");
        CoffeeMaker maker = new CoffeeMaker();
        maker.brew();
    }
}
