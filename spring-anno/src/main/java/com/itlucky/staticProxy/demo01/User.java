package com.itlucky.staticProxy.demo01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//该注解表名这个bean被spring管理了。也就是放在IOC容器中
@Component //等价于 <bean id="user" class="com.itlucky.pojo.User"/>
public class User {

    @Value("张三") //等价于 <property name="name" value="张三"/>
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
        builder.append("User [                name=");
        builder.append(name);
        builder.append(']');
        return builder.toString();
    }
}
