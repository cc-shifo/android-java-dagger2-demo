package com.pax.javacomponentparentissubcomponent.modules;


import com.pax.javacomponentparentissubcomponent.bindings.Moto;
import com.pax.javacomponentparentissubcomponent.scope.CScope;

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
}

