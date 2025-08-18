package com.nt.DAO;

import java.util.List;

import com.nt.model.HospitalDetails;

public interface IHospitalDetailsDAO  {
	
	public List<HospitalDetails> getHospitalDetailsByLocation(String loc1,String loc2,String loc3)throws Exception;
	
	//inserting the hospital information
	public int InsertHospitalInformation(HospitalDetails hd)throws Exception;
}
