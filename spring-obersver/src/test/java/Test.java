import com.itlucky.obersver.event.MessageEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    /**
     * 此时会打印如下信息：ContextRefreshedEvent事件,容器内对象发生变更
     *
     * 应用场景：程序启动，初始化过程中，需要确保所有对象全部初始化完成，
     * 此时在从容器中获取指定对象做相关初始化操作。例如：将省、市、区信息初始化到缓存中。
     */
//    public static void main(String[] args) {
//
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//    }

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        context.publishEvent(new MessageEvent("hefei","19966669998","你好"));
        context.publishEvent(new MessageEvent("hefei","17777777777","good"));
        context.publishEvent(new MessageEvent("hefei","16666666666","新年快乐"));
        context.publishEvent(new MessageEvent("hefei","18888888888","端午安康"));
    }
}
