package com.nt.runners;

import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.nt.entity.JobSeeker;
import com.nt.service.IJobSeekerService;

public class testrunner implements CommandLineRunner {
	@Autowired
	private IJobSeekerService service;
	@Override
	public void run(String... args) throws Exception {
		List<JobSeeker> list=service.findJobSeekerById();
		list.forEach(System.out::println);
		System.out.println("ENter any key to stop:");
		
		try (InputStream in = System.in) {
			in.read();
		};
	}
   
}
