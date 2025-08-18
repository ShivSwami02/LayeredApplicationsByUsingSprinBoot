package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Student;
import com.nt.service.IStudentService;

@Controller("stuController")
public class StudentController  {
	@Autowired
	private IStudentService service;

	public String insertStudentInformation(Student stu)throws Exception{
		try {
			String msg=service.getStudentInsertInfo(stu);
			return msg;
		}
		catch(Exception e) {
			throw e;
		}

	}
	public List<Student> getStudentDATA(String branch)throws Exception{
		try {
			List<Student> list=service.getStudentInfo(branch);
			return list;
		}
		catch(Exception e) {
			throw e;
		}
	}
}
