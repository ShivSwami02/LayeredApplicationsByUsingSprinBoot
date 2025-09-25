package com.nt.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection ="employee")
@Data
public class Employee {
	@Id
	private String eno;
	
	private String ename;
	
	private String eadd;
	
	private double salary;
	
	private String contact;
}
