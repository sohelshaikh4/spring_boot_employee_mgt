package com.example.annotation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.annotation.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>
{

}
