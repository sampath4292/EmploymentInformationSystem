package com.example.EmployeesInformationSystem.services.implementation;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeesInformationSystem.entity.JobHistory;
import com.example.EmployeesInformationSystem.repository.JobHistoryRepo;
import com.example.EmployeesInformationSystem.services.JobHistorySevice;


@Service
public class JobHistoryServiceImp  implements JobHistorySevice{

    @Autowired
    JobHistoryRepo repo;

    @Override
    public List<JobHistory> EmployeeJobHistory(Integer a) {
        return repo.findByEmployeeEmployeeId(a);
    }
    @Override
    public void SaveEmpHistory(JobHistory j){
        repo.save(j);
    }
    
}
