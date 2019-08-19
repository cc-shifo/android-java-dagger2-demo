package com.pax.javaprovides.objects;


import com.pax.javaprovides.qualifie.HeaterQualifier;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Lazy;

@Singleton
public class CoffeeMaker {
    /**
     * Because Heater class is a interface, it can't initiated by @Inject constructor. Instead,
     * use @Provides to obtain a instance
     * <p>
     * Dagger does not support injection into private fields
     */
    @Inject
    Heater heater;

    /**
     * Because Pump class is a interface, it can't initiated by @Inject constructor. Instead,
     * use @Provides to obtain a instance
     */
    @Inject
    Pump mPump;

    Heater h1;
    Pump p1;

    @Inject
    Lazy<Heater> h2;
    @Inject
    Lazy<Pump> p2;


    @Inject
    @HeaterQualifier("70")
    Heater heater3;

    @Inject
    @Named("80")
    Heater heater4;

    /**
     * use @Provides to obtain h and p instance
     */
    @Inject
    public CoffeeMaker(Heater h, Pump p) {
        h1 = h;
        p1 = p;
    }

    public void brew() {
        System.out.println(" [_]P coffee! [_]P " + "maker=" + this);
        System.out.println(" [_]P coffee! [_]P " + "heater=" + heater);
        System.out.println(" [_]P coffee! [_]P " + "pump=" + mPump);
        heater.on();
        heater.off();
        mPump.pump();

        System.out.println(" [_]P1 coffee! [_]P1 " + "heater=" + h1);
        System.out.println(" [_]P1 coffee! [_]P1 " + "pump=" + p1);
        h1.on();
        p1.pump();
        h1.off();

        System.out.println(" [_]P2 coffee! [_]P2 " + "heater=" + h2.get());
        System.out.println(" [_]P2 coffee! [_]P2 " + "pump=" + p2.get());
        h2.get().on();
        p2.get().pump();
        h2.get().off();

        System.out.println(" [_]P2 coffee! [_]P2 " + "heater70=" + heater3);
        heater3.on();
        heater3.off();
        System.out.println(" [_]P2 coffee! [_]P2 " + "heater80=" + heater4);
        heater4.on();
        heater4.off();


//        if (coffeeCozy.isPresent()) {
//            System.out.println("coffeeCozy no coffee" + coffeeCozy.get().getTemp());
//        } else {
//            System.out.println("coffeeCozy has coffee 0");
//        }

    }
}
