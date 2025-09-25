package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("studentInfo")
@Data
@ConfigurationProperties(prefix = "org.nit")
//S@PropertySource("student.properties")
public class StudentInfo {
	//@Value("${student.nt.name}")
	private String name;
	//@Value("${student.nt.add}")
	private String address;
	private Integer contact;
	private Integer pincode;
	
	

}
