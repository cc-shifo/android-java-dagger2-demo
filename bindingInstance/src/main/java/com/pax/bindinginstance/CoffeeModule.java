package com.pax.bindinginstance;


import com.pax.bindinginstance.objects.ElectricHeater;
import com.pax.bindinginstance.objects.Heater;
import com.pax.bindinginstance.objects.HeaterNullable;
import com.pax.bindinginstance.qualifie.CQualifier;
import com.pax.bindinginstance.qualifie.CValueQualifer;
import com.pax.bindinginstance.qualifie.FQualifier;
import com.pax.bindinginstance.qualifie.FValueQualifer;
import com.pax.bindinginstance.qualifie.H1Qualifier;

import javax.annotation.Nullable;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeModule {
    /**
     * ElectricHeater has no @Inject constructor. Its instance can be only obtained through new a
     * instance or with @Provides-annotated method
     */
    @Provides
    @Singleton
    public Heater provideHeater(@CValueQualifer int t1, @FValueQualifer int t2, @CQualifier String s1,
                                @FQualifier String s2) {
        return new ElectricHeater(t1, t2, s1, s2);
    }

    @Provides
    public ElectricHeater provideElectricHeater(@Nullable String str) {
        return new ElectricHeater(str);
    }

    @Provides
    public HeaterNullable provideHeaterNullable(@H1Qualifier String str) {
        return new HeaterNullable(str);
    }
}
