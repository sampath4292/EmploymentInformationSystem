package com.example.EmployeesInformationSystem.services.implementation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeesInformationSystem.entity.Employee;
import com.example.EmployeesInformationSystem.repository.EmployeeRepo;
import com.example.EmployeesInformationSystem.services.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepo repo;

    @Override
    public List<Employee> EmployeebyDept(Integer a) {
        return repo.findByDepartmentDepartmentId(a);
    }

    @Override
    public List<Employee> EmployeebyJob(Integer a) {
        return repo.findByJobJobId(a);
    }

    @Override
    public List<Employee> EmployeebySalary(Integer a, Integer b) {
        return repo.findByEmployeeSalaryBetween(a,b);
    }

    @Override
    public List<Employee> EmployeewithExp(Integer a) {
        return repo.findEmployeesByExperience(a);
    }

    @Override
    public List<Employee> EmployeewithName(String s) {
        return repo.findByEmployeeNameContaining(s);
    }

    @Override
    public int UpdateEmpSalary(Integer a,Integer b)
    {
        return repo.updateEmployeeSalary(a,b);
    }
    
}
