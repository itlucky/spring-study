package com.itlucky.dynamicProxy.demo02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 如下写法就是一个工具类一样的处理程序写法
//处理程序三步：
// 1.被代理接口
// 2.生成得到代理类
// 3.调用代理程序执行的一些方法
public class UserInvocationHandler implements InvocationHandler {

    // 被代理的接口
    private Object target;

    /**
     * 设定target的值
     *
     * @param target 设定值
     */
    public void setTarget(Object target) {
        this.target = target;
    }

    public Object getProxy(){

        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
        throws Throwable {

        log(method.getName());
        Object result = method.invoke(target, args);

        return result;
    }

    private void log(String msg){
        System.out.println("方法" +msg+ "开始执行了!");
    }
}
