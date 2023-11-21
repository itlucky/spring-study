package com.itlucky.obersver.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;


/**
 * ApplicationContext容器事件监听
 */
public class ApplicatonContextListener implements ApplicationListener<ContextRefreshedEvent> {
    /**
     * Handle an application event.
     * @param event the event to respond to
     */
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("event: " +event.toString());
        System.out.println("事件对象：" + event.getClass().getName());
        System.out.println("ContextRefreshedEvent事件,容器内对象发生变更，所有的bean都初始化完成并被成功装载");
    }
}
