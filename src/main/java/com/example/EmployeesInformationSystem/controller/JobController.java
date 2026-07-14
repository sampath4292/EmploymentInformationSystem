package com.example.EmployeesInformationSystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.EmployeesInformationSystem.entity.Job;
import com.example.EmployeesInformationSystem.services.JobService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/job")
public class JobController {

    @Autowired
    JobService service;

    @GetMapping
    public List<Job> getMethodName() {
        return service.GetJobs();
    }
    
}
