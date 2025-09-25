package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;
@Repository("empMySqlDAO")
@Profile({"test","dev"})
public class EmployeeMySqlDAO implements IEmployeeDAO{
	@Autowired
     private DataSource ds;
	
	
	
      public  EmployeeMySqlDAO() {
		super();
		System.out.println("EmployeeMySqlDAO::0-Param Constructor");
	}
	public final static String GET_EMPS_QUERY="SELECT EMPNO,EMPNAME,JOB,SAL,DEPTNO FROM EMP WHERE UPPER(JOB) IN(?,?,?)ORDER BY JOB";
	public final static String Emp_Insert="INSERT INTO EMP(EMPNAME, JOB, SAL) VALUES( ?, ?, ?)";
	@Override
	public List<Employee> getEmployeeDatailsByDesg(String desg1, String desg2, String desg3)throws Exception {
        System.out.println("Class Name Of DataSource:"+ds.getClass());		

		List<Employee> list=null;
		//creating the connection by using the data source
		try(Connection con=ds.getConnection();//gives the connection pooled object
				PreparedStatement ps=con.prepareStatement(GET_EMPS_QUERY);
				){
			//set the values to query param
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			
			//Executing The Query
			try(ResultSet rs=ps.executeQuery();){
				list=new ArrayList<Employee>();
				//copy each record of ResultSet Object to model class object
				while(rs.next()) {
					Employee emp=new Employee();
					emp.setEid(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setDesg(rs.getString(3));
					emp.setSalary(rs.getFloat(4));
					
					//add each model class object to rs
					list.add(emp);
				}
			}//inner try
		}//outer try
		catch(SQLException se) {
			se.printStackTrace();
			throw se;     //exception rethrowing for exception propagation
		}
		catch(Exception e) {
			throw e;     //exception rethrowing for exception propagation 	
		}
		return list;
	}//method
	@Override
	public int InsertEmployee(Employee e) throws Exception {
		int count=0;
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(Emp_Insert);){
			ps.setString(1, e.getEname());
			ps.setString(2, e.getDesg());
			ps.setDouble(3, e.getSalary());
			count=ps.executeUpdate();
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}
		return count;
	}

}//class
