import com.itlucky.dao.UserDaoMysqlImpl;
import com.itlucky.service.UserServiceImpl;


public class MyTest {
    public static void main(String[] args) {
        // 用户实际调用的是业务层，dao层不需要他们接触
        UserServiceImpl userService = new UserServiceImpl();

        userService.setUserDao(new UserDaoMysqlImpl());

        userService.getUser();

    }
}
