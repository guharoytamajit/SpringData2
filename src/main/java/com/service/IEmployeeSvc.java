package com.service;

import com.entity.Employee;

public interface IEmployeeSvc {
	Employee create(Employee employee);

	Employee read(Integer id);

	Employee update(Employee employee);

	void delete(Employee employee);
}
