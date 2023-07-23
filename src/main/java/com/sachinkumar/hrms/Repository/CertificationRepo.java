package com.sachinkumar.hrms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sachinkumar.hrms.Models.Certification;

public interface CertificationRepo extends JpaRepository<Certification, Integer> {

}
