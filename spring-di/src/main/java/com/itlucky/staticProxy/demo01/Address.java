package com.itlucky.staticProxy.demo01;

public class Address {

    private String name;

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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Address [                name=");
        builder.append(name);
        builder.append(']');
        return builder.toString();
    }
}
