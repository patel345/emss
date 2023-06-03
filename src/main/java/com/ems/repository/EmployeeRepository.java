package com.ems.repository;

import com.ems.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    //List<Object> findAllById(long eid);
}
