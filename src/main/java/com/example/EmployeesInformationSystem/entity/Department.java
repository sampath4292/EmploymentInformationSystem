package com.example.EmployeesInformationSystem.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="department")
public class Department {
    
    @Id
    @Column(name = "department_id")
    private Integer DepartmentId;

    @Column(name = "department_name")
    private String DepartmentName;

    @OneToMany(mappedBy="department")
    private List <Employee>employees;

    @OneToOne
    @JoinColumn(name = "hod_employee_id")
    private Employee hod;
    

    public Department(Integer DepartmentId, String DepartmentName) {
        this.DepartmentId = DepartmentId;
        this.DepartmentName = DepartmentName;
    }

    public Department(){}

    public Integer getDepartmentId() {
        return DepartmentId;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Employee getHod() {
        return hod;
    }

    public void setHod(Employee hod) {
        this.hod = hod;
    }

    public void setDepartmentId(Integer DepartmentId) {
        this.DepartmentId = DepartmentId;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String DepartmentName) {
        this.DepartmentName = DepartmentName;
    }

    @Override
    public String toString() {
        return "Department [DepartmentId=" + DepartmentId + ", DepartmentName=" + DepartmentName + ", toString()="
                + super.toString() + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((DepartmentId == null) ? 0 : DepartmentId.hashCode());
        result = prime * result + ((DepartmentName == null) ? 0 : DepartmentName.hashCode());
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
        Department other = (Department) obj;
        if (DepartmentId == null) {
            if (other.DepartmentId != null)
                return false;
        } else if (!DepartmentId.equals(other.DepartmentId))
            return false;
        if (DepartmentName == null) {
            if (other.DepartmentName != null)
                return false;
        } else if (!DepartmentName.equals(other.DepartmentName))
            return false;
        return true;
    }

    

}
