package com.azizavci.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.azizavci.HRMS.entities.concretes.Image;

@Transactional
public interface ImageDao extends JpaRepository<Image, Integer> {

}
