package com.rafaelcosta.rafaelcostadsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelcosta.rafaelcostadsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
}
