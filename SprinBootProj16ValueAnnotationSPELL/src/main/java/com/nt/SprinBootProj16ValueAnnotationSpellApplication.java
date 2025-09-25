package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Hotel;

@SpringBootApplication
public class SprinBootProj16ValueAnnotationSpellApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx=SpringApplication.run(SprinBootProj16ValueAnnotationSpellApplication.class, args);
	Hotel h1=ctx.getBean("hotel1",Hotel.class);
	System.out.println(h1);
	
	}

}
