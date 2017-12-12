package com.canoo.annotations.interceptor.proxy;

import com.canoo.util.ReflectionHelper;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    private final MethodLogger logger = new MethodLogger();

    public <T, U extends T> T createProxy(final Class<T> interfaceType, final U bean) {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return ReflectionHelper.invokePrivileged(method, bean, args);
            }
        };
        return (T) Proxy.newProxyInstance(interfaceType.getClassLoader(), new Class[]{interfaceType}, handler);
    }
}
