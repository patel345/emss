package com.ems.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class Bonus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bid;
    private Double amount;
    @ManyToOne
    @JoinColumn(name = "eid")
    private Employee employee;
}
