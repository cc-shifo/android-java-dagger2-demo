package com.pax.bindingmap;

import com.pax.bindingmap.mapkey.ClassKey;
import com.pax.bindingmap.mapkey.EnumKey;
import com.pax.bindingmap.mapkey.MyCompositeKey;
import com.pax.bindingmap.mapkey.TestEnum;
import com.pax.bindingmap.objects.ElectricHeater;
import com.pax.bindingmap.objects.Heater;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
public class CoffeeModule {
    /**
     * ElectricHeater has no @Inject constructor. Its instance can be only obtained through new a
     * instance or with @Provides-annotated method
     */
    @Provides
    @Singleton
    public Heater provideHeater() {
        return new ElectricHeater(0);
    }

    @Provides
    public ElectricHeater provideElectricHeater() {
        return new ElectricHeater(-1);
    }

    @Provides
    @SetQualifier("s1")
    @IntoMap
    @StringKey(value = "1")
    public Heater provideH1() {
        return new ElectricHeater(1);
    }

    @Provides
    @SetQualifier("s1")
    @IntoMap
    @StringKey(value = "2")
    public Heater provideH2() {
        return new ElectricHeater(2);
    }

//    @Provides
//    @IntoMap
//    @CompositeKeyMap(name = "c1", intValue = 0xc1)
//    public String provideCompositeMapValue1() {
//        return "CompositeMapKey1";
//    }
//
//    @Provides
//    @IntoMap
//    @CompositeKeyMap(name = "c2", intValue = 0xc2)
//    public String provideCompositeMapValue2() {
//        return "CompositeMapKey2";
//    }

    @Provides
    @SetQualifier("s2")
    public Map<String, Heater> provideMap() {
        Map<String, Heater> map = new HashMap<String, Heater>();
        map.put("10", new ElectricHeater(10));
        map.put("11", new ElectricHeater(11));
        map.put("12", new ElectricHeater(12));
        return map;
    }

    @Provides
    @IntoMap
    @EnumKey(TestEnum.ABCD)
    public String provideEnumKeyMapValue1() {
        return "EnumKeyMap value: " + TestEnum.ABCD.toString();
    }

    @Provides
    @IntoMap
    @EnumKey(TestEnum.MNOP)
    public String provideEnumKeyMapValue2() {
        return "EnumKeyMap value: " + TestEnum.MNOP.toString();
    }

    @Provides
    @IntoMap
    @ClassKey(BigDecimal.class)
    public String provideClassKeyMapValue1() {
        return "ClassKeyMap value: Value1";
    }

    @Provides
    @IntoMap
    @MyCompositeKey(name = "abc", implementingClass = BigDecimal.class, thresholds = {1, 5, 10})
    public static String provideMyCompositeKeyValue1() {
        return "foo";
    }
}
