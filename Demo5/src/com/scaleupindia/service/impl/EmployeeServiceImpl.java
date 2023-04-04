package com.scaleupindia.service.impl;

import java.util.List;
import java.util.concurrent.Callable;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.repository.EmployeeRepository;

/**
 * @author abhishekvermaa10
 *
 */
public class EmployeeServiceImpl implements Callable<List<Employee>> {
	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	public List<Employee> call() {
		List<Employee> employeeList;
		System.out.println(Thread.currentThread().getName() + " started fetching from : " + employeeRepository);
		employeeList = employeeRepository.fetchEmployees();
		System.out.println(Thread.currentThread().getName() + " finished fetching from : " + employeeRepository);
		return employeeList;
	}
}
