package com.sachinkumar.hrms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sachinkumar.hrms.Models.Project;

@Repository
public interface ProjectRepo extends JpaRepository<Project, Integer> {

}
