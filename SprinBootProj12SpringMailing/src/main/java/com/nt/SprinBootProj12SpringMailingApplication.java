package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.service.IPurcheseOrder;
import com.nt.service.PurcheseOrderImpl;

@SpringBootApplication
public class SprinBootProj12SpringMailingApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx=SpringApplication.run(SprinBootProj12SpringMailingApplication.class, args);){
			
			IPurcheseOrder order=ctx.getBean("iPurchese",PurcheseOrderImpl.class);
			try {
				String message=order.purchese(new String[] {"Shirt","Trouser","Kurta"},
						new double[] {2345,4512,9999}, 
						new String[] {"shivswami869843@gmail.com","vibhutesiddhant195@gmail.com","harshadsonule0703@gmail.com","sukalepranav@gmail.com"});
			   
				System.out.println(message);
			}
			catch(Exception e) {
				System.out.println("Internal Problem Try Again");

				e.printStackTrace();
			}
			ctx.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
