package com.ems.service;

import com.ems.entities.Bonus;
import com.ems.entities.Employee;
import com.ems.payload.BonusDTO;
import com.ems.repository.BonusRepository;
import com.ems.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BonusService {
    @Autowired
    private BonusRepository bonusRepository;
    @Autowired
    private EmployeeRepository employeeRepository;
    public BonusDTO createBonus(long eid,BonusDTO bonusDTO){
     Employee employee =  employeeRepository.findById(eid).get();
        Bonus bonus=new Bonus();
       bonus.setAmount(bonusDTO.getAmount());
       bonus.setEmployee(employee);


     bonus=bonusRepository.save(bonus);
     BonusDTO dto=new BonusDTO();
     dto.setBid(bonus.getBid());
     dto.setAmount(bonus.getAmount());

     return dto;
    }
}
