package com.pax.javasubcomponent;

public class CoffeeApp {

    public static void main(String[] args) {
        CoffeeComponent shop = DaggerCoffeeComponent.builder()
                .build();

        shop.mkNamedHeater().heatStr();
        shop.mkHeater0Xb0().on();
        shop.mkHeater0Xb1().on();
        shop.mkHeater0Xb2().on();
        shop.subcomponentBuilder().build().mkHeater0XC1().on();
        shop.subcomponentBuilder().build().mkHeater0XC2().on();
//        CoffeeComponent shop = DaggerCoffeeComponent.builder()
//                .build();
//        Map<MyCompositeKey, String> mA = shop.makeCompositeKeyMapA();
//        for (Map.Entry<MyCompositeKey, String> entry : mA.entrySet()) {
//            System.out.println(entry.getValue());
//        }
//
//        System.out.println();
//        Map<MyCompositeKey, String> mB = shop.makeCompositeKeyMapB();
//        for (Map.Entry<MyCompositeKey, String> entry : mB.entrySet()) {
//            System.out.println(entry.getValue());
//        }
    }
}