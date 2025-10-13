package com.hw2.model.service;

import com.hw2.model.dto.Employee;

public class Company implements ManagementSystem{

	private Employee[] employees = new Employee[10];
	
	private int employeeCount;
	
	
	
	public Company(int size); 
	
}
