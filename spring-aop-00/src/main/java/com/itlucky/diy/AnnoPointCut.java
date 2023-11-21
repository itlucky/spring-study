package com.itlucky.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

// 注解方式实现AOP


@Aspect // 标注这个类是一个切面
public class AnnoPointCut {

    // 切入点
    @Before("execution(* com.itlucky.service.impl.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("==========方法执行前=========");
    }

    @After("execution(* com.itlucky.service.impl.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("==========方法执行后=========");
    }

    // 在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点
    @Around("execution(* com.itlucky.service.impl.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint pjd)
        throws Throwable {
        System.out.println("环绕前");

        //        Signature signature = pjd.getSignature();// 获得签名信息

        //执行方法
        Object obj = pjd.proceed();
        System.out.println("环绕后");

    }

}
