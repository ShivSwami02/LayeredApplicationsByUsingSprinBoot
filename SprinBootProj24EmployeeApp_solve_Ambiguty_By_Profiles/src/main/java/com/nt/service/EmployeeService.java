package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empService")
public class EmployeeService implements IEmployeeService{
	@Autowired
	private IEmployeeDAO dao;

	@Override
	public List<Employee> fetchAllEmployeeByDesg(String desg1, String desg2, String desg3) throws Exception {
		 desg1=desg1.toUpperCase();
		desg2=desg2.toUpperCase();
		 desg3=desg3.toUpperCase();
		
		List<Employee> list=dao.getEmployeeDatailsByDesg(desg1, desg2, desg3);
		//sort the object in List Collection
		//list.sort((t1,t2)->t1.getEid().compareTo(t2.getEid()));
		
		//calculating gross salary and net salary
		list.forEach(emp->{
		emp.setGrossSalary(emp.getSalary()+(emp.getSalary()*0.5));
		emp.setNetSalary(emp.getGrossSalary()-(emp.getGrossSalary()*0.2));		
		});		
		return list;
	}

	@Override
	public String getInsertInfo(Employee e) throws Exception {
		int count=0;
	 try{
		 count=dao.InsertEmployee(e);
	 }catch(Exception ex) {
		 ex.printStackTrace();
		 throw ex;
	 }
		return count==0?"The Employee Data Is Not Inserted":"The EmployeeData Is Inserted";
	}

}
