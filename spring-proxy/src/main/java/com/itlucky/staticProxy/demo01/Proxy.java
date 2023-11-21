package com.itlucky.staticProxy.demo01;


// 这里中介要有出租房子的作用，所以也实现了出租房子的接口。说明了代理角色要干真实角色要做的事情
public class Proxy implements Rent{
    // 实际开发中多用组合少用继承
    private Host host;

    public Proxy(){

    }

    public Proxy(Host host){
        this.host = host;
    }

    // 这里是真实角色要干的事情，交由代理来实现.其实还是调用房东角色的出租房子方法。
    @Override
    public void rent() {
        host.rent();
    }

    // 以下动作是代理角色附属操作
    // 看房子
    public void seeHouse(){
        System.out.println("中介带看房子");
    }

    // 签合同
    public void signContract(){
        System.out.println("签订房租租赁合同");
    }

    //收中介费
    public void getFee(){
        System.out.println("收取中介费");
    }

}
