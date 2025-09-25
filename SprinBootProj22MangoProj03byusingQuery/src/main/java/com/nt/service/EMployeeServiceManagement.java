package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.repository.IEmployeeRepo;
@Service("service")
public class EMployeeServiceManagement implements IEmployeeService {
	@Autowired
	private IEmployeeRepo repo;
	@Override
	public List<Object[]> showEmpDataByAddress(String address) {
		
		return repo.getEmployeeByAddress(address);
	}
	@Override
	public List<Employee> showAllInfoEmployeebyAdd(String add) {
		return repo.getEmployeeAllDataByAddress(add);
	}
	@Override
	public List<Employee> shoeAllEmploeeDataByUsingAddressAndName(String add, String name) {
		
		return repo.fetEmployeeByAddAndName(add, name);
	}
	@Override
	public List<Employee> shoeallEmployeedataBySalaryRanges(double startsal, double endsal) {
		
		return repo.getAllEmployeeDataBySalaryRanges(startsal, endsal);
	}
	@Override
	public List<Employee> showallEmployeeDataAddress(String add1,String add2) {
		
		return repo.getEmployeeDataByAddress(add1, add2);
	}

}
