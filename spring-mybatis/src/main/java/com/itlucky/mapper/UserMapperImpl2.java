package com.itlucky.mapper;

import com.itlucky.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

// 这里继承了SqlSessionDaoSupport，就不需要手动注入sqlSession了，
// 其实查看源码可以知道是SqlSessionDaoSupport这里面做了注入sqlSession的操作，UserMapperImpl里面手动注入是一回事
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper{

    @Override
    public List<User> queryUsers() {
        return getSqlSession().getMapper(UserMapper.class).queryUsers();
    }
}
