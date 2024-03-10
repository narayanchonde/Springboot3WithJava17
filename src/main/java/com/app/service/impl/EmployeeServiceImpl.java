package com.app.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Employee;
import com.app.respository.EmployeeRepository;
import com.app.service.IEmployee;

@Service
public class EmployeeServiceImpl implements IEmployee{
	
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public Integer createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return empRepo.save(employee).getEmpId();
	}

	@Override
	public Integer updateEmployee(Employee employee) {
		
		return empRepo.save(employee).getEmpId();
	}

	@Override
	public Employee getOneEmployee(Integer empId) {
		// TODO Auto-generated method stub
		Optional<Employee>opt=empRepo.findById(empId);
		return opt.get() ;
	}

	@Override
	public String deleteOneEmployee(Integer empId) {
		// TODO Auto-generated method stub
		if(empId!=null) {
			empRepo.deleteById(empId);
			return "Employee id "+empId+"Deleted ";
		}else {
			return "Employee "+empId+" not Exist try agian ";
		}
	}

}
