package com.kevinjoramos.employeecrudapi.dao;

import com.kevinjoramos.employeecrudapi.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
