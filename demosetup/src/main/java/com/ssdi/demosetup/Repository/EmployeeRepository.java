package com.ssdi.demosetup.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssdi.demosetup.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
