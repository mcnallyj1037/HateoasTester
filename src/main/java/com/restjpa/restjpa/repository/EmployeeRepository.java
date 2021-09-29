package com.restjpa.restjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restjpa.restjpa.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	
}
