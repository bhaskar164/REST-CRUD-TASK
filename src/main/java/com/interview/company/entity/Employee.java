package com.interview.company.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Employee {
	
	@Id
	int employeeId;
	
	String EmployeeName;
	
	boolean empStatus;

}
