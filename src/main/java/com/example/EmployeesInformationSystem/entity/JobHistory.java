package com.example.EmployeesInformationSystem.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "job_history")
public class JobHistory {

    @EmbeddedId
    private JobHistoryId id;

    @ManyToOne
    @MapsId("employeeId")
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @MapsId("jobId")
    @JoinColumn(name = "job_id")
    private Job job;

    private LocalDate startDate;

    private LocalDate endDate;



    public JobHistory() {
    }

    
    // Getters and Setters

    public JobHistory(JobHistoryId id, Employee employee, Job job, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.employee = employee;
        this.job = job;
        this.startDate = startDate;
        this.endDate = endDate;
    }




    public JobHistoryId getId() {
        return id;
    }

    public void setId(JobHistoryId id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((employee == null) ? 0 : employee.hashCode());
        result = prime * result + ((job == null) ? 0 : job.hashCode());
        result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
        result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        JobHistory other = (JobHistory) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (employee == null) {
            if (other.employee != null)
                return false;
        } else if (!employee.equals(other.employee))
            return false;
        if (job == null) {
            if (other.job != null)
                return false;
        } else if (!job.equals(other.job))
            return false;
        if (startDate == null) {
            if (other.startDate != null)
                return false;
        } else if (!startDate.equals(other.startDate))
            return false;
        if (endDate == null) {
            if (other.endDate != null)
                return false;
        } else if (!endDate.equals(other.endDate))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "JobHistory [id=" + id + ", employee=" + employee + ", job=" + job + ", startDate=" + startDate
                + ", endDate=" + endDate + "]";
    }

    

}