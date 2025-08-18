package com.nt.service;

import java.util.List;

import com.nt.document.Employee;

public interface IEmployeeService {
	public String setEmployee(Employee e)throws Exception ;
	
	public List<Employee> fetchAllEmployee()throws Exception;
	
	public String registerMultipleRegister(List<Employee> list);
	
	public String getEmployeeById(String id);
}
