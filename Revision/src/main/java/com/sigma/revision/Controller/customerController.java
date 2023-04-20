package com.sigma.revision.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sigma.revision.model.Customer;
import com.sigma.revision.service.customerService;

@RestController
public class customerController {
	@Autowired
	private customerService srvc;

	@GetMapping("/customer")
	public List<Customer>  getAllcustomer(){
		return srvc.getAllcustomer();
	}
	@GetMapping("/customer/{id}")
	public Optional<Customer> getCustomer(@PathVariable Integer id) {
		return srvc.getCustomer(id);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteCustomer(@PathVariable Integer id) {
		srvc.deleteCustomer(id);
	}
	@PostMapping("/save")
	public Customer saveCustomer(@RequestBody Customer cus) {
		return srvc.saveCustomer(cus);
	}
	@PostMapping("/saveAll")
	public List<Customer> saveAllCustomer(List<Customer> cus){
		return srvc.saveAllCustomer(cus);
	}
	@PutMapping("update/{id}")
	public Customer updateCustomerById(@RequestBody Customer cus,@PathVariable(name = "id") Integer id) {
		return srvc.updateCustomerById(cus, id);
	}
	@PutMapping("/update")
	public Customer updateStudent(@RequestBody Customer cus) {
		return srvc.updateStudent(cus);
	}
	@GetMapping("/byname/{name}")
	public Customer findByFistName(@PathVariable(name = "name") String firstname) {
		return srvc.findByFirstName(firstname);
	}
	@GetMapping("/byname&lastname/{name}/{lastname}")
	public Customer findByFisrtNameOrLastName(@PathVariable(name = "name") String firstName,@PathVariable(name = "lastname") String lastName) {
		return srvc.findByFirstNameOrLastName(firstName, lastName);
		
	}
	@GetMapping("/agelessthanorequal/{age}")
	public List<Customer> findByAgeLessThanOrEqual(@PathVariable(name = "age") Integer age) {
		return srvc.findByAgeLessThanOrEqual(age);
	}
	@GetMapping("/agelessgreatherorequal/{age}")
	public List<Customer> findByAgeGreaterThanOrEqual(@PathVariable(name = "age") Integer age) {
		return  srvc.findByAgeGreaterThanOrEqual(age);
	}
	@GetMapping("/namenotlike/{name}")
	public Customer findByNameNotLike(@PathVariable String name) {
		return srvc.findByNameNotLike(name);
	}
	@GetMapping("/namestartingwith/{letter}")
	public Customer findByNameStartingWith(@PathVariable(name = "letter") String letter) {
		return srvc.findByNameStartingWith(letter);
	}
	@GetMapping("/containing/{word}")
	public Customer findByFirstNameContaining(@PathVariable(name = "word") String word) {
	return srvc.findByFirstNameContaining(word);
	}
	@GetMapping("/lastnamenot/{lastname}")
	public Customer findBylastnameNot(@PathVariable(name = "lastname") String lastname) {
		return srvc.findBylastnameNot(lastname);
	}

}
