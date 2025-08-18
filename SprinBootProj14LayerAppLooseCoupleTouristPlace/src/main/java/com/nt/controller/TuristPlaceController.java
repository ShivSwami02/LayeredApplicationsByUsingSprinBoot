package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.TuristPlaceInfo;
import com.nt.service.ITouristPlaceInfoService;

@Controller("tpController")
public class TuristPlaceController {
	@Autowired
	ITouristPlaceInfoService service;
	
	public List<TuristPlaceInfo> getTuristPlaceInfoByLocaions(String loc1,String loc2,String loc3)throws Exception{
		try {
			List<TuristPlaceInfo>list=service.getTuristPlaceInformationByLocation(loc1, loc2, loc3);
		return list;
		}
		catch(Exception e) {
			throw e;
		}
	}
	
	public String getInsertionInfo(TuristPlaceInfo tp)throws Exception {
		String msg=null;
		try {
			msg=service.getTuristPlaceInsertInfo(tp);
		}
		catch(Exception e) {
			throw e;
		}
		return msg;
	}

}
