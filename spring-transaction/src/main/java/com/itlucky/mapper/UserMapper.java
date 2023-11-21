package com.itlucky.mapper;

import com.itlucky.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserMapper {

    List<User> queryUsers();

    int add(@Param("user") User user);

    int delete(@Param("id") Integer id);
}
