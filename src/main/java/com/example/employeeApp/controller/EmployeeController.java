package com.example.employeeApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.example.employeeApp.model.Employee;
import com.example.employeeApp.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	//Field Injection
	@Autowired
	private  EmployeeService employeeService;
//Constructor Injection
//	private final EmployeeService employeeService;
//
//    public EmployeeController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
	
	//save a new employee
	@PostMapping
	public  ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		return ResponseEntity.ok(employeeService.saveEmployee(employee));
	}
	
	// Add this for bulk save
	@PostMapping("/bulk")
	public ResponseEntity<List<Employee>> saveMultipleEmployees(@RequestBody List<Employee> employees) {
	    return ResponseEntity.ok(employeeService.saveAllEmployees(employees));
	}
	
	// get all employees
	@GetMapping
	public ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }
	
	// get employee by id
	@GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        Employee employee = employeeService.getEmployeeById(id);
        return (employee != null) ? ResponseEntity.ok(employee) : ResponseEntity.notFound().build();
        
    }
	
	//update salary by name 
	@PutMapping("/salary/{name}")
	public ResponseEntity<Employee> updateSalary(@PathVariable String name, @RequestParam double newSalary) {
        Employee updated = employeeService.updateSalaryByName(name, newSalary);
        return (updated != null) ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }
	
	//delete employee by id
	@DeleteMapping("/by-id/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id) {
        return ResponseEntity.ok(employeeService.deleteEmployeeById(id));
    }
	
	//delete by name 
	@DeleteMapping("/by-name/{name}")
    public ResponseEntity<String> deleteByName(@PathVariable String name) {
        return ResponseEntity.ok(employeeService.deleteEmployeeByName(name));
    }


}
