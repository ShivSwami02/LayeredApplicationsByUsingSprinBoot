package com.nt.factory;

import javax.sql.DataSource;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.nt.dao.ITouristPlaceDAO;
import com.nt.dao.TuristPlaceInfoMySqlDAO;
import com.nt.dao.TuristPlaceInfoOraDAO;
@Component("repository")
public class TPFactory implements FactoryBean<ITouristPlaceDAO> {
	ITouristPlaceDAO dao=null;
	//@Qualifier("oracleDao")
	@Autowired
	TuristPlaceInfoOraDAO oracle;
	
	@Autowired
	//@Qualifier("mySqlDAO")
	TuristPlaceInfoMySqlDAO mysql;
	
	
	@Value("${database.name}")
	private String database;
	

	@Override
	public ITouristPlaceDAO getObject() throws Exception {
		
		switch(database) {
		case "mysql":
			dao=mysql;
			break;
		case "oracle":
			dao=oracle;
			break;
			default:
				new IllegalArgumentException("Invalid Datasource ID!!!");
		}
		return dao;
		
	}


	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return ITouristPlaceDAO.class;
	}

}
