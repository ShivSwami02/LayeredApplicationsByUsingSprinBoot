package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.EmployeeController;
import com.nt.model.Employee;

@SpringBootApplication
public class SprinBootProj10LayerApp01Application {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx=SpringApplication.run(SprinBootProj10LayerApp01Application.class, args);){
			EmployeeController controller=ctx.getBean("empController",EmployeeController.class);

			Scanner sc=new Scanner(System.in);
			System.out.println("===============Inserting the Data================");
			System.out.println("Enter the name:");
			String ename=sc.next();
			System.out.println("Enter the Desg:");
			String desg=sc.next();
			System.out.println("Enter the Salary:");
			double sal=sc.nextDouble();
			try{
				Employee emp1=new Employee(ename,desg,sal);
			
			String msg=controller.InsertEmoloyeeInfo(emp1);
			System.out.println("Result is:"+msg);
			}catch(Exception e) {
				System.out.println("Internal Error try again:");
				e.printStackTrace();
			}
			System.out.println("======================Reading the info===================");
			System.out.println("Enter the desg1:");
			String desg1=sc.next();
			System.out.println("Enter the desg2:");
			String desg2=sc.next();
			System.out.println("Enter the desg3:");
			String desg3=sc.next();
			
			//EmployeeController controller1=ctx.getBean("empController",EmployeeController.class);
			List<Employee>list=controller.getEmployeeByDesg(desg1, desg2, desg3);
			list.forEach(emp->{
				System.out.println(emp);
			});
			
		}
		catch(Exception e) {
			System.out.println("Internal ERROR Plese Try Again:");
			e.printStackTrace();
		}
		
	}

}
