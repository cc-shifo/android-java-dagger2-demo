package com.pax.javabindsoptional.optional;

import dagger.BindsOptionalOf;
import dagger.Module;

@Module
public abstract class CoffeeCozyOptionalModule {
    @BindsOptionalOf
    abstract CoffeeCozyA optionalCoffeeCozy();
}
