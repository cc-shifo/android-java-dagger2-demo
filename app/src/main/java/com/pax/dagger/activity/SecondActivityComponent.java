package com.pax.dagger.activity;

import com.pax.dagger.ActivityScope;
import com.pax.dagger.fragment.FragmentModule;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {
        CarModule.class,
        FragmentModule.class
})
@ActivityScope
public interface SecondActivityComponent extends AndroidInjector<SecondActivity> {
    @Subcomponent.Factory
    public interface Factory extends AndroidInjector.Factory<SecondActivity> {
    }
}
