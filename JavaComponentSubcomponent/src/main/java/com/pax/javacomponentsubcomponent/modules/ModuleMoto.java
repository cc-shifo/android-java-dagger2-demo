package com.pax.javacomponentsubcomponent.modules;


import com.pax.javacomponentsubcomponent.bindings.Moto;
import com.pax.javacomponentsubcomponent.quialifier.VehicleQualifier;
import com.pax.javacomponentsubcomponent.scope.CScope;

import dagger.Module;
import dagger.Provides;

@Module
public class ModuleMoto {
    /**
     * ElectricHeater has no @Inject constructor. Its instance can be only obtained through new a
     * instance or with @Provides-annotated method
     */
    @CScope
    @Provides
    public Moto provideMoto() {
        return new Moto();
    }

    @VehicleQualifier
    @Provides
    public Moto provideMotoD() {
        return new Moto();
    }
}
