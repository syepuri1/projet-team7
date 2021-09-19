package com.ssdi.demosetup.service.impl;

import java.util.List;

import com.ssdi.demosetup.model.Employee;

public interface EmployeeService {

	void saveService(Employee emp);
	List<Employee> getService();
}
