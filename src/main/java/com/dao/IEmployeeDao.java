package com.dao;

import com.entity.Employee;

public interface IEmployeeDao {
	Employee create(Employee employee);

	Employee read(Integer id);

	Employee update(Employee employee);

	void delete(Employee employee);
}
