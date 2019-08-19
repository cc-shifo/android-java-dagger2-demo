package com.pax.javabindsoptional.optional;


import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeCozyAProvideModule {
    /**
     * description: @Provides methods can depend on an Optional<CoffeeCozy> object
     * 3. @Provides methods can depend on an Optional<CoffeeCozy> object
     */
    @Provides
    public CoffeeCozyA provideCoffeeCozyA() {
        return new CoffeeCozyA();
    }
}
