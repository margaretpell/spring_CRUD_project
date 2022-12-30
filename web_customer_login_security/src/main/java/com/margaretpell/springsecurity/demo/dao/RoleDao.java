package com.margaretpell.springsecurity.demo.dao;

import com.margaretpell.springsecurity.demo.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
