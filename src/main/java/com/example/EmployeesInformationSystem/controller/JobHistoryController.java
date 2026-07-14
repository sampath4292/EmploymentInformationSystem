package com.example.EmployeesInformationSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeesInformationSystem.entity.JobHistory;
import com.example.EmployeesInformationSystem.services.implementation.JobHistoryServiceImp;
import com.example.EmployeesInformationSystem.services.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/history")
public class JobHistoryController {
    private JobHistorySevice service;
    public JobHistoryController(JobHistorySevice service)
    {
        this.service=service;
    }
    @PostMapping("{id}")
    public List<JobHistory> postMethodName(@PathVariable Integer id) {
        return service.EmployeeJobHistory(id);
    }
    @PostMapping
    public void addHistory(@RequestBody JobHistory jobHistory) {

        service.SaveEmpHistory(jobHistory);
    }
    
    
}
