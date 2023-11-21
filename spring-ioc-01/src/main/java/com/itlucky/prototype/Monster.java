package com.itlucky.prototype;

public class Monster {

    private Integer id = 11;

    private String name = "孙悟空";

    private String kill = "金箍棒";

    public Monster(){
        System.out.println("齐天大圣初始化成功~");
    }

    public Monster(Integer id, String name, String kill) {
        this.id = id;
        this.name = name;
        this.kill = kill;
    }

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
     * 取得kill的值
     *
     * @return kill 的值
     */
    public String getKill() {
        return kill;
    }

    /**
     * 设定kill的值
     *
     * @param kill 设定值
     */
    public void setKill(String kill) {
        this.kill = kill;
    }

    @Override public String toString() {
        final StringBuffer sb = new StringBuffer("Monster{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", kill='").append(kill).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
