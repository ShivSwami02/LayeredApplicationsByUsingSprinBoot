package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.StudentInfo;

@SpringBootApplication
public class SprinBootProj17BulkInjectionByUsingConfigurationPropertiesApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx=SpringApplication.run(SprinBootProj17BulkInjectionByUsingConfigurationPropertiesApplication.class, args);
	StudentInfo student=ctx.getBean("studentInfo",StudentInfo.class);
	System.out.println(student);
	}

}
