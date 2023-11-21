package com.itlucky.mapper;

import com.itlucky.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;


public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{

    @Override
    public List<User> queryUsers(){

        List<User> users = getSqlSession().getMapper(UserMapper.class).queryUsers();

        if(null == users||users.isEmpty()){
            System.out.println("用户信息为空!!!！");
            return null;
        }

        return users;
    }

    // 添加一个用户
    @Override
    public int add(User user) {

        return getSqlSession().getMapper(UserMapper.class).add(user);
    }

    // 删除一个用户
    @Override
    public int delete(Integer id) {

        return getSqlSession().getMapper(UserMapper.class).delete(id);
    }
}
