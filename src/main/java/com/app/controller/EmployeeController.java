package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Employee;
import com.app.service.IEmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@Autowired 
	private  IEmployeeService service;

	//1 Employee  details saving into database operation 
	@PostMapping("/create")
	public ResponseEntity<String> createOneEmployee(@RequestBody Employee employee){
		ResponseEntity<String> response=null;
		
		Integer createdId=service.createEmployee(employee);
	
		response=ResponseEntity.ok("Employee id "+createdId+" created ");
		return response ; 
		
	}
	
	//2. find one employee find by id
	@GetMapping("/find/{empId}")
	public ResponseEntity<Employee> getOneEmplyee(@PathVariable Integer empId){
		ResponseEntity<Employee> response=null;
		Employee employee=service.getOneEmployee(empId);
		response=ResponseEntity.ok(employee);
		
		return response;
	}
	
	
	//3 Employee  details update into database operation 
	@PutMapping("/update")
	public ResponseEntity<String > updateEmployee(@RequestBody Employee employee){
		ResponseEntity<String> response=null;
		Integer updatedId =service.updateEmployee(employee);
		response=ResponseEntity.ok("Employee  Id "+updatedId+" Updated  ");
		return response; 
	}
	
	//4. delete operation by employee id
	
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<String > deleteOneEmployee(@PathVariable Integer empId){
		ResponseEntity<String > response=null;
		String message=service.deleteOneEmployee(empId);
		response=ResponseEntity.ok(message);
		return response;
	}
	
}
