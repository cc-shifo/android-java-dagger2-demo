package com.pax.bindingmap.mapkey;

import dagger.MapKey;

@MapKey
public @interface EnumKey {
    TestEnum value();
}
