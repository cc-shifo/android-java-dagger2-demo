package com.pax.javacomponentsubcomponent;

import com.pax.javacomponentsubcomponent.bindings.PeopleD;
import com.pax.javacomponentsubcomponent.modules.ModuleMoto;

import dagger.Subcomponent;

@Subcomponent(modules = ModuleMoto.class)
public interface CSubcomponent3 {
    PeopleD peopleD();

    @Subcomponent.Factory
    interface Factory {
        CSubcomponent3 createCSubcomponent3();
    }
}
