package com.itlucky.pojo;

public class User {

    private Integer id;

    private String name;

    private String sex;

    private String age;

    private String address;

    /**
     * 取得id的值
     *
     * @return id 的值
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设定id的值
     *
     * @param id 设定值
     */
    public void setId(Integer id) {
        this.id = id;
    }

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
     * 取得sex的值
     *
     * @return sex 的值
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设定sex的值
     *
     * @param sex 设定值
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 取得age的值
     *
     * @return age 的值
     */
    public String getAge() {
        return age;
    }

    /**
     * 设定age的值
     *
     * @param age 设定值
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * 取得address的值
     *
     * @return address 的值
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设定address的值
     *
     * @param address 设定值
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("User [                id=");
        builder.append(id);
        builder.append(",                 name=");
        builder.append(name);
        builder.append(",                 sex=");
        builder.append(sex);
        builder.append(",                 age=");
        builder.append(age);
        builder.append(",                 address=");
        builder.append(address);
        builder.append(']');
        return builder.toString();
    }
}
