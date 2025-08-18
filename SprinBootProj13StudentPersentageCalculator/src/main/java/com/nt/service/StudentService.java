package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.dao.IStudentDao;
import com.nt.model.Student;
@Service("stuService")
public class StudentService implements IStudentService{
	@Autowired
	@Qualifier("eFactory")
	private IStudentDao dao;

	@Override
	public String getStudentInsertInfo(Student stu) throws Exception {
		int count=dao.insertStudentInfo(stu);
		
		try {
			String msg=count==0?"Student Data Is Not Inserted!!!":"Student Data Is Inserted Successfully...";
			return msg;
		}
		catch(Exception e) {
			throw e;
		}
		
	}

	@Override
	public List<Student> getStudentInfo(String branch) throws Exception {
		try {
			List<Student> list=dao.getStudentInfo(branch);
			return list;
		}
		catch(Exception e) {
			throw e;
		}
		
	}
	

}
