package com.pax.javacomponentsubcomponent.modules;


import com.pax.javacomponentsubcomponent.CSubcomponent3;
import com.pax.javacomponentsubcomponent.bindings.Bike;
import com.pax.javacomponentsubcomponent.scope.BScope;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = CSubcomponent3.class)
public class ModuleBike {
    /**
     * ElectricHeater has no @Inject constructor. Its instance can be only obtained through new a
     * instance or with @Provides-annotated method
     */
    @BScope
    @Provides
    public Bike provideBike() {
        return new Bike();
    }

}
