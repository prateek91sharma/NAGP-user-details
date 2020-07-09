package com.local.microservices.NAGPUserDetails;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{
	
	public Optional<User> findByUserId(Long userId);
	
}
