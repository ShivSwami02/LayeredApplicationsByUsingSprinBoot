package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.controller.TuristPlaceController;
import com.nt.model.TuristPlaceInfo;

@SpringBootApplication
public class SprinBootProj11LayerApp03TouristPlaceApplication {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext ctx=SpringApplication.run(SprinBootProj11LayerApp03TouristPlaceApplication.class, args);
				Scanner sc=new Scanner(System.in);){
			TuristPlaceController controller=ctx.getBean("tpController",TuristPlaceController.class);
			System.out.println("Insert Turist place Info for Registration:");
			System.out.println("Enter the turist place Name:");
			String tpName=sc.next();
			System.out.println("Enter the tusrist place Location:");
			String tpLocation=sc.next();
			System.out.println("Enter the turist place number:");
			String tpnum=sc.next();
			System.out.println("Enter the turist place site:");
			String tpSite=sc.next();
			try {
			TuristPlaceInfo tpInfo=new TuristPlaceInfo(tpName, tpLocation, tpnum, tpSite);
			
			String msg=controller.getInsertionInfo(tpInfo);
			System.out.println(msg);
			}
			catch(Exception e) {
				System.out.println("Internal Error:");
				e.printStackTrace();
			}
			
			
			System.out.println("===========Viewing Only===========");
			System.out.println("Enter the Loaction1:");
			String loc1=sc.next();
			System.out.println("Enter the Loaction2:");
			String loc2=sc.next();
			System.out.println("Enter the Loaction3:");
			String loc3=sc.next();
			try {
				List<TuristPlaceInfo>list=controller.getTuristPlaceInfoByLocaions(loc1, loc2, loc3);
				list.forEach(place->{
					System.out.println(place);
				});
			}catch(Exception e) {
				System.out.println("Internal problem:");
				e.printStackTrace();
			}			
		}
		catch(Exception e) {
			System.out.println("Internal Problem:");
			e.printStackTrace();
		}
		
	}

}
