package com.tyss.employeeinfo.service;

import java.util.List;
import java.util.Optional;

import com.tyss.employeeinfo.dto.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployee();
	
	public Optional<Employee> getEmployeeById(int id);
	
	public boolean deleteEmployeeById(Employee emp);
	
	public Employee addEmployee(Employee emp);
	
	public Employee updateEmployee(Employee emp);
	
}
