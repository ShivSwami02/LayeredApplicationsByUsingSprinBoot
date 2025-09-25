package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.EmployeeData;

@SpringBootApplication
public class SprinBootProj19BulkInjectionUsingConfigurationProperties2Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx=SpringApplication.run(SprinBootProj19BulkInjectionUsingConfigurationProperties2Application.class, args);
	EmployeeData emp=ctx.getBean("employee",EmployeeData.class);
	System.out.println(emp);
	}

}
