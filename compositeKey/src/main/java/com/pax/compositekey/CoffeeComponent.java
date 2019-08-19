package com.pax.compositekey;


import java.util.Map;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {CoffeeModule.class})
@Singleton
public interface CoffeeComponent {
    @MyQualifier("A")
    Map<MyCompositeKey, String> makeCompositeKeyMapA();

    @MyQualifier("B")
    Map<MyCompositeKey, String> makeCompositeKeyMapB();
}
