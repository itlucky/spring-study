package com.itlucky.staticProxy.demo01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

public class Person {

    @Nullable
    private String name;

    @Autowired
    @Qualifier(value = "cat1")
    private Cat cat;

    @Autowired
    private Dog dog;

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
     * 取得cat的值
     *
     * @return cat 的值
     */
    public Cat getCat() {
        return cat;
    }

    /**
     * 设定cat的值
     *
     * @param cat 设定值
     */
    public void setCat(Cat cat) {
        this.cat = cat;
    }

    /**
     * 取得dog的值
     *
     * @return dog 的值
     */
    public Dog getDog() {
        return dog;
    }

    /**
     * 设定dog的值
     *
     * @param dog 设定值
     */
    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Person [                name=");
        builder.append(name);
        builder.append(",                 cat=");
        builder.append(cat);
        builder.append(",                 dog=");
        builder.append(dog);
        builder.append(']');
        return builder.toString();
    }
}
