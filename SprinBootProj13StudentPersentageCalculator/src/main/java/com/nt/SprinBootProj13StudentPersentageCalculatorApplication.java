package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.StudentController;
import com.nt.model.Student;

@SpringBootApplication
public class SprinBootProj13StudentPersentageCalculatorApplication {

	public static void main(String[] args) {
	try(ConfigurableApplicationContext ctx=SpringApplication.run(SprinBootProj13StudentPersentageCalculatorApplication.class, args);
			Scanner sc=new Scanner(System.in);){
	    StudentController controller=ctx.getBean("stuController",StudentController.class);

		System.out.println("Enter the Student no::");
		int sno=sc.nextInt();
	    System.out.println("Enter the Student Name::");
	    String sname=sc.next();
	    
	    System.out.println("Enter the Sudent Branch::");
	    String sbranch=sc.next();
	    System.out.println("ENter the Subject1 Marks::");
	    double sub1=sc.nextDouble();
	    System.out.println("Enter the Subject2 Marks::");
	    double sub2=sc.nextDouble();
	    System.out.println("ENter the Subject3 Marks::");
	    double sub3=sc.nextDouble();
	    System.out.println("ENter the Subject4 Marks::");
	    double sub4=sc.nextDouble();
	    System.out.println("ENter the Subject5 Marks::");
	    double sub5=sc.nextDouble();
	    
	    double persentage=(sub1+sub2+sub3+sub4+sub5)/5;
	    
	    Student student=new Student(sno, sname, sbranch, persentage, sub1, sub2, sub3, sub4, sub5);
		
	    String msg=controller.insertStudentInformation(student);
	    System.out.println(msg);
	    
	    System.out.println("===============================");
	    System.out.println("Enter the brach for geting all Student of That branch:");
	    String branch=sc.next();
	    List<Student> stu=controller.getStudentDATA(branch);
	    stu.forEach(stu1->
	          System.out.println(stu1)
	    		);
	}
	catch(Exception e) {
		System.out.println("Internal Problem Try After Some Time!!!!");
	}
	}

}
