package com.yao.userAPI.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yao.userAPI.dao.UserDao;
import com.yao.userAPI.entity.User;
import com.yao.userAPI.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    //注入Service依赖
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getListUser() {
        return userDao.getListUser();
    }

    @Override
    public User doLogin(String userName, String passWord) {
        User user = userDao.doLogin(userName, passWord);
        return user;
    }
}
