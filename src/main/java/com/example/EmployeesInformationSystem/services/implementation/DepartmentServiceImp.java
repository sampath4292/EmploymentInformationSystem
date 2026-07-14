package com.example.EmployeesInformationSystem.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeesInformationSystem.entity.Department;
import com.example.EmployeesInformationSystem.repository.DepartmentRepo;
import com.example.EmployeesInformationSystem.services.DepartmentService;

@Service
public class DepartmentServiceImp implements DepartmentService {

    @Autowired
    DepartmentRepo repo;

    @Override
    public List<Department> GetDepartments() {
        return repo.findAll();
    }
    
}
