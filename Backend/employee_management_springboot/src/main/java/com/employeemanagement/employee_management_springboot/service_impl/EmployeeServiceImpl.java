package com.employeemanagement.employee_management_springboot.service_impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagement.employee_management_springboot.entity.Employee;
import com.employeemanagement.employee_management_springboot.repository.EmployeeRepository;
import com.employeemanagement.employee_management_springboot.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(String id) {
		return employeeRepository.getById(Integer.parseInt(id));
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> deleteEmployeeById(String id) {
		employeeRepository.delete(getEmployeeById(id));
		return getAllEmployee();
	}

}
