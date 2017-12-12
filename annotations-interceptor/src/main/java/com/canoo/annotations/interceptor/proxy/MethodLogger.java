package com.canoo.annotations.interceptor.proxy;

import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MethodLogger {

    private final static Logger LOG = Logger.getLogger(MethodLogger.class.getName());

    public <T> T logMethodTime(final String methodName, final Level logLevel, final Supplier<T> methodCall) {
        final long startTime = System.nanoTime();
        try {
            return methodCall.get();
        } finally {
            final long runtime = System.nanoTime() - startTime;
            LOG.log(logLevel, "Calling method " + methodName + " took " + runtime + " ns");
        }
    }

    public <T> T logMethodThread(final String methodName, final Level logLevel, final Supplier<T> methodCall) {
        LOG.log(logLevel, "Calling method " + methodName + " on thread " + Thread.currentThread().getName());
        return methodCall.get();
    }

    public <T, E extends Throwable> T logMethodException(final String methodName, final Level logLevel, final Class<E> exceptionBaseType, final Supplier<T> methodCall) {
        try {
            return methodCall.get();
        } catch (Exception e){
            if(exceptionBaseType.isAssignableFrom(e.getClass())) {
                LOG.log(logLevel, "Method " + methodName + " throws RuntimeException! Message: " + e.getLocalizedMessage());
            }
            throw e;
        }
    }
}
