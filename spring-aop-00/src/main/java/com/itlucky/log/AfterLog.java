package com.itlucky.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

// 后置增强
public class AfterLog implements AfterReturningAdvice {

    public void afterReturning(Object returnValue, Method method, Object[] objects, Object target)
        throws Throwable {

        System.out.println("执行了方法："+method.getName()+",返回结果为："+returnValue);


    }
}
