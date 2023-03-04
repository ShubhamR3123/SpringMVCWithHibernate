package com.ShubhamIT.SprinMVCWithHibernate.service;



import java.util.List;

import com.ShubhamIT.SprinMVCWithHibernate.model.Employee;



public interface EmployeeServiceI {

	public int saveEmployee(Employee emp);

   public List<Employee> getAllEmployees();



}
