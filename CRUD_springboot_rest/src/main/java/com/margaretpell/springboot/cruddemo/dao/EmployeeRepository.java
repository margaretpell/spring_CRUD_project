package com.margaretpell.springboot.cruddemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.margaretpell.springboot.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// that's it ... no need to write any code LOL!

}











