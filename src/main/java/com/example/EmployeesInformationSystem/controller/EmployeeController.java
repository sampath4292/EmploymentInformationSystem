package com.example.EmployeesInformationSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeesInformationSystem.entity.Employee;
import com.example.EmployeesInformationSystem.services.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    
    @Autowired
    EmployeeService service;

    @GetMapping("/job/{id}")
    public List<Employee> getByJob(@PathVariable Integer id) {
        return service.EmployeebyJob(id);
    }
    @GetMapping("/dept/{id}")
    public List<Employee> getByDept(@PathVariable Integer id) {
        return service.EmployeebyDept(id);
    }
    @GetMapping("/{name}")
    public List<Employee> getByName(@PathVariable String name) {
        return service.EmployeewithName(name);
    }
    @GetMapping("/salary")
    public List<Employee> getEmpBySalary(@RequestParam Integer a,@RequestParam Integer b) {
        return service.EmployeebySalary(a, b);
    }
    @PutMapping("/{id}/salary")
    public  int editSalary(@PathVariable Integer id, @RequestBody Integer salary) {
        return service.UpdateEmpSalary(id,salary);
    }
    @GetMapping("/exp/{id}")
    public List<Employee> getByExp(@PathVariable Integer id) {
        return service.EmployeewithExp(id);
    }
    
}
