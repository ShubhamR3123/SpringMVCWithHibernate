package com.ShubhamIT.SprinMVCWithHibernate.dao;

import java.util.List;

import com.ShubhamIT.SprinMVCWithHibernate.model.Employee;

public interface EmployeeDaoI {

	public int saveEmployee(Employee emp);

	public List<Employee> getAllEmployees();

}
