package com.kevinjoramos.employeecrudapi.dao;

import com.kevinjoramos.employeecrudapi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {}
