package com.sursatech.people_mgmt.dao;


import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.sursatech.people_mgmt.entities.Person;

public interface PeopleMgmtDao extends CrudRepository<Person, Integer> {

	@Query("SELECT p FROM Person p WHERE p.firstName=:firstname Or p.lastName=:lastname")
	List<Person> findByFirstNameOrLastName(@Param("firstname") String firstName, @Param("lastname") String lastName);
}
