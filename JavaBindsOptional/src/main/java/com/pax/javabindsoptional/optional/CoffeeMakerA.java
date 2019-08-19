package com.pax.javabindsoptional.optional;



import java.util.Optional;

import javax.inject.Inject;

//@Singleton
public class CoffeeMakerA {
    /**
     * 1. members can depend on an Optional<CoffeeCozy> object
     * 2. @Inject constructors can depend on an Optional<CoffeeCozy> object
     * 3. @Provides methods can depend on an Optional<CoffeeCozy> object
     */
    @Inject
    Optional<CoffeeCozyA> cozy1;
    Optional<CoffeeCozyA> cozy2;

    @Inject
    CoffeeCozyB mCozyB;

    @Inject
    CoffeeCozyC mCozyC;

    /**
     * description: @Inject constructors can depend on an Optional<CoffeeCozy> object
     */
    @Inject
    public CoffeeMakerA(Optional<CoffeeCozyA> cozy) {
        cozy2 = cozy;
    }

    public void brew() {
        if (cozy1.isPresent()) {
            System.out.println("cozy1 is present" + cozy1.get().getTemp());
//            cozy1.get().cozy();
        } else {
            System.out.println("cozy1 is absent");
        }

        if (cozy2.isPresent()) {
            System.out.println("cozy2 is present" + cozy2.get().getTemp());
//            cozy2.get().cozy();
        } else {
            System.out.println("cozy2 is absent");
        }

        mCozyB.cozy();
        mCozyC.cozy();
    }
}
