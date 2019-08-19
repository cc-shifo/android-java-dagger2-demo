package com.pax.javacomponentparentissubcomponent;


import com.pax.javacomponentparentissubcomponent.bindings.PeopleA;
import com.pax.javacomponentparentissubcomponent.modules.ModuleCar;
import com.pax.javacomponentparentissubcomponent.scope.AScope;

import dagger.Component;

@AScope
@Component(modules = ModuleCar.class)
public interface CParentComponent {
    PeopleA peopleA();

    CSubcomponent.Builder getSubcomponentBuilder();
}
