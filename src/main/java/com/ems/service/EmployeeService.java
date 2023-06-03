package com.ems.service;

import com.ems.entities.Bonus;
import com.ems.entities.Employee;
import com.ems.payload.BonusDTO;
import com.ems.payload.EmployeeDTO;
import com.ems.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO){
        Employee employee=new Employee();
        employee.setName(employeeDTO.getName());
        employee.setCity(employeeDTO.getCity());
        employee.setEmail(employeeDTO.getEmail());
        employee.setMobile(employeeDTO.getMobile());

        employee=employeeRepository.save(employee);
        return toDTO(employee);
    }
public List<EmployeeDTO>getAllEmployee(){
    List<Employee> employees=employeeRepository.findAll();
    return employees.stream().map(this::toDTO).collect(Collectors.toList());
}

    private EmployeeDTO toDTO(Employee employee) {
        EmployeeDTO employeeDTO=new EmployeeDTO();
        employeeDTO.setEid(employee.getEid());
        employeeDTO.setName(employee.getName());
        employeeDTO.setCity(employee.getCity());
        employeeDTO.setEmail(employee.getEmail());
        employeeDTO.setMobile(employee.getMobile());




        return  employeeDTO;
    }


}
