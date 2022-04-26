package com.employeemanagement.employee_management_springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagement.employee_management_springboot.entity.Employee;
import com.employeemanagement.employee_management_springboot.service.EmployeeService;

@RestController
@CrossOrigin("http://localhost:4200/")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployee();
	}
	
	@GetMapping("/employees/{id}")
	public Employee getEmployeesById(@PathVariable String id){
		return employeeService.getEmployeeById(id);
	}
	
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee){
		return employeeService.saveEmployee(employee);
	}
	
	@DeleteMapping("/employees/{id}")
	public List<Employee> deleteEmployeesById(@PathVariable String id){
		return employeeService.deleteEmployeeById(id);
	}
	
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable String id,@RequestBody Employee newemployee ) {
		Employee employeeById = employeeService.getEmployeeById(id);
		employeeById.setName(newemployee.getName());
		employeeById.setEmail(newemployee.getEmail());
		return employeeService.saveEmployee(employeeById);
	}
	
}
