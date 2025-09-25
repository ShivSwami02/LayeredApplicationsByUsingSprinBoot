package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.nt.model.Employee;

@SpringBootApplication
@EnableConfigurationProperties(Employee.class)
public class SprinBootProj23YmlFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprinBootProj23YmlFileApplication.class, args);
	}

}
