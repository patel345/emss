package com.ems.payload;

import com.ems.entities.Bonus;
import lombok.Data;

import java.util.List;

@Data
public class EmployeeDTO {
   private Long eid;
   private String name;
   private String city;
   private String email;
   private Long mobile;
   //private List<BonusDTO>bounes;
}
