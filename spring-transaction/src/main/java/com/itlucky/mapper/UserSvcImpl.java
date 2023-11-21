package com.itlucky.mapper;

import com.itlucky.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("userSvcImpl")
public class UserSvcImpl implements UserSvc{

    @Autowired
    private UserMapper userMapper;

    /**
     * 设定userMapper的值
     *
     * @param userMapper 设定值
     */
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void operateUser() {

        User user = new User(1007, "事物", "00", "18", "China");

        int add = userMapper.add(user);

        int del = userMapper.delete(1008);

        if(add!=1 || del!=1){
            System.out.println("用户信息操作失败！！！");
            throw new RuntimeException("用户信息操作失败！！！");
        }

        userMapper.queryUsers().forEach(System.out::println);
    }
}
