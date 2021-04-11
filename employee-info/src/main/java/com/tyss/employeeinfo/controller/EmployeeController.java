package com.tyss.employeeinfo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.employeeinfo.dto.Employee;
import com.tyss.employeeinfo.dto.ResponseBean;
import com.tyss.employeeinfo.service.EmployeeService;

@RestController
@RequestMapping("/ap/v1")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/users")
	public ResponseBean getAllEmployee(){
		List<Employee> list= service.getAllEmployee();
	    return new ResponseBean(list,"Employees List",false);
	}
	
	@GetMapping("/user")
	public ResponseBean getEmployeeById(int id){
		Optional<Employee> employee= service.getEmployeeById(id);
		return new ResponseBean(employee, "Employee details", false);
	}
	
	@PostMapping("/user/add")
	public ResponseBean addEmployee(Employee emp) {
	  Employee employee= service.addEmployee(emp);
		return new ResponseBean(employee, "Added successfully", false);
	}
	
	@PutMapping("/user/update")
	public ResponseBean updateEmployee(Employee emp) {
		Employee employee= service.updateEmployee(emp);
		return new ResponseBean(employee, "updated successfully", false);
	}
	
	@DeleteMapping("/user/delete")
	public ResponseBean deleteEmployeeById(Employee emp) {
		boolean flag = service.deleteEmployeeById(emp);
		return new ResponseBean(flag, "Deleted successfully", false);
	}
	
	
}
    
	
	


