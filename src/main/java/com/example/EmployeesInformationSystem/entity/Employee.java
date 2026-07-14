package com.example.EmployeesInformationSystem.entity;

import java.sql.Date;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
    
    @Id
    @Column(name="EmployeeId")
    private Integer EmployeeId;

    @Column(name = "EmployeeName")
    private String EmployeeName;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @Column(name = "employee_salary")
    private Integer EmployeeSalary;

    @Column(name = "employee_doj")
    private Date DOJ;

    @OneToMany(mappedBy = "employee")
    private List<JobHistory> jobHistories;


    public Employee(){}

    public Employee(Integer EmployeeId, String EmployeeName, Job job, Department department, Integer EmployeeSalary,
            Date DOJ) {
        this.EmployeeId = EmployeeId;
        this.EmployeeName = EmployeeName;
        this.job = job;
        this.department = department;
        this.EmployeeSalary = EmployeeSalary;
        this.DOJ = DOJ;
    }

    public Integer getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(Integer EmployeeId) {
        this.EmployeeId = EmployeeId;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Integer getEmployeeSalary() {
        return EmployeeSalary;
    }

    public void setEmployeeSalary(Integer EmployeeSalary) {
        this.EmployeeSalary = EmployeeSalary;
    }

    public Date getDOJ() {
        return DOJ;
    }

    public void setDOJ(Date DOJ) {
        this.DOJ = DOJ;
    }
        public List<JobHistory> getJobHistories() {
        return jobHistories;
    }

    public void setJobHistories(List<JobHistory> jobHistories) {
        this.jobHistories = jobHistories;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((EmployeeId == null) ? 0 : EmployeeId.hashCode());
        result = prime * result + ((EmployeeName == null) ? 0 : EmployeeName.hashCode());
        result = prime * result + ((job == null) ? 0 : job.hashCode());
        result = prime * result + ((department == null) ? 0 : department.hashCode());
        result = prime * result + ((EmployeeSalary == null) ? 0 : EmployeeSalary.hashCode());
        result = prime * result + ((DOJ == null) ? 0 : DOJ.hashCode());
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
        Employee other = (Employee) obj;
        if (EmployeeId == null) {
            if (other.EmployeeId != null)
                return false;
        } else if (!EmployeeId.equals(other.EmployeeId))
            return false;
        if (EmployeeName == null) {
            if (other.EmployeeName != null)
                return false;
        } else if (!EmployeeName.equals(other.EmployeeName))
            return false;
        if (job == null) {
            if (other.job != null)
                return false;
        } else if (!job.equals(other.job))
            return false;
        if (department == null) {
            if (other.department != null)
                return false;
        } else if (!department.equals(other.department))
            return false;
        if (EmployeeSalary == null) {
            if (other.EmployeeSalary != null)
                return false;
        } else if (!EmployeeSalary.equals(other.EmployeeSalary))
            return false;
        if (DOJ == null) {
            if (other.DOJ != null)
                return false;
        } else if (!DOJ.equals(other.DOJ))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", job=" + job
                + ", department=" + department + ", EmployeeSalary=" + EmployeeSalary + ", DOJ=" + DOJ
                + ", toString()=" + super.toString() + "]";
    }

    


}
