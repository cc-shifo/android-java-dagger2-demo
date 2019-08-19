package com.pax.javacomponentsubcomponent;

import com.pax.javacomponentsubcomponent.bindings.PeopleC;
import com.pax.javacomponentsubcomponent.modules.ModuleBike;
import com.pax.javacomponentsubcomponent.modules.ModuleMoto;
import com.pax.javacomponentsubcomponent.scope.CScope;

import dagger.Subcomponent;

@CScope
@Subcomponent(modules = ModuleMoto.class)
public interface CSubcomponent2 {
    PeopleC peopleC();

    @Subcomponent.Factory
    interface Factory {
        CSubcomponent2 createCSubcomponent2();
    }
}
