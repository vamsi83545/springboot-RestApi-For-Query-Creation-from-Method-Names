package com.sigma.revision.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sigma.revision.model.Customer;

public interface customerDao extends JpaRepository<Customer, Integer> {

	public Customer findByFirstName(String firstName);
	public Customer findByFirstNameOrLastName(String firstName,String lastName);
	public Customer findByFirstNameAndLastName(String firstName,String lastName);
	public List<Customer> findByAgeLessThanEqual(Integer age);
	public List<Customer> findByAgeGreaterThanEqual(Integer age);
	public Customer findByFirstNameNotLike(String name);
	public Customer findByLastNameStartingWith(String letter);
	public Customer findByFirstNameContaining(String word);
	public Customer findBylastNameNot(String lastname);



}
