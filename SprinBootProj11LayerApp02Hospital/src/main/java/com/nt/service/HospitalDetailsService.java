package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.DAO.IHospitalDetailsDAO;
import com.nt.model.HospitalDetails;

@Service("hosService")
public class HospitalDetailsService implements IHospitalDatailsService{
	@Autowired
	@Qualifier("hosMySqlDAO")
	private IHospitalDetailsDAO dao;

	@Override
	public List<HospitalDetails> getHospitalDetailsByLocation(String loc1, String loc2, String loc3) throws Exception {
		System.out.println("HospitalDetailsService.getHospitalDetailsByLocation()");
		 loc1=loc1.toUpperCase();
		loc2=loc2.toUpperCase();
		loc3=loc3.toUpperCase();
		
		try{List<HospitalDetails> list=dao.getHospitalDetailsByLocation(loc1, loc2, loc3);
		return list;
		}
		catch(Exception e) {
			throw e;
		}
	}//method

	@Override
	public String getInsertionInfo(HospitalDetails hd) throws Exception {
		int count=dao.InsertHospitalInformation(hd);
		String msg=count==0?"Hospital Data NOT Inserted!!!!!":"Hospital Data Inserted Successfully.....";
		return msg;
	}

}//class
