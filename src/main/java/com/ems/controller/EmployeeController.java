package com.ems.controller;

import com.ems.payload.BonusDTO;
import com.ems.payload.EmployeeDTO;
import com.ems.service.BonusService;
import com.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
  @Autowired
  private BonusService bonusService;
    //http://localhost:8081/api/employee
    @PostMapping
   public ResponseEntity<EmployeeDTO>createEmployee(@RequestBody EmployeeDTO employeeDTO){
        EmployeeDTO createEmployee=employeeService.createEmployee(employeeDTO);
        return  new ResponseEntity<>(createEmployee, HttpStatus.CREATED);
    }
    //http://localhost:8081/api/employee/1/bonus
    @PostMapping("/{eid}/bonus")
    public ResponseEntity<BonusDTO>saveBonus(@PathVariable("eid") long eid,@RequestBody BonusDTO bonusDTO){
       BonusDTO dto=bonusService.createBonus(eid,bonusDTO);
       return new ResponseEntity<>(dto,HttpStatus.CREATED);
    }
}
