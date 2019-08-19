package com.pax.bindingmap.mapkey;

import dagger.MapKey;

@MapKey
public @interface ClassKey {
    Class<?> value();
}
