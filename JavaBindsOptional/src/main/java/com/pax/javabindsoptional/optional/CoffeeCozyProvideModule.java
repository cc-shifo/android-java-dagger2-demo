package com.pax.javabindsoptional.optional;


import java.util.Optional;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeCozyProvideModule {

    /**
     * description: @Provides methods can depend on an Optional<CoffeeCozy> object
     * 3. @Provides methods can depend on an Optional<CoffeeCozy> object
     */
    @Provides
    public CoffeeCozyB provideCoffeeCozyB(Optional<CoffeeCozyA> cozyAOptional) {
        CoffeeCozyB cozyB = new CoffeeCozyB();

        if (cozyAOptional.isPresent()) {
            cozyB.setTemp(cozyAOptional.get().getTemp());
        }
        return cozyB;
    }

    @Provides
    public CoffeeCozyC provideCoffeeCozyC(Optional<CoffeeCozyA> cozyAOptional) {
        return new CoffeeCozyC(cozyAOptional);
    }
}
