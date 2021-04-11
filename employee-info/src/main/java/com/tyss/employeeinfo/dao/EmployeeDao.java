package com.tyss.employeeinfo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tyss.employeeinfo.dto.Employee;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer>{

}
