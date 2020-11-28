package com.example.springbasic.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbasic.dao.EmployeeRepository;
import com.example.springbasic.entity.Employee;
import com.example.springbasic.service.EmployeeService;


@Service
public class EmployeeServiceImp implements EmployeeService{

	
	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public boolean saveEmployee(Employee e) {
		// TODO Auto-generated method stub
		empRepo.save(e);
		return true;
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	
	}

	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		empRepo.deleteById(id);
		return true;
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return empRepo.getOne(id);
		
	}
	
	

}
