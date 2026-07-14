package com.example.EmployeesInformationSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeesInformationSystem.entity.Department;
import com.example.EmployeesInformationSystem.services.DepartmentService;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    DepartmentService service;

    @PostMapping("/")
    public List<Department> postMethodName() {
        return service.GetDepartments();
    }
    
}
