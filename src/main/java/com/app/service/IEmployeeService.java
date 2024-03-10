package com.app.service;

import com.app.entity.Employee;

public interface IEmployeeService {

	Integer createEmployee(Employee employee);

	Integer updateEmployee(Employee employee);

	Employee getOneEmployee(Integer empId);

	String deleteOneEmployee(Integer empId);

}
