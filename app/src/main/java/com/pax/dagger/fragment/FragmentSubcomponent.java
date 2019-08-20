package com.pax.dagger.fragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent
public interface FragmentSubcomponent extends AndroidInjector<BlankFragment> {
    @Subcomponent.Factory
    public interface Factory extends AndroidInjector.Factory<BlankFragment> {
    }
}
