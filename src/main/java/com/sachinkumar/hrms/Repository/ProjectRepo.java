package com.sachinkumar.hrms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sachinkumar.hrms.Models.Project;

public interface ProjectRepo extends JpaRepository<Project, Integer> {

}
