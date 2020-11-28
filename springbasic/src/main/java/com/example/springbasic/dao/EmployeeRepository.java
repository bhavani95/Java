/**
 * 
 */
package com.example.springbasic.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbasic.entity.Employee;

/**
 * @author bhavanikuppagiri
 *
 */



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
		

}
