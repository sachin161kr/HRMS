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
    private int emd_id;

    private String emp_name;

    private String emp_email;

    private String emp_address;

    private String emp_phone;

    @OneToOne(cascade = CascadeType.ALL)
    private Skill skills;

    @OneToOne(cascade = CascadeType.ALL)
    private Education education;

    @OneToOne(cascade = CascadeType.ALL)
    private Certification certification;

    @OneToOne(cascade = CascadeType.ALL)
    private Project project;
}
