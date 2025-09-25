package com.nt.runner;



import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repository.IJobSeekerRepository;


@Component("testRunner")
public class JoBSeekerRunnerTest implements CommandLineRunner{

	@Autowired
	private IJobSeekerRepository jsRepo;
	@Override
	public void run(String... args) throws Exception {

		System.out.println("====Insertion Operation Doing By using NativeSQL====");
		int count=jsRepo.insertJobSeeker("Mangesh", "PUne", "ME", 324567.0);
		if(count==0) {
			System.out.println("JobSeeker Is Not registered");
		}
		else {
			System.out.println("JobSeeker Is Inserted Successfully....");
		}
		
		System.out.println("========Geting The System Date =========");
		System.out.println("The System Date Is:"+jsRepo.showSystemDate());
		
		System.out.println("========Creating the Table Temp In DB=======");
		int count1=jsRepo.createTempTable();
		if(count==0) {
			System.out.println("Table Is Not Created..");
		}
		else {
			System.out.println("Table Is Created Successfully count:"+count);
		}
		
	
	}
}
