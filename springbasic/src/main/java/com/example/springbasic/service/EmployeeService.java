package com.example.springbasic.service;

import java.util.List;

import com.example.springbasic.entity.Employee;

public interface EmployeeService {
	
	public boolean saveEmployee(Employee e);
	public List<Employee> getEmployees();
	public boolean deleteEmployee(int id);
	public Employee getEmployeeById(int id);
	

}
