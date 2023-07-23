package com.sachinkumar.hrms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sachinkumar.hrms.Models.Skill;

public interface SkillRepo extends JpaRepository<Skill, Integer> {

}
