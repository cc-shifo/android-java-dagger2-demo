package com.pax.bindingset;

import com.pax.bindingset.objects.ElectricHeater;
import com.pax.bindingset.objects.Heater;

import java.util.HashSet;
import java.util.Set;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ElementsIntoSet;
import dagger.multibindings.IntoSet;

@Module
public class CoffeeModule {
    /**
     * ElectricHeater has no @Inject constructor. Its instance can be only obtained through new a
     * instance or with @Provides-annotated method
     */
    @Provides
    @Singleton
    public Heater provideHeater() {
        return new ElectricHeater(0);
    }

    @Provides
    public ElectricHeater provideElectricHeater() {
        return new ElectricHeater(-1);
    }

    @Provides
    @SetQualifier("s1")
    @IntoSet
    public Heater provideH1() {
        return new ElectricHeater(1);
    }

    @Provides
    @SetQualifier("s1")
    @IntoSet
    public Heater provideH2() {
        return new ElectricHeater(2);
    }

    @Provides
    @SetQualifier("s2")
    @ElementsIntoSet
    public Set<Heater> provideSet() {
        HashSet<Heater> set = new HashSet<>();
        set.add(new ElectricHeater(10));
        set.add(new ElectricHeater(11));
        set.add(new ElectricHeater(12));
        return set;
    }
}
