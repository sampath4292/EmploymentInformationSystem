package com.example.EmployeesInformationSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmployeesInformationSystem.entity.Department;

public interface DepartmentRepo  extends JpaRepository<Department,Integer>{
    
}
