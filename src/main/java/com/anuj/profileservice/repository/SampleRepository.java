package com.anuj.profileservice.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.anuj.profileservice.model.Employee;

@Repository
public class SampleRepository {

	public List<Employee> getEmployees() {

		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(101, "Anuj", "Indore"));

		empList.add(new Employee(101, "Ram", "Bhopal"));

		empList.add(new Employee(101, "Shyam", "Raisen"));
		return empList;
	}

	
	
}
