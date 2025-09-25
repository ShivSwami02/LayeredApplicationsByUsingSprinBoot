package com.nt.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.nt.SprinBootProj22MangoProj03byusingQueryApplication;
import com.nt.service.IEmployeeService;

@Component
public class EmployeeTestRunner implements CommandLineRunner{

	@Autowired
	private IEmployeeService serive;

    
	@Override
	public void run(String... args) throws Exception {
		//serive.showEmpDataByAddress("Hyd").forEach(records->System.out.println(Arrays.toString(records)));
		//System.out.println("======================");
		//serive.showAllInfoEmployeebyAdd("Pune").forEach(System.out::println);
	//System.out.println("===============================");
		//serive.shoeAllEmploeeDataByUsingAddressAndName("Pune", "Shiva").forEach(System.out::println);;
	
	System.out.println("============================");
	serive.shoeallEmployeedataBySalaryRanges(40000,50000).forEach(System.out::println);
	System.out.println("==========================");
	serive.showallEmployeeDataAddress("Pune", "Hyd").forEach(System.out::println);;
	
	}
	

}
