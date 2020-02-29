package com.sv.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sv.project.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	

}
