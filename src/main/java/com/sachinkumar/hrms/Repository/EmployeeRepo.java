package com.sachinkumar.hrms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sachinkumar.hrms.Models.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
