package com.nt.service;

import java.util.List;

import com.nt.model.HospitalDetails;

public interface IHospitalDatailsService {
	
	public List<HospitalDetails> getHospitalDetailsByLocation(String loc1,String loc2,String loc3)throws Exception;
	
	public String getInsertionInfo(HospitalDetails hd)throws Exception;

}
