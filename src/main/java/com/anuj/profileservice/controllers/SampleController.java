package com.anuj.profileservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anuj.profileservice.model.Employee;
import com.anuj.profileservice.service.SampleSevice;

@RestController
public class SampleController {

	@Autowired
	private SampleSevice sampleSevice;
	
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public List<Employee> getEmployees(){
		
		List<Employee> emp = sampleSevice.getEmployees();
		
		return emp;
	}
	
}
