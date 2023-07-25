package com.sachinkumar.hrms.Models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int emdid;

    private String empName;

    private String empEmail;

    private String empAddress;

    private String empPhone;

    @OneToOne(cascade = CascadeType.ALL)
    private Skill skills;

    @OneToOne(cascade = CascadeType.ALL)
    private Education education;

    @OneToOne(cascade = CascadeType.ALL)
    private Certification certification;

    @OneToOne(cascade = CascadeType.ALL)
    private Project project;
}
