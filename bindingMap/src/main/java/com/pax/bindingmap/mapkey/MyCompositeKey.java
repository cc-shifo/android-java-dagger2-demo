package com.pax.bindingmap.mapkey;

import dagger.MapKey;

@MapKey(unwrapValue = false)
public @interface MyCompositeKey {
    String name();
    Class<?> implementingClass();
    int[] thresholds();
}
