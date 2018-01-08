package com.canoo.annotations.interceptor;

import com.canoo.annotations.interceptor.annotations.TimeLog;

public class MyService implements MyServiceI {

    @TimeLog
    public void method1() {
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("HUHU");
    }

    public void method2() {
        System.out.println("TADA");
    }

    public void method3() {
        throw new RuntimeException("Not yet implemented");
    }

}
