package com.sachinkumar.hrms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sachinkumar.hrms.Models.Education;

@Repository
public interface EducationRepo extends JpaRepository<Education, Integer> {

}
