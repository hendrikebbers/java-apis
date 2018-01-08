package com.canoo.annotations.interceptor;

import com.canoo.annotations.interceptor.proxy.ProxyFactory;

public class InterceptorApp {

    public static void main(String[] args) {

        final ProxyFactory proxyFactory = new ProxyFactory();

        MyServiceI service = proxyFactory.createProxy(MyServiceI.class, new MyService());
        service.method1();
        service.method2();
    }

}
