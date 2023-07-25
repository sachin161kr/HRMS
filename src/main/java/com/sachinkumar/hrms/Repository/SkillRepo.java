package com.sachinkumar.hrms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sachinkumar.hrms.Models.Skill;

@Repository
public interface SkillRepo extends JpaRepository<Skill, Integer> {

}
