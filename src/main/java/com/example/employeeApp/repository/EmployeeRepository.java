package com.example.employeeApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.employeeApp.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	 Employee findByName(String name);
	 @Transactional
	 @Modifying
	 @Query("DELETE FROM Employee e WHERE e.name = :name")
	 void deleteByName(@Param("name") String name);
	 

}
