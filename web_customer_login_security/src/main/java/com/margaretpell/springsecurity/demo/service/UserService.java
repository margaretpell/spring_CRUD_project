package com.margaretpell.springsecurity.demo.service;

import com.margaretpell.springsecurity.demo.entity.User;
import com.margaretpell.springsecurity.demo.user.CrmUser;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByUserName(String userName);

    void save(CrmUser crmUser);
}
