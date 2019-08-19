package com.pax.javacomponentsubcomponent;


import com.pax.javacomponentsubcomponent.bindings.PeopleA;
import com.pax.javacomponentsubcomponent.modules.ModuleCar;
import com.pax.javacomponentsubcomponent.scope.AScope;

import dagger.Component;

@AScope
@Component(modules = ModuleCar.class)
public interface CParentComponent {
    PeopleA peopleA();

    CSubcomponent.Builder getSubcomponentBuilder();
    CSubcomponent2.Factory getCSubcomponent2Factory();
}
