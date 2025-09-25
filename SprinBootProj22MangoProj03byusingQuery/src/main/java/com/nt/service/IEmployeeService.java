package com.nt.service;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeService {
     public List<Object[]> showEmpDataByAddress(String address);

     public List<Employee> showAllInfoEmployeebyAdd(String add);

     public List<Employee> shoeAllEmploeeDataByUsingAddressAndName(String add,String name);

     public List<Employee> shoeallEmployeedataBySalaryRanges(double startsal,double endsal);

     public List<Employee> showallEmployeeDataAddress(String add1,String add2);
     
     
}
