package com.jobiak.bootimd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jobiak.bootimd.model.Customer;
import com.jobiak.bootimd.repository.CustomerRepo;
@Controller
public class CustomerController {
	@Autowired
	CustomerRepo repo;
	
	public CustomerController() {
		
	}

	public CustomerController(CustomerRepo repo) {
		this.repo = repo;
	}
	
	@RequestMapping(path="/login",method=RequestMethod.GET)
	public String redirect() {
		
		return "customersignup";
	}
	
	@RequestMapping(path="/customersignup",method=RequestMethod.POST)
	public String doBank(@ModelAttribute("cust")Customer cust) {
		repo.save(cust);
		return "customerdetails";
	}
}
