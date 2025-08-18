package com.nt.dao;

import java.util.List;

import com.nt.model.TuristPlaceInfo;

public interface ITouristPlaceDAO {
	public List<TuristPlaceInfo> getTouristPlaceInformationByLocation(String loc1,String loc2,String loc3)throws Exception;
	
	public int setTuristPlaceInfo(TuristPlaceInfo info)throws Exception;

}
