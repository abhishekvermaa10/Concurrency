package com.scaleupindia.service.impl;

import java.util.List;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.repository.EmployeeRepository;

/**
 * @author abhishekvermaa10
 *
 */
public class EmployeeServiceImpl implements Runnable {
	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	public void run() {
		List<Employee> employeeList;
		System.out.println(Thread.currentThread().getName() + " started fetching from : " + employeeRepository);
		employeeList = employeeRepository.fetchEmployees();
		System.out.println(Thread.currentThread().getName() + " finished fetching from : " + employeeRepository);
	}
}
