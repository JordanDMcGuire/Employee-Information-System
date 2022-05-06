package com.mcguire.EmployeeManager;

import com.mcguire.EmployeeManager.model.User;
import com.mcguire.EmployeeManager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagerApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("John", "Doe", "John@gmail.com"));
		this.userRepository.save(new User("Jane", "Doe", "Jane@gmail.com"));
		this.userRepository.save(new User("Jimmy", "Doe", "Jimmy@gmail.com"));
	}
}
