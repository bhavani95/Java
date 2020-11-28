package com.example.springbasic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbasic.entity.Employee;
import com.example.springbasic.service.EmployeeService;

@RestController
public class EmployeeController {
	
	
@Value("${ap.env}")
private String environment;

	
	
	@Autowired 
	private EmployeeService emp;
	
	@PostMapping("/saveEmployee")
	public boolean saveEmployee(@RequestBody Employee e) {
		
		
		
		System.out.println(".................."+environment);
		
		return emp.saveEmployee(e);
		
	}
	
	@GetMapping("/getEmployees")
	public List<Employee> getEmployees(){
		
		
		
		return emp.getEmployees();		
	}
	
	@GetMapping("/getEmployeeById/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return emp.getEmployeeById(id);
	}
	
	@DeleteMapping("/deleteEmployeeById/{id}")
	public boolean deleteEmployeeById(@PathVariable int id) {
		return emp.deleteEmployee(id);
	}

}
