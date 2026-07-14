package com.example.EmployeesInformationSystem.services;

import java.time.LocalDate;
import java.util.List;


import com.example.EmployeesInformationSystem.entity.JobHistory;


public interface JobHistorySevice {

    List<JobHistory> EmployeeJobHistory(Integer a);
    void SaveEmpHistory(JobHistory j);
}
