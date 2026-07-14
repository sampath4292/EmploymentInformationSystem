package com.example.EmployeesInformationSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmployeesInformationSystem.entity.Job;

public interface JobRepo extends JpaRepository<Job,Integer> {

    

}
