package com.employeemanagement.employee_management_springboot.service;

import java.util.List;

import com.employeemanagement.employee_management_springboot.entity.Employee;

public interface EmployeeService {

	/**
	 * 
	 * @return
	 */
	List<Employee> getAllEmployee();
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	Employee getEmployeeById(String id);
	
	/**
	 * 
	 * @param employee
	 * @return
	 */
	Employee saveEmployee(Employee employee);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	List<Employee> deleteEmployeeById(String id);
}
