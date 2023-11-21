package com.itlucky.staticProxy.demo01;

// 个人
public class Person {

    public static void main(String[] args) {
        // 客户租房子，直接找房东实现
        Host host = new Host();
        host.rent();

        // 通过代理来租房东的房子，但是中介一般会有一些附属操作
        // 如果代理仅仅是帮房东租房子，那么代理角色是没有意义的。
        Proxy proxy = new Proxy(host);
        proxy.seeHouse();
        // 不用找房东，直接找中介租房子即可。[但是要理解，真正要租掉房子的还是房东，只是中介代理做了这个事情]
        proxy.rent();
        proxy.signContract();
        proxy.getFee();

    }
}
