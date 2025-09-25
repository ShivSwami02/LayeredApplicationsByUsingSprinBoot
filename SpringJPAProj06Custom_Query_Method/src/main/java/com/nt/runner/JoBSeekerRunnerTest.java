package com.nt.runner;

import java.util.Arrays;
import java.util.Optional;

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
//			System.out.println("======Select Entity Query=========");
//			jsRepo.searchJobSeekersByRangBetSal(200000, 400000).forEach(System.out::println);
//		
//			System.out.println("=======Scalar Query with (sepecific multiple Col Values)");
//			jsRepo.serachJobSeekerRangeBetSal(200000, 400000).forEach(emp->System.out.println(Arrays.toString(emp)));
//			
//			System.out.println("======Scalar Ouery Operation With Single Col Values========");
//			jsRepo.searchJobSeekerNameBySalaRange(200000, 400000).forEach(System.out::println);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			Optional<JobSeeker> opt1=jsRepo.displayJobSeeker(200000, 400000);
//			if(opt1.isEmpty()) {
//				System.out.println("No Records Are Found");
//			}
//			else {
//				opt1.get();
//			}
//			
//			Optional<Object[]> list=(Optional<Object[]>)jsRepo.displayJobSeekerData(200000, 400000);
//			if(list.isEmpty()) {
//				System.out.println("No Records Are Found...");
//			}
//			else {
//				System.out.println(Arrays.deepToString(list.get()));
//			}
//			
//			Optional<String> opt2=jsRepo.displayJobSeekerName(200000, 400000);
//		   if(opt2.isEmpty()) {
//			   System.out.println("No Records Are Found");
//		   }
//		   else {
//			   System.out.println("Tha data:"+opt2.get());
//		   }
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
		
//		try {
//			int count=jsRepo.fetchJobSeekerCountInDB();
//			System.out.println("In The DB The Number of JobSeeker Are:"+count);
//			
//			System.out.println("======grting the Aggregate Data from THe DB======");
//			Object[] obj1=(Object[])jsRepo.fetchJobSeekerAggregateData();
//			System.out.println(Arrays.toString(obj1));
//			System.out.println("THe Number Of Records Are:"+obj1[0]);
//			System.out.println("THe Minimum Expected Salary:"+obj1[1]);
//			System.out.println("THe Maximum Expected Salary:"+obj1[2]);
//			System.out.println("THe Sum Of The Expected Salary:"+obj1[3]);
//			System.out.println("THe Avarage Of Expected Salary:"+obj1[4]);
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			System.out.println("===========Modifying The JobSeeker Data=============");
			int count=jsRepo.hikeExpectedSalaryOfJobSeeker("Rahul Sharma", 10);
		    if(count==0) {
		    	System.out.println("The JobSeeker is not found");
		    }
		    else {
		    	
		    	System.out.println("Expected Salary Is Updated Successfully And Count:"+count);
		    }
		    
		    System.out.println("=======THe Deleting the JobSeeker By Name====== ");
		    int count1=jsRepo.deleteJobSeekerDatabyName("Naveen Reddy");
		    if(count1==0) {
		    	System.out.println("Not Found JobSeeker Not Deleted in DB");
		    }
		    else {
		    	System.out.println("The JobSeeker Is Deleted Successfully");
		    }
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
	}
}
