package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
//import com.nt.service.EmployeeService;
import com.nt.service.IEmployeeService;

@Controller("empController")
public class EmployeeController {
	@Autowired
	IEmployeeService service;
	
	public List<Employee> getEmployeeByDesg(String desg1,String desg2,String desg3)throws Exception{
		List<Employee>list=service.fetchAllEmployeeByDesg(desg1, desg2, desg3);
		return list;
	}
	public String InsertEmoloyeeInfo(Employee e) throws Exception {
		String msg=service.getInsertInfo(e);
		return msg;
	}

}
