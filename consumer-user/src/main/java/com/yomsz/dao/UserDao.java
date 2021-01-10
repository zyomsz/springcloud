package com.yomsz.dao;

import com.yomsz.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    public User getUser(Integer id) {
        User user = new User();
        user.setId(id);
        user.setUserName("张三");
        return user;
    }
}