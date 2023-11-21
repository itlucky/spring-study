package com.itlucky.mapper;

import com.itlucky.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

// 一般写法：手动注入sqlSession实现
public class UserMapperImpl implements UserMapper{

    private SqlSessionTemplate sqlSession;

    /**
     * 设定sqlSession的值
     *
     * @param sqlSession 设定值
     */
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> queryUsers() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.queryUsers();
    }
}
