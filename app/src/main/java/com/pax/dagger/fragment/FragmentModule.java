package com.pax.dagger.fragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = FragmentSubcomponent.class)
public abstract class FragmentModule {
    @Binds
    @IntoMap
    @ClassKey(BlankFragment.class)
    abstract AndroidInjector.Factory<?>
    bindBlankFragmentInjectorFactory(FragmentSubcomponent.Factory factory);
}
