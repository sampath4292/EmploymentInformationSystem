package com.example.EmployeesInformationSystem.entity;

import java.util.Date;
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
    @Column(name="employee_id")c
    private Integer employee_id;

    @Column(name = "employee_name")
    private String employee_name;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @Column(name = "employee_salary")
    private Integer employee_salary;

    @Column(name = "employee_doj")
    private Date date;

    @OneToMany(mappedBy = "employee")
    private List<JobHistory> jobHistories;


    public Employee(){}

    public Employee(Integer employee_id, String employee_name, Job job, Department department, Integer employee_salary,
            Date date) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.job = job;
        this.department = department;
        this.employee_salary = employee_salary;
        this.date = date;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
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

    public Integer getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(Integer employee_salary) {
        this.employee_salary = employee_salary;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
        result = prime * result + ((employee_id == null) ? 0 : employee_id.hashCode());
        result = prime * result + ((employee_name == null) ? 0 : employee_name.hashCode());
        result = prime * result + ((job == null) ? 0 : job.hashCode());
        result = prime * result + ((department == null) ? 0 : department.hashCode());
        result = prime * result + ((employee_salary == null) ? 0 : employee_salary.hashCode());
        result = prime * result + ((date == null) ? 0 : date.hashCode());
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
        if (employee_id == null) {
            if (other.employee_id != null)
                return false;
        } else if (!employee_id.equals(other.employee_id))
            return false;
        if (employee_name == null) {
            if (other.employee_name != null)
                return false;
        } else if (!employee_name.equals(other.employee_name))
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
        if (employee_salary == null) {
            if (other.employee_salary != null)
                return false;
        } else if (!employee_salary.equals(other.employee_salary))
            return false;
        if (date == null) {
            if (other.date != null)
                return false;
        } else if (!date.equals(other.date))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", job=" + job
                + ", department=" + department + ", employee_salary=" + employee_salary + ", date=" + date
                + ", toString()=" + super.toString() + "]";
    }

    


}
