package com.itlucky.dynamicProxy.demo02;

public class UserServiceImplTwo implements UserService{
    @Override
    public void add() {
        System.out.println("service2增加了一个用户");
    }

    @Override
    public void del() {
        System.out.println("service2删除了一个用户");
    }

    @Override
    public void update() {
        System.out.println("service2修改了一个用户");
    }

    @Override
    public void query() {
        System.out.println("service2查询了一个用户");
    }
}
