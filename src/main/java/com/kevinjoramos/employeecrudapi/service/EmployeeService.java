package com.kevinjoramos.employeecrudapi.service;

import com.kevinjoramos.employeecrudapi.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
