package com.example.EmployeesInformationSystem.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="job")
public class Job {
    @Id
    @Column(name = "job_id")
    private Integer JobId;
    @Column(name = "job_title")
    private String JobTitle;

    @OneToMany(mappedBy = "job")
    private List<Employee>employees;

    public Job(Integer JobId, String JobTitle) {
    this.JobId = JobId;
    this.JobTitle = JobTitle;
    }

    public Job(){}

    public List<Employee> getEmployees() {
    return employees;
    }

    public void setEmployees(List<Employee> employees) {
    this.employees = employees;
    }
    public Integer getJobId() {
        return JobId;
    }
    public void setJobId(Integer JobId) {
        this.JobId = JobId;
    }
    public String getJobTitle() {
        return JobTitle;
    }
    public void setJobTitle(String JobTitle) {
        this.JobTitle = JobTitle;
    }

    @Override
    public String toString() {
        return "Job [JobId=" + JobId + ", JobTitle=" + JobTitle + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((JobId == null) ? 0 : JobId.hashCode());
        result = prime * result + ((JobTitle == null) ? 0 : JobTitle.hashCode());
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
        Job other = (Job) obj;
        if (JobId == null) {
            if (other.JobId != null)
                return false;
        } else if (!JobId.equals(other.JobId))
            return false;
        if (JobTitle == null) {
            if (other.JobTitle != null)
                return false;
        } else if (!JobTitle.equals(other.JobTitle))
            return false;
        return true;
    }
    
}
