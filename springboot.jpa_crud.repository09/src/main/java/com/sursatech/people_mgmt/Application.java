package com.sursatech.people_mgmt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.sursatech.people_mgmt.entities.Person;
import com.sursatech.people_mgmt.service.PeopleMgmtService;


@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	private PeopleMgmtService peopleMgmtService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);}

	@Override
	public void run(String... args) throws Exception {		
		List<Person> list = peopleMgmtService.findByFirstNameOrLastName("Test4","User");
		list.forEach(System.out::println);
	}
}
