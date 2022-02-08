package com.interview.company.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interview.company.entity.Employee;
import com.interview.company.repository.DataRepository;

@Service
public class EmployeeService {

	@Autowired
	DataRepository repo;
	
	static int id;
	
	public void addEmployee(String empName, boolean empStatus) {
		id = 1;
		Employee emp = new Employee(id, empName, empStatus);
		id++;
		repo.addEmployeeInDatabase(emp);
		System.out.println("Employee Added Succes!!");
	}

	public void delemployee(int empId) {
		repo.deleteById(empId);
		System.out.println("Employee removed Succes!!");
		
	}

}
