package com.anuj.profileservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anuj.profileservice.model.Employee;
import com.anuj.profileservice.repository.SampleRepository;

@Service
public class SampleSeviceImpl implements SampleSevice{

	@Autowired
	private SampleRepository sampleRepository;
	
	
	@Override
	public List<Employee> getEmployees() {
		
		List<Employee> emp = sampleRepository.getEmployees();
		return emp;
	}

}
