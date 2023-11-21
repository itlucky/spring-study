import com.itlucky.mapper.UserMapper;
import com.itlucky.mapper.UserSvcImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {

    @Test
    public void test() {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);

        userMapper.queryUsers().forEach(System.out::println);

    }


    @Test
    public void test2(){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserSvcImpl userSvc = context.getBean("userSvc", UserSvcImpl.class);
        userSvc.operateUser();

    }

}
