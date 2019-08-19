package com.pax.javacomponentparentissubcomponent;

import java.util.Locale;

public class goingOutApp {

    public static void main(String[] args) {
        CParentComponent cParentComponent = DaggerCParentComponent.builder().build();
        cParentComponent.peopleA().drive();

        CSubcomponent cSubcomponent = cParentComponent.getSubcomponentBuilder().build();
        CSubcomponent cSubcomponent1 = cParentComponent.getSubcomponentBuilder().build();
        CSubcomponent cSubcomponent2 = cParentComponent.getSubcomponentBuilder().build();
        cSubcomponent.peopleB().drive();
        cSubcomponent.getCSubcomponent2Factory()
                .createCSubcomponent2().peopleC().drive();

        System.out.println();
        System.out.println(String.format(Locale.US, "cSubcomponent=%s", cSubcomponent));
        System.out.println();
        System.out.println(String.format(Locale.US, "cSubcomponent1=%s", cSubcomponent1));
        System.out.println();
        System.out.println(String.format(Locale.US, "cSubcomponent2=%s", cSubcomponent2));
    }
}