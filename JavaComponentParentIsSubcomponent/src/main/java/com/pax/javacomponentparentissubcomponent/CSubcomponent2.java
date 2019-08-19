package com.pax.javacomponentparentissubcomponent;

import com.pax.javacomponentparentissubcomponent.bindings.PeopleC;
import com.pax.javacomponentparentissubcomponent.modules.ModuleMoto;
import com.pax.javacomponentparentissubcomponent.scope.CScope;

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
