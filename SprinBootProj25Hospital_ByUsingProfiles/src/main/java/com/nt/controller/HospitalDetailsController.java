package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.HospitalDetails;
import com.nt.service.IHospitalDatailsService;

@Controller("hsController")
public class HospitalDetailsController {

	@Autowired
	private IHospitalDatailsService service;
	
	public List<HospitalDetails> getHospitalDetailsByLocation(String loc1,String loc2,String loc3)throws Exception{
		List<HospitalDetails> list=null;
		System.out.println("HospitalDetailsController.getHospitalDetailsByLocation()");
		
		try{
			 list=service.getHospitalDetailsByLocation(loc1, loc2, loc3);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		return list;
		
	}
	public String grtInsertionInfo(HospitalDetails hd) throws Exception {
		String msg=service.getInsertionInfo(hd);
		return msg;
	}
}
