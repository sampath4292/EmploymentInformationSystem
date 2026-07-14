package com.example.EmployeesInformationSystem.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeesInformationSystem.entity.Job;
import com.example.EmployeesInformationSystem.repository.JobRepo;
import com.example.EmployeesInformationSystem.services.JobService;

@Service
public class JobServiceImp implements JobService{
    
    @Autowired
    JobRepo repo;

    @Override
    public List<Job> GetJobs() {
        return repo.findAll();
    }
    

}
