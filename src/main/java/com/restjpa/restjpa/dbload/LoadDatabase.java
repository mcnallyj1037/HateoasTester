package com.restjpa.restjpa.dbload;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.restjpa.restjpa.entity.Employee;
import com.restjpa.restjpa.repository.EmployeeRepository;

@Configuration
public class LoadDatabase {

	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
	
	@Bean
	public CommandLineRunner initDatabase(EmployeeRepository repository) {

	    return args -> {
	      log.info("Preloading " + repository.save(new Employee("Jeremy McNally", "Father")));
	      log.info("Preloading " + repository.save(new Employee("Aiden McNally", "Son")));
	    };
	  }
}
