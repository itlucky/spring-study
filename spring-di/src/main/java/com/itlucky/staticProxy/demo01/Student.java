package com.itlucky.staticProxy.demo01;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


/**
 *  通过注入方式实现各种类型的属性赋值
 */
public class Student {

    private String name;

    private Address address;

    private String[] books;

    private List<String> hobbys;

    private Map<String,String> cards;

    private Set<String> games;

    private String house;

    private Properties info;

    public Student() {
    }

    public Student(String name){
        this.name = name;
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
     * 取得address的值
     *
     * @return address 的值
     */
    public Address getAddress() {
        return address;
    }

    /**
     * 设定address的值
     *
     * @param address 设定值
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * 取得books的值
     *
     * @return books 的值
     */
    public String[] getBooks() {
        return books;
    }

    /**
     * 设定books的值
     *
     * @param books 设定值
     */
    public void setBooks(String[] books) {
        this.books = books;
    }

    /**
     * 取得hobbys的值
     *
     * @return hobbys 的值
     */
    public List<String> getHobbys() {
        return hobbys;
    }

    /**
     * 设定hobbys的值
     *
     * @param hobbys 设定值
     */
    public void setHobbys(List<String> hobbys) {
        this.hobbys = hobbys;
    }

    /**
     * 取得cards的值
     *
     * @return cards 的值
     */
    public Map<String, String> getCards() {
        return cards;
    }

    /**
     * 设定cards的值
     *
     * @param cards 设定值
     */
    public void setCards(Map<String, String> cards) {
        this.cards = cards;
    }

    /**
     * 取得games的值
     *
     * @return games 的值
     */
    public Set<String> getGames() {
        return games;
    }

    /**
     * 设定games的值
     *
     * @param games 设定值
     */
    public void setGames(Set<String> games) {
        this.games = games;
    }

    /**
     * 取得house的值
     *
     * @return house 的值
     */
    public String getHouse() {
        return house;
    }

    /**
     * 设定house的值
     *
     * @param house 设定值
     */
    public void setHouse(String house) {
        this.house = house;
    }

    /**
     * 取得info的值
     *
     * @return info 的值
     */
    public Properties getInfo() {
        return info;
    }

    /**
     * 设定info的值
     *
     * @param info 设定值
     */
    public void setInfo(Properties info) {
        this.info = info;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Student [                name=");
        builder.append(name);
        builder.append(",                 address=");
        builder.append(address);
        builder.append(",                 books=");
        builder.append(Arrays.toString(books));
        builder.append(",                 hobbys=");
        builder.append(hobbys);
        builder.append(",                 cards=");
        builder.append(cards);
        builder.append(",                 games=");
        builder.append(games);
        builder.append(",                 house=");
        builder.append(house);
        builder.append(",                 info=");
        builder.append(info);
        builder.append(']');
        return builder.toString();
    }
}
