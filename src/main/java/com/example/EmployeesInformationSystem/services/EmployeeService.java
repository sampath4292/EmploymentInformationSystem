package com.example.EmployeesInformationSystem.services;

import java.util.List;

import com.example.EmployeesInformationSystem.entity.Employee;


public interface EmployeeService {

    List<Employee> EmployeebyDept(Integer a);
    List<Employee> EmployeebyJob(Integer a);
    List<Employee> EmployeewithName(String s);
    List<Employee> EmployeebySalary(Integer a,Integer b);
    List<Employee> EmployeewithExp(Integer a);
    int UpdateEmpSalary(Integer a,Integer b);
    
}
