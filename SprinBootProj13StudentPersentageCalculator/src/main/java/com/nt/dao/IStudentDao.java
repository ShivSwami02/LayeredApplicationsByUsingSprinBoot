package com.nt.dao;

import java.util.List;

import com.nt.model.Student;

public interface IStudentDao {
	public int insertStudentInfo(Student s)throws Exception;
	
	public List<Student>getStudentInfo(String branch)throws Exception;
}
