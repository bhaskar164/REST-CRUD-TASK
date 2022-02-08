package com.interview.company.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interview.company.services.DepartmentService;
import com.interview.company.services.EmployeeService;

@RestController
public class MainController {
	
	@Autowired
	EmployeeService empService;
	
	@Autowired
	DepartmentService deptService;
	
	@PostMapping("/employee/add/{empName}/{empStatus}")
	public void addEmployee(@PathVariable String empName, boolean empStatus) {
		empService.addEmployee(empName, empStatus);
	}
	
	@PostMapping("department/add/{depName}/{depStatus}")
	public void addDepartment(@PathVariable String deptName, boolean depStatus) {
		deptService.addDepartment(deptName,depStatus);
	}
	
	@GetMapping("department/delete/{deptId}")
	public void deleteDepartment(@PathVariable int deptId) {
		deptService.delDepartment(deptId);
	}
	
	@GetMapping("employee/delete/{empId}")
	public void deleteEmployee(@PathVariable int empId) {
		empService.delemployee(empId);
	}
	
}
