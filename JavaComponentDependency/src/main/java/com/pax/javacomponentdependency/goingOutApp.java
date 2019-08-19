package com.pax.javacomponentdependency;

public class goingOutApp {
    public static void main(String[] args) {
        /**
         * 从上面 DaggerComponentA 的代码可以看出使用了 @AScope
         * 作用域后，provideCarProvider由CarModule_ProvideCarFactory.create()变为了DoubleCheck.provider
         * (CarModule_ProvideCarFactory.create())。而 DoubleCheck 包装的意义在于持有了 Car
         * 的实例，而且只会生成一次实例，也就是说：没有用@AScope作用域之前，DaggerAComponent每次注入依赖
         * 都会新建一个 Car 实例，而用@AScope作用之后，每次注入依赖都只会返回第一次生成的实例。
         * DaggerComponentA 持有 provideCarProvider 引用，provideCarProvider 又持有 instance（即 Car
         * 实例）的引用，所以生成 Car对象实例的生命周期就和 ComponentA一致了，作用域就生效了。
         *
         * Scope 作用域的本质：Component 间接持有依赖实例的引用，把实例的作用域与 Component 绑定，它们
         * 不是同年同月同日生，但是同年同月死。
         *
         * 注：因为 ComponentB 和 ComponentA 是依赖关系，如果其中一个声明了作用域的话，另外一个
         * 也必须声明，而且它们的 Scope 不能相同，ComponentA 的生命周期 >= ComponentB 的。ComponentB
         * 的 Scope 不能是 @Singleton，因为 Dagger 2 中 @Singleton 的 Component 不能依赖其他的 Component。
         *
         * 编译时生成的代码中 DaggerComponentB 的 Provider<Car>实现中会用到ComponentA.getCar()来提供 car 实例，如果
         * ComponentA 没有向外提供car实例的接口(getCar())的话，DaggerComponentB 就会注入失败。
         * */
        ComponentA componentA = DaggerComponentA.builder().build();
        ComponentB componentB = DaggerComponentB.builder().componentA(componentA).build();
        componentA.peopleA().gotoWork();
        componentB.peopleB().gotoWork();
    }
}
