package com.canoo.annotations.interceptor;

import com.canoo.annotations.interceptor.annotations.TimeLog;

/**
 * Created by hendrikebbers on 12.12.17.
 */
public interface MyServiceI {

    @TimeLog
    public void method1();

    @TimeLog
    public void method2();

    public void method3();
}
