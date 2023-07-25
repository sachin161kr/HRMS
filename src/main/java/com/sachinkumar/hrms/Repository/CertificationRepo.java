package com.sachinkumar.hrms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sachinkumar.hrms.Models.Certification;

@Repository
public interface CertificationRepo extends JpaRepository<Certification, Integer> {

}
