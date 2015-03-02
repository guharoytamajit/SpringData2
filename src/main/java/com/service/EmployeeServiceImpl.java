package com.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.IEmployeeDao;
import com.entity.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements IEmployeeSvc {

	@Autowired
	IEmployeeDao employeeDao;

	public Employee create(Employee employee) {
		return employeeDao.create(employee);
	}

	public Employee read(Integer id) {
		return employeeDao.read(id);
	}

	public Employee update(Employee employee) {
		return employeeDao.update(employee);
	}

	public void delete(Employee employee) {
		employeeDao.delete(employee);
	}

}
