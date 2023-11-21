package com.itlucky.dynamicProxy.demo02;

public class Client {

    public static void main(String[] args) {

        //真实程序
        UserServiceImplTwo userServiceImpl = new UserServiceImplTwo();

        UserInvocationHandler handler = new UserInvocationHandler();
        // 设置要代理的对象
        handler.setTarget(userServiceImpl);
        // 动态生成代理类
        UserService proxyUser = (UserService)handler.getProxy();

        proxyUser.del();

    }
}
