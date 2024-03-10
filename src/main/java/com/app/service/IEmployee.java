package com.app.service;

import com.app.entity.Employee;

public interface IEmployee {

	Integer createEmployee(Employee employee);

	Integer updateEmployee(Employee employee);

	Employee getOneEmployee(Integer empId);

	String deleteOneEmployee(Integer empId);

}
