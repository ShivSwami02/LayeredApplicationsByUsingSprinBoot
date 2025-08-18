package com.nt.service;

import java.util.List;

import com.nt.model.TuristPlaceInfo;

public interface ITouristPlaceInfoService {
	public List<TuristPlaceInfo> getTuristPlaceInformationByLocation(String loc1,String loc2,String loc3)throws Exception;
	
	public String getTuristPlaceInsertInfo(TuristPlaceInfo tp)throws Exception;
}
