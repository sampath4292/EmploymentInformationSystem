package com.example.EmployeesInformationSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmployeesInformationSystem.entity.JobHistory;
import com.example.EmployeesInformationSystem.entity.JobHistoryId;

public interface JobHistoryRepo extends JpaRepository<JobHistory,JobHistoryId> {
    List<JobHistory> findByEmployeeEmployeeId(Integer a);
    
}
