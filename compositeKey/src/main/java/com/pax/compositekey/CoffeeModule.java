package com.pax.compositekey;

import java.math.BigDecimal;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;

@Module
public class CoffeeModule {
    @Provides
    @IntoMap
    @MyQualifier("A")
    @MyCompositeKey(name = "abcA1", implementingClass = BigDecimal.class, thresholds = {1, 5, 10})
    public String provideMyCompositeKeyValueA1() {
        return "fooA1";
    }

    @Provides
    @IntoMap
    @MyQualifier("A")
    @MyCompositeKey(name = "abcA2", implementingClass = BigDecimal.class, thresholds = {1, 5, 10})
    public String provideMyCompositeKeyValueA2() {
        return "fooA2";
    }

    @Provides
    @IntoMap
    @MyQualifier("B")
    @MyCompositeKey(name = "abcB1", implementingClass = BigDecimal.class, thresholds = {1, 5, 10})
    public String provideMyCompositeKeyValueB1() {
        return "fooB1";
    }
}
