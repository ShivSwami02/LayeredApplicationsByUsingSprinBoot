package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.Employee;
@Component
public class EmployeeTest implements CommandLineRunner{
    @Autowired
	private Employee emp;
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(emp);
		
	}

}
