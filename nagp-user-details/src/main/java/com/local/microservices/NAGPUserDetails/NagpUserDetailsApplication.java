package com.local.microservices.NAGPUserDetails;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NagpUserDetailsApplication {

	@Autowired
	UserRepo userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(NagpUserDetailsApplication.class, args);
	}
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable long id )
	{
		Optional<User> user=userRepository.findByUserId(id);
		if(user.isPresent())
			return user.get();
		return null;
	}

}
