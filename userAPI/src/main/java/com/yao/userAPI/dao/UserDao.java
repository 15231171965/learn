package com.yao.userAPI.dao;

import com.yao.userAPI.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    List<User> getListUser();

    User doLogin(@Param("userName") String userName, @Param("passWord") String passWord);
}
