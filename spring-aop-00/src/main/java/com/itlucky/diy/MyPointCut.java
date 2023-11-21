package com.itlucky.diy;

// 自定义方式实现AOP
public class MyPointCut {

    public void begin(){
        System.out.println("============方法执行前=============");
    }

    public void endd(){
        System.out.println("============方法执行后=============");
    }
}
