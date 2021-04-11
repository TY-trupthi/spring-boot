package com.tyss.employeeinfo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.employeeinfo.dao.EmployeeDao;
import com.tyss.employeeinfo.dto.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao dao;
	
	@Override
	public List<Employee> getAllEmployee() {
		return (List<Employee>) dao.findAll();
	}

	@Override
	public Optional<Employee> getEmployeeById(int id) {
		return dao.findById(id);
	}

	
	@Override
	public Employee addEmployee(Employee emp) {
		return dao.save(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		return dao.save(emp);
	}

	@Override
	public boolean deleteEmployeeById(Employee emp) {
	    dao.delete(emp);
		return true;
	}
    
	
	
}
