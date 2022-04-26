package com.employeemanagement.employee_management_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeemanagement.employee_management_springboot.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
