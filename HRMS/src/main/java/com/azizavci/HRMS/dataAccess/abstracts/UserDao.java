package com.azizavci.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azizavci.HRMS.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer> {

	User getByEmail(String Email);
	
}
