package com.canoo.annotations.interceptor.proxy;

import com.canoo.annotations.interceptor.annotations.TimeLog;
import com.canoo.util.ReflectionHelper;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Optional;
import java.util.logging.Level;

public class ProxyFactory {

    private final MethodLogger logger = new MethodLogger();

    public <T, U extends T> T createProxy(final Class<T> interfaceType, final U bean) {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                Optional.ofNullable(method.getAnnotation(TimeLog.class)).ifPresent(a -> {
                    logger.logMethodTime(method.getName(), Level.INFO, () -> {
                        try {
                            return method.invoke(bean, args);
                        } catch (Exception e) {
                           throw new RuntimeException("ARGH!", e);
                        }

                    });
                });

                return ReflectionHelper.invokePrivileged(method, bean, args);
            }
        };
        return (T) Proxy.newProxyInstance(interfaceType.getClassLoader(), new Class[]{interfaceType}, handler);
    }
}
