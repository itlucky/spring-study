package com.itlucky.dynamicProxy.demo01;

public class Client {

    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //代理角色
        MyProxyInvocationHandler handler = new MyProxyInvocationHandler();
        // 通过处理程序这一角色来处理我们要调用的接口对象
        handler.setRent(host);

        Rent proxyRent = (Rent)handler.getProxy(); // 这里proxyRent就是动态生成的。

        proxyRent.rent();

    }
}
