package com.ara.programming.ds;

public class EmployeeNode {

	Employee employee;
	EmployeeNode next;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeNode getNext() {
		return next;
	}

	public void setNext(EmployeeNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "EmployeeNode [employee=" + employee + "]";
	}

}
