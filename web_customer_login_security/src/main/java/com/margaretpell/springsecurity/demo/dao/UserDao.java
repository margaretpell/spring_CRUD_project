package com.margaretpell.springsecurity.demo.dao;

import com.margaretpell.springsecurity.demo.entity.User;

public interface UserDao {

    User findByUserName(String userName);
    
    void save(User user);
    
}
