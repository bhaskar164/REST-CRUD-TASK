package com.interview.company.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interview.company.entity.Department;
import com.interview.company.repository.DataRepository;
import com.interview.company.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepository repo;
	
	static int deptId;
	
	public void addDepartment(String deptName, boolean deptStatus) {
		deptId = 1;
		Department dept = new Department(deptId,deptName,deptStatus);
		deptId++;
		repo.addDepartment(dept);
		
		
	}

	public void delDepartment(int deptId) {
		repo.deleteById(deptId);
		
	}
	
}
