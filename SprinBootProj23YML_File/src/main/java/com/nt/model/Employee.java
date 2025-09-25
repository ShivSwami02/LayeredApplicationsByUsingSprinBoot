package com.nt.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "emp.info")
@Component("emp")
public class Employee {
	private int eno;
	private String ename;
	
	private String eadd;
	
	private double esal;
	
	private String desg;

}
