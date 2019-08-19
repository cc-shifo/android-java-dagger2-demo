package com.pax.javacomponentparentissubcomponent;


import com.pax.javacomponentparentissubcomponent.bindings.PeopleB;
import com.pax.javacomponentparentissubcomponent.modules.ModuleBike;
import com.pax.javacomponentparentissubcomponent.scope.BScope;

import dagger.Subcomponent;

@BScope
@Subcomponent(modules = ModuleBike.class)
public interface CSubcomponent {
    PeopleB peopleB();

    @Subcomponent.Builder
    interface Builder {
        CSubcomponent build();
    }

    CSubcomponent2.Factory getCSubcomponent2Factory();
}
