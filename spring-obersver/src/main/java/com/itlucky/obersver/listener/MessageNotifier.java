package com.itlucky.obersver.listener;

import com.itlucky.obersver.event.MessageEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;


/**
 * 事件监听器
 */
@Component
public class MessageNotifier implements ApplicationListener<MessageEvent> {
    /**
     * Handle an application event.
     * @param event the event to respond to
     */
    @Override
    @Async
    public void onApplicationEvent(MessageEvent event) {
        System.out.println("=====事件监听开始====");
        // 真正实现业务的地方
        try{

            System.out.println("给手机号："+event.getPhone() + "发送短信，内容是：" + event.getMessage());
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("=====事件监听结束====");
    }
}
