package com.pax.javacomponentsubcomponent;

import com.pax.javacomponentsubcomponent.bindings.PeopleB;
import com.pax.javacomponentsubcomponent.modules.ModuleBike;
import com.pax.javacomponentsubcomponent.scope.BScope;

import dagger.Subcomponent;

@BScope
@Subcomponent(modules = ModuleBike.class)
public interface CSubcomponent {
    PeopleB peopleB();

    @Subcomponent.Builder
    interface Builder {
        CSubcomponent build();
    }

    CSubcomponent3.Factory getCSubcomponent3Factory();
}
