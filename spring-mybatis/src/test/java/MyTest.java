import com.itlucky.mapper.UserMapper;
import com.itlucky.mapper.UserMapperImpl2;
import com.itlucky.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class MyTest {

    /**
     * mybatis没有整合spring
     * @throws IOException
     */
    @Test
    public void test()
        throws IOException {

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sessionFactory.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.queryUsers();

        for (User user : userList) {
            System.out.println(user);
        }
    }


    @Test
    public void test2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");

//        UserMapperImpl mapper = context.getBean("userMapper", UserMapperImpl.class);
        UserMapperImpl2 mapper = context.getBean("userMapper2", UserMapperImpl2.class);

        mapper.queryUsers();
    }

}
