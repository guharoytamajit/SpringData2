package com.builder;

import com.entity.Employee;

public class EmployeeBuilder {

	private Employee employee = new Employee();

	public static EmployeeBuilder newInstance() {
		return new EmployeeBuilder();
	}

	public EmployeeBuilder eid(int eid) {
		employee.setEid(eid);
		return this;
	}

	public EmployeeBuilder name(String name) {
		employee.setName(name);
		return this;
	}

	public Employee build() {
		return this.employee;
	}

	public static Employee anyEmployee() {
		return newInstance().eid(9).name("name").build();
	}
}