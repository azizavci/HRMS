package com.azizavci.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azizavci.HRMS.entities.concretes.Skill;

public interface SkillDao extends JpaRepository<Skill, Integer>{

}
