package com.scaleupindia.repository;

import java.util.List;

import com.scaleupindia.entity.Employee;

/**
 * @author abhishekvermaa10
 *
 */
public interface EmployeeRepository {

	List<Employee> fetchEmployees();

}