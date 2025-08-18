package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.TuristPlaceInfo;

@Repository("tpMySqlRepository")
public class TuristPlaceInfoMySqlDAO implements ITouristPlaceDAO{
	private final static String TP_Info_Query="SELECT TPID,TPNAME,TPLOCATION,TPCONTACT,TPSITE FROM TURISTPLACE WHERE UPPER(TPLOCATION) IN(?,?,?) ORDER BY TPLOCATION";
	private final static String Tp_Insert="INSERT INTO TURISTPLACE(TPNAME,TPLOCATION,TPCONTACT,TPSITE) VALUES(?,?,?,?)";
	
	@Autowired
	DataSource ds;

	@Override
	public List<TuristPlaceInfo> getTouristPlaceInformationByLocation(String loc1, String loc2, String loc3)
			throws Exception {
		List<TuristPlaceInfo>list=null;
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(TP_Info_Query);){
			ps.setString(1, loc1);
			ps.setString(2, loc2);
			ps.setString(3, loc3);
			
			try(ResultSet rs=ps.executeQuery();){
				list=new ArrayList<TuristPlaceInfo>();
				while(rs.next()) {
					TuristPlaceInfo tp=new TuristPlaceInfo();
					tp.setTpId(rs.getInt(1));
					tp.setTpName(rs.getString(2));
					tp.setTplocation(rs.getString(3));
					tp.setTpContact(rs.getString(4));
					tp.setTpSite(rs.getString(5));
					list.add(tp);
				}//while
			}//inner try
		}//outer try
		catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}
		catch(Exception e) {
			throw e;
		}
		return list;
	}//method

	@Override
	public int setTuristPlaceInfo(TuristPlaceInfo info) throws Exception {
		int count=0;
		try(Connection con1=ds.getConnection();
				PreparedStatement ps=con1.prepareStatement(Tp_Insert);){
			ps.setString(1, info.getTpName());
			ps.setString(2, info.getTplocation());
			ps.setString(3, info.getTpContact());
			ps.setString(4, info.getTpSite());
			
			count=ps.executeUpdate();
			
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		return count;
	}//method

}//class
