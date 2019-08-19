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

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {CoffeeModule.class})
@Singleton
public interface CoffeeComponent {
    Heater maker();
    ElectricHeater makeH1();
    HeaterNullable makeH2();

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder setCValue(@CValueQualifer int t1);
        @BindsInstance
        Builder setFValue(@FValueQualifer int t2);
        @BindsInstance
        Builder setCStr(@CQualifier String s1);
        @BindsInstance
        Builder setFStr(@FQualifier String s2);
        @BindsInstance
        Builder setH1Str(@Nullable String s2);
        @BindsInstance
        Builder setH2Str(@H1Qualifier String s2);
        CoffeeComponent build();
    }
}
