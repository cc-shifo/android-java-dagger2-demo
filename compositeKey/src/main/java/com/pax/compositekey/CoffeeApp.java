package com.pax.compositekey;

import java.util.Map;

public class CoffeeApp {

    public static void main(String[] args) {
        CoffeeComponent shop = DaggerCoffeeComponent.builder()
                .build();
        Map<MyCompositeKey, String> mA = shop.makeCompositeKeyMapA();
        for (Map.Entry<MyCompositeKey, String> entry : mA.entrySet()) {
            System.out.println(entry.getValue());
        }

        System.out.println();
        Map<MyCompositeKey, String> mB = shop.makeCompositeKeyMapB();
        for (Map.Entry<MyCompositeKey, String> entry : mB.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}