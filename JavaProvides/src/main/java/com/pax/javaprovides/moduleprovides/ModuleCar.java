package com.pax.javaprovides.moduleprovides;


import com.pax.javaprovides.objects.Car;
import com.pax.javaprovides.objects.Vehicle;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ModuleCar {
    @Binds
    public abstract Vehicle provideCar(Car car);
}
