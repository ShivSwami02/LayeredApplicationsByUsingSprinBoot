package com.nt.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nt.dao.StudentDao;
import com.nt.dao.StudentMySqlDao;
import com.nt.service.IStudentService;

@Component("eFactory")
public class Factory implements FactoryBean<IStudentService> {
	@Value("${database.name}")
	private String database;
	@Autowired
	StudentDao oracle1;
	@Autowired
	StudentMySqlDao mysql;

	@Override
	public IStudentService getObject() throws Exception {
		switch(database) {
		case "oracle":
			return (IStudentService) oracle1;
		case "mysql":
			return (IStudentService) mysql;
		default:throw new IllegalArgumentException("Invalid Choice!!!");
		
		}
		
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return IStudentService.class;
	}

}
