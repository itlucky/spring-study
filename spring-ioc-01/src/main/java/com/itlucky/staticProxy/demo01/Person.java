package com.itlucky.staticProxy.demo01;

public class Person {

    private String name;

    private String code;

    private String addr;

    /**
     *
     */
    //    public Person() {
//        System.out.println("Person初始化。。。");
//    }
//    public Person(String name){
//        this.name = name;
//    }

    /**
     * 取得name的值
     *
     * @return name 的值
     */
    public String getName() {
        return name;
    }

    /**
     * 设定name的值
     *
     * @param name 设定值
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 取得code的值
     *
     * @return code 的值
     */
    public String getCode() {
        return code;
    }

    /**
     * 设定code的值
     *
     * @param code 设定值
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 取得addr的值
     *
     * @return addr 的值
     */
    public String getAddr() {
        return addr;
    }

    /**
     * 设定addr的值
     *
     * @param addr 设定值
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Person [                name=");
        builder.append(name);
        builder.append(",                 code=");
        builder.append(code);
        builder.append(",                 addr=");
        builder.append(addr);
        builder.append(']');
        return builder.toString();
    }
}
