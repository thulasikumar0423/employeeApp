package com.example.employeeApp.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employeeApp.model.Employee;
import com.example.employeeApp.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {
	
	private final EmployeeRepository repo;
	
	public EmployeeService(EmployeeRepository repo) {
		this.repo= repo;
	}
	
	//save a new employee
	public Employee saveEmployee(Employee emp) {
		return repo.save(emp);
	}
	
	//for bulk entries
	public List<Employee> saveAllEmployees(List<Employee> employees) {
	    return repo.saveAll(employees);
	}
	
	// get all employees
	public List<Employee> getAllEmployees(){
		return repo.findAll();
	}
	
	// get employee by id
	public Employee getEmployeeById(Long id) {
		return repo.findById(id).orElse(null);
	}
	
	//update salary by employee name 
	@Transactional
	public Employee updateSalaryByName(String name,Double newSalary) {
		Employee employee = repo.findByName(name);
		if(employee != null) {
		employee.setSal(newSalary);
		return repo.save(employee);
		}
		return null;
		
	}
	
	// delete employee by id
	public String deleteEmployeeById(Long id) {
		repo.deleteById(id);
		return "Employee with ID " + id + " deleted successfully!";
	}
	
	// delete employee by name
	public String deleteEmployeeByName(String name) {
		repo.deleteByName(name);
		return "Employee with Name " + name + " deleted successfully!";
	}

	
}
