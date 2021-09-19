package com.ssdi.demosetup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@Column(name = "employee_id")
//	@GeneratedValue()
	public Integer employeeId;
	
	@Column(name = "email_address")
	public String emailAddress;
	@Column(name = "password")
	public String password;
	@Column(name = "first_name")
	public String firstName;
	@Column(name = "last_name")
	public String lastName;
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", emailAddress=" + emailAddress + ", password=" + password
				+ ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	public Employee(Integer employeeId, String emailAddress, String password, String firstName, String lastName) {
		super();
		this.employeeId = employeeId;
		this.emailAddress = emailAddress;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Employee(){
		
	}

	
}
