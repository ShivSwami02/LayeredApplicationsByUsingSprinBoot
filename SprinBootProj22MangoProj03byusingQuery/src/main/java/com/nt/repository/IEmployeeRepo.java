package com.nt.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.nt.model.Employee;

public interface IEmployeeRepo extends MongoRepository<Employee, String> {
	
	@Query(fields = "{ename:1,eadd:1,salary:1}",value = "{eadd:?0}")
	public List<Object[]> getEmployeeByAddress(String add);
	
	@Query(value = "{eadd:?0}")
	public List<Employee> getEmployeeAllDataByAddress(String add);

	@Query(value ="{ename:?1,eadd:?0}")
	public List<Employee> fetEmployeeByAddAndName(String add,String name);

	@Query(value = "{$and:[salary:{$gte:?0 , $lte:?1}]}")
	
	public List<Employee> getAllEmployeeDataBySalaryRanges(double startSal,double endSal);

	@Query(value = "{$or:[{eadd:?0},{eadd:?1}]}")
	public List<Employee> getEmployeeDataByAddress(String add1,String add2);
}
