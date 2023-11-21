package com.itlucky.dynamicProxy.demo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


// 利用这个类，自动生成代理类【这是一个处理程序，为真是角色生成代理类】
public class MyProxyInvocationHandler implements InvocationHandler {

    // 被代理的接口
    private Rent rent;

    /**
     * 设定rent的值
     *
     * @param rent 设定值
     */
    public void setRent(Rent rent) {
        this.rent = rent;
    }

    // 官方生成代理类的示例
//    Foo f = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(),
//        new Class<?>[] { Foo.class },
//        handler);
//    newProxyInstance(ClassLoader loader, --类加载器
//                     Class<?>[] interfaces, --被代理类的接口
//                     InvocationHandler h --InvocationHandler对象)
    // 生成得到代理类
    public Object getProxy(){
//        创建代理类
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    // 处理代理实例，执行真正要执行的动作以及附属操作。并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
        throws Throwable {

        seeHouse();
        // 动态代理的本质，就是利用反射机制实现
        Object result = method.invoke(rent,args);

        signHT();

        return result;
    }

    private void seeHouse(){
        System.out.println("中介带看房子！");
    }

    private void signHT(){
        System.out.println("中介签租房合同！");
    }
}
