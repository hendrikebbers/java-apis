package com.canoo.annotations.interceptor;

import com.canoo.annotations.interceptor.proxy.ProxyFactory;

public class InterceptorApp {

    public static void main(String[] args) {

        final ProxyFactory proxyFactory = new ProxyFactory();

        CharSequence charSequence = proxyFactory.createProxy(CharSequence.class, "Hallo");
        charSequence.toString();
    }

}
