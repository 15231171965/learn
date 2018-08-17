package com.yao.userAPI.service;

import com.yao.userAPI.entity.User;

import java.util.List;

public interface UserService {
    List<User> getListUser();

    User doLogin(String userName,String passWord);
}
