package com.itlucky.service;

import com.itlucky.dao.UserDao;
import com.itlucky.dao.UserDaoImpl;


public class UserServiceImpl implements UserService{

//    private UserDao userDao = new UserDaoImpl();

    private UserDao userDao;

    /**
     * 设定userDao的值
     *
     * @param userDao 设定值
     */
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
