package com.ShubhamIT.SprinMVCWithHibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ShubhamIT.SprinMVCWithHibernate.dao.EmployeeDaoI;
import com.ShubhamIT.SprinMVCWithHibernate.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeServiceI{

	@Autowired
	private EmployeeDaoI employeeDaoI;

	@Override
	public int saveEmployee(Employee emp) {
		
		int id = employeeDaoI.saveEmployee(emp);
		return id;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> allEmployees = employeeDaoI.getAllEmployees();
		return allEmployees;
	}
}
