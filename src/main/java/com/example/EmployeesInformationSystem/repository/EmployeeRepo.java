package com.example.EmployeesInformationSystem.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.EmployeesInformationSystem.entity.Employee;
import jakarta.transaction.Transactional;


public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

    List<Employee> findByJobJobId(Integer job_id);
    List<Employee> findByDepartmentDepartmentId(Integer department_id);
    List<Employee> findByEmployeeNameContaining(String employee_name);
    List<Employee> findByEmployeeSalaryBetween(Integer a,Integer b);


    @Query(value = """
        SELECT *
        FROM employee
        WHERE DATEDIFF(YEAR, employee_doj, GETDATE()) > :years
        """, nativeQuery = true)
    List<Employee> findEmployeesByExperience(@Param("years") Integer years);


    @Modifying
    @Transactional
    @Query("""
       UPDATE Employee e
       SET e.EmployeeSalary = :salary
       WHERE e.EmployeeId = :id
       """)
    int updateEmployeeSalary(@Param("id") Integer EmployeeId,@Param("salary") Integer EmployeeSalary);
}
