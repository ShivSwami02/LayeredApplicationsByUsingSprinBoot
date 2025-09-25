package com.nt;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.controller.HospitalDetailsController;
import com.nt.model.HospitalDetails;

@SpringBootApplication
public class SprinBootProj11LayerApp02Application {

	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext ctx=SpringApplication.run(SprinBootProj11LayerApp02Application.class, args);
				Scanner sc=new Scanner(System.in);){
			HospitalDetailsController controller=ctx.getBean("hsController",HospitalDetailsController.class);
        Environment env=ctx.getEnvironment();
			System.out.println("Active Profile Is:"+Arrays.toString(env.getActiveProfiles()));
		System.out.println("=======for Insertion========");
		System.out.println("Enter the HospitalDetails:");
		System.out.println("Enter the hospital Name:");
		String hname=sc.next();
		System.out.println("Enter the hospital Location");
		String hloc=sc.next();
		System.out.println("Enter the hospital number");
		String hnum=sc.next();
		System.out.println("Enter the hospital email:");
		String hemail=sc.next();
		
		try{
			HospitalDetails hd1=new HospitalDetails(hname, hloc, hnum, hemail);
		String msg=controller.grtInsertionInfo(hd1);
		System.out.println(msg);
		}
		catch(Exception e) {
			System.out.println("Internal Error!!!!");
			e.printStackTrace();
		}
		
		 System.out.println("========For Retrival=========");
			System.out.println("Enter the location1::");
			String loc1=sc.next();
			System.out.println("Enter the location2::");
			String loc2=sc.next();
			System.out.println("Enter the location3::");
			String loc3=sc.next();
			
			try {
				List<HospitalDetails>list=controller.getHospitalDetailsByLocation(loc1, loc2, loc3);
				list.forEach(hos->{
					System.out.println(hos);
				});
			}
			catch(Exception e) {
				System.out.println("Internal Error Plese try Some time:");
				e.printStackTrace();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
