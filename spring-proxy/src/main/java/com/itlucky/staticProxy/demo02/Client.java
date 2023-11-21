package com.itlucky.staticProxy.demo02;

public class Client {

    public static void main(String[] args) {

        UserService userService = new UserService();
        userService.add();

        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);
        proxy.del();

    }
}
