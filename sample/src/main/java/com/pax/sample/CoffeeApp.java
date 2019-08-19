package com.pax.sample;

import dagger.Component;
import javax.inject.Singleton;

public class CoffeeApp {


  public static void main(String[] args) {
    CoffeeShop coffeeShop = DaggerCoffeeShop.builder().build();
    coffeeShop.maker().brew();
  }
}
