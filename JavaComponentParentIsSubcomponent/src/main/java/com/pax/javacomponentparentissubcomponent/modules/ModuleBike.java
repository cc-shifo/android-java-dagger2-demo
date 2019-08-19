package com.pax.javacomponentparentissubcomponent.modules;


import com.pax.javacomponentparentissubcomponent.CSubcomponent2;
import com.pax.javacomponentparentissubcomponent.bindings.Bike;
import com.pax.javacomponentparentissubcomponent.scope.BScope;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = CSubcomponent2.class)
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
