package com.sachinkumar.hrms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sachinkumar.hrms.Models.Education;

public interface EducationRepo extends JpaRepository<Education, Integer> {

}
