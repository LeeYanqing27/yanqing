package com.aop.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeLog implements MethodBeforeAdvice {


    @Override
    public void before(Method method, Object[] orgs, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"执行了"+method.getName());
    }
}
