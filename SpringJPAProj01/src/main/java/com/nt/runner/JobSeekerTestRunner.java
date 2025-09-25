package com.nt.runner;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.JobSeeker;
import com.nt.service.IJobSeekerMangService;
@Component
public class JobSeekerTestRunner implements CommandLineRunner {
	@Autowired
	private IJobSeekerMangService jsService; 
	@Override
	public void run(String... args) throws Exception {
		try {
		JobSeeker js=new JobSeeker("Shiva", "Hyd", "ME", 9874325.54F);
		String msg=jsService.registerJobSeeker(js);
		System.out.println(msg);
	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
//		try {
//			System.out.println("The JobSeeker Count is:"+jsService.checkAvalilabilityCountById(1));
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
		
//		try {
//			boolean flag=jsService.checkJobSeekerAvailability(111);
//			if(flag) {
//				System.out.println("THe JobSeeker Is Available");
//			}
//			else {
//				System.out.println("THe JobSeeker IS Not Found by this Id");
//			}
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
//		
//		try {
//			Iterable<JobSeeker> js=jsService.showAllJobSeeker();
//			js.forEach(j->{
//				System.out.println(j);
//			});
//			System.out.println("=============");
//			js.forEach(System.out::println);
//			
//			System.out.println("============");
//			for(JobSeeker j:js) {
//				System.out.println(j);
//			}
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			jsService.showAllJobSeekersByIds(List.of(1,2,3,4,5,52)).forEach(System.out::println);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			
//			JobSeeker js=jsService.showJobSeekerById(1);
//			System.out.println(js);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			String msg=jsService.updateOrUpdate(new JobSeeker(101,"Swami","Hyderabad","MTEC",1234.5f));
//		System.out.println(msg);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
		
//		try {
//			String msg=jsService.removeJobSeeker(new JobSeeker(106, "Swami", "PuNA","MTEC", 12345.3434f));
//			System.out.println(msg);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			String msg=jsService.removeJobSeekerByIds(List.of(1,2,107,108));
//			System.out.println(msg);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			String msg=jsService.removeAllJobSeekers();
//			System.out.println(msg);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
	}
}
