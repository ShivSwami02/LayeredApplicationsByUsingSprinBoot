package com.nt.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.Employee;
import com.nt.repository.IEmployeeRepo;
@Service("service")
public class EmployeeServiceManag implements IEmployeeService {
	@Autowired
	private IEmployeeRepo repo;
	@Override
	public String setEmployee(Employee e) throws Exception{
		
		return "MongoDB Doc Is Saved with ID value :"+repo.insert(e).getId();
	}
	@Override
	public List<Employee> fetchAllEmployee() throws Exception {
		
		return repo.findAll();
	}
	@Override
	public String registerMultipleRegister(List<Employee> list) {
		List<Employee> saveAll=repo.saveAll(list);
		List<String> ids=saveAll.stream().map(Employee::getId).collect(Collectors.toList());
		return "Multiple String Ids:"+ids;
	}
	@Override
	public String getEmployeeById(String id) {
		Optional<Employee> emp=repo.findById(id);
		if(emp.isEmpty()) {
			return "The Id Data Is Not Avalable in List";
		}
		else {
			return emp.get().toString();
		}
		
	}
	@Override
	public String modifyEmployeeById(String id, double newsal) {
		Optional<Employee> emp=repo.findById(id);
		if(emp.isEmpty()) {
			return "Document Is Not Found";
		}
		else {
			Employee emp1=emp.get();
			emp1.setSalary(newsal);
			repo.save(emp1);
			return "Document Found and Upadated Successfully";
		}
		
	}
	

}
