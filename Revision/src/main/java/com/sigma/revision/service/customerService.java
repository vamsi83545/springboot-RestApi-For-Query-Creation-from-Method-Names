package com.sigma.revision.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sigma.revision.model.Customer;
import com.sigma.revision.repository.customerDao;

@Service
public class customerService {
	
	@Autowired
	private customerDao dao;
	
	public List<Customer>  getAllcustomer(){
		return dao.findAll();
	}
	public Optional<Customer> getCustomer(Integer id) {
		return dao.findById(id);
	}
	public void deleteCustomer(Integer id) {
		dao.deleteById(id);
	}
	public Customer saveCustomer(Customer cus) {
		return dao.save(cus);
	}
	public List<Customer> saveAllCustomer(List<Customer> cus){
		return dao.saveAll(cus);
	}
	public Customer updateCustomerById(Customer cus,Integer id) {
		Customer customer = dao.findById(id).orElseThrow(()-> new ArithmeticException());
		customer.setFirstName(cus.getFirstName());
		customer.setLastName(cus.getLastName());
		customer.setAddress(cus.getAddress());
		return dao.save(customer);
	}
	
	public Customer updateStudent(Customer cus) {
		return dao.save(cus);
	}
	public Customer findByFirstName(String firstname) {
		return dao.findByFirstName(firstname);
	}
	public Customer findByFirstNameOrLastName(String firstName,String lastName) {
		return dao.findByFirstNameAndLastName(firstName, lastName);
		
	}
	public List<Customer> findByAgeLessThanOrEqual(Integer age) {
		return dao.findByAgeLessThanEqual(age);
	}
	public List<Customer> findByAgeGreaterThanOrEqual(Integer age) {
		return  dao.findByAgeGreaterThanEqual(age);
	}
	public Customer findByNameNotLike(String name) {
		return dao.findByFirstNameNotLike(name);
	}
	public Customer findByNameStartingWith(String letter) {
		return dao.findByLastNameStartingWith(letter);
	}
	public Customer findByFirstNameContaining(String word) {
	return dao.findByFirstNameContaining(word);
	}
	public Customer findBylastnameNot(String lastname) {
		return dao.findBylastNameNot(lastname);
	}

}
