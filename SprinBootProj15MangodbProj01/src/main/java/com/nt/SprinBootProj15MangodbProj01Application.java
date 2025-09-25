package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.document.Employee;
import com.nt.service.EmployeeServiceManag;

@SpringBootApplication
public class SprinBootProj15MangodbProj01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SprinBootProj15MangodbProj01Application.class, args);
	Scanner sc=new Scanner(System.in);
	     EmployeeServiceManag service=ctx.getBean("service",EmployeeServiceManag.class);
	    Employee e=new Employee();
	    e.setEname("Swami");
	    e.setEno(11111);
	    e.setEadd("Hyd");
	    e.setSalary(12221.9);
	    
	     String msg;
		try {
			msg = service.setEmployee(e);
			 System.out.println(msg);
			 
			 System.out.println("Retriving all Employee Data::");
			 service.fetchAllEmployee().forEach(System.out::println);
			 
			 System.out.println("Inserting The Multiple mployee Date At A TIme:");
			 Employee e2=new Employee();
			 e2.setEadd("Pune");
			 e2.setEname("Radha");
			 List<Employee> emplist=List.of(e,e2);
			 String ms1=service.registerMultipleRegister(emplist);
			 System.out.println(ms1);
			 
			 System.out.println("Enter The Id To Get THe Employee Data:");
			 String id=sc.next();
			 String Emp=service.getEmployeeById(id);
			 System.out.println(Emp);
			 
			 
			 System.out.println("Enter The Name To Get THe Employee Data:");
			 String name=sc.next();
			 String Employee=service.getEmployeeById(name);
			 System.out.println(Employee);
		
			 System.out.println("Enter Employee id ToUpdate::");
			 String id1=sc.next();
			String msg1=service.modifyEmployeeById(id1, 123456D);
			 System.out.println(msg1);
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
	    
	}

}
