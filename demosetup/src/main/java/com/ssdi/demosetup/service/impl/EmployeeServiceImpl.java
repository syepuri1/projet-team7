package com.ssdi.demosetup.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssdi.demosetup.Repository.EmployeeRepository;
import com.ssdi.demosetup.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	public EmployeeRepository repository;
	
	
	public EmployeeServiceImpl(EmployeeRepository repository) {
		super();
		this.repository = repository;
	}


	@Override
	public List<Employee> getService() {
		return repository.findAll();
	}


	@Override
	public void saveService(Employee emp) {
		repository.save(emp);	
	}

	
}
