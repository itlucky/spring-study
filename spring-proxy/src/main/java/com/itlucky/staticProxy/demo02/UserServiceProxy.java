package com.itlucky.staticProxy.demo02;

public class UserServiceProxy implements UserDao{

    // 这里可以用是用有参构造将真实对象注入，也可以使用set()方法注入。spring推荐使用set方法。
    private UserService userService;

    /**
     * 设定userService的值
     *
     * @param userService 设定值
     */
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void del() {
        log("del");
        userService.del();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }

    // 在每个业务方法真正执行之前打印一行日志输出
    private void log(String msg){
        System.out.println("开始执行" +msg+ "方法!");
    }

}
