package com.pax.javacomponentdependency;

import com.pax.javacomponentdependency.scope.BScope;

import dagger.Component;

@BScope
@Component(dependencies = ComponentA.class)
public interface ComponentB {
    PeopleB peopleB();
}
