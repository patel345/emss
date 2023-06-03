package com.ems.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long eid;
    private String name;
    private String city;
    private String email;
    private  Long mobile;
    @OneToMany(mappedBy = "employee")
    private List<Bonus> bonuses;
}
