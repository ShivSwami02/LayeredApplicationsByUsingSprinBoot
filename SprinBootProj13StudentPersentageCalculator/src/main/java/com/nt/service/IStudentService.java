package com.nt.service;

import java.util.List;

import com.nt.model.Student;

public interface IStudentService {
	
	public String getStudentInsertInfo(Student stu)throws Exception;

	public List<Student> getStudentInfo(String branch)throws Exception;

}
