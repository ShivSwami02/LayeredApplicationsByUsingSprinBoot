package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.dao.ITouristPlaceDAO;
import com.nt.model.TuristPlaceInfo;

@Service("tpService")
public class TuristPlaceInfoService implements ITouristPlaceInfoService{
	@Autowired
	@Qualifier("repository")
	private ITouristPlaceDAO dao;

	@Override
	public List<TuristPlaceInfo> getTuristPlaceInformationByLocation(String loc1, String loc2, String loc3)
			throws Exception {
		loc1=loc1.toUpperCase();
		loc2=loc2.toUpperCase();
		loc3.toUpperCase();
		
		try{
			List<TuristPlaceInfo> list=dao.getTouristPlaceInformationByLocation(loc1, loc2, loc3);
			return list;
		}
		catch(Exception e) {
			throw e;
		}
		
	}//method

	@Override
	public String getTuristPlaceInsertInfo(TuristPlaceInfo tp) throws Exception {
		String msg=null;
		try {
			int count=dao.setTuristPlaceInfo(tp);
			
			msg=count==0?"Not Inserted!!!":"Inserted Successfully...";
		}
		catch(Exception e) {
			throw e;
		}
		return msg;
	}

}//class
