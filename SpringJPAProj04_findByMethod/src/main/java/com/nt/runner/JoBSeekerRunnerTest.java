package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Entity.JobSeeker;
import com.nt.repository.IJobSeekerRepository;


@Component("testRunner")
public class JoBSeekerRunnerTest implements CommandLineRunner{

	@Autowired
	private IJobSeekerRepository jsRepo;
	@Override
	public void run(String... args) throws Exception {
//		try {
//			
//		jsRepo.findByNameEquals("Arjun Reddy").forEach(System.out::println);
//		
//		System.out.println("----------------------");
//		jsRepo.findByNameIs("Meena Joshi").forEach(System.out::println);
//		System.out.println("-------------------------");
//		jsRepo.findByname("Sandeep Kumar").forEach(System.out::println);
//		
//		System.out.println("====================================");
//		jsRepo.findByNameStartingWith("S").forEach(System.out::println);;
//		System.out.println("-----------------");
//		jsRepo.findByNameEndingWith("n").forEach(System.out::println);
//		System.out.println("------------");
//		jsRepo.findByNameContaining("Red").forEach(System.out::println);
//		System.out.println("-----------------------");
//		jsRepo.findByNameContainingIgnoreCase("Red").forEach(System.out::println);
//		System.out.println("----------------------");
//		jsRepo.findByNameStartingWithIgnoreCase("s");
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//	}

		
		
//		try {
//			jsRepo.findByadd("Pune").forEach(System.out::println);
//			System.out.println("----------------------");
//			jsRepo.findByAddEquals("Hyderabad").forEach(System.out::println);
//			System.out.println("------------------");
//			jsRepo.findByAddIs("Kolkata").forEach(System.out::println);
//			jsRepo.findByAddStartingWith("S").forEach(System.out::println);;
//		    System.out.println("------------------");
//		    jsRepo.findByAddEndingWith("e").forEach(System.out::println);;
//		    System.out.println("----------------");
//		    jsRepo.findByAddContaining("ra").forEach(System.out::println);;
//
//		}catch(Exception e) {
//		e.printStackTrace();
//		}
		
//		try {
//			jsRepo.findByexpectedSalaryBetween(200000, 6000000).forEach(System.out::println);;
//					}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
 
		
//		try {
//			//jsRepo.findByNameLikeIgnoreCase("m%").forEach(System.out::println);;
//			jsRepo.findByNameLikeIgnoreCase("%h").forEach(System.out::println);;
//				}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			jsRepo.findByQulyfyInOrderByQulyfyAsc(List.of("BE Computer","MBA Finance","MCA","B.Sc IT")).forEach(System.out::println);
//		
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			jsRepo.findByExpectedSalaryGreaterThanEqualAndExpectedSalaryLessThanEqual(200000,700000).forEach(System.out::println);;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
