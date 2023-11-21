package com.itlucky.obersver.event;

import org.springframework.context.ApplicationEvent;


/**
 * 自定义事件{发短信}
 */
public class MessageEvent extends ApplicationEvent {

    private String phone;

    private String message;

    /**
     * 创建事件
     */
    public MessageEvent(Object source) {
        super(source);
    }

    /**
     * 创建事件
     */
    public MessageEvent(Object source,String phone,String message){
        super(source);
        this.phone=phone;
        this.message=message;
}

    /**
     * 取得phone的值
     *
     * @return phone 的值
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设定phone的值
     *
     * @param phone 设定值
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 取得message的值
     *
     * @return message 的值
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设定message的值
     *
     * @param message 设定值
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
