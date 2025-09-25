package com.nt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.nt.SprinBootProj11LayerApp02Application;
import com.nt.model.HospitalDetails;

@Repository("hosMySqlDAO")
@Profile({"test","dev"})
public class HospitalDetailsMySqlDAO implements IHospitalDetailsDAO {

	
	@Autowired
	DataSource source;// creating the Data source from the properties file it will crate connetion

	
	public HospitalDetailsMySqlDAO() {
		super();
		System.out.println("HospitalDetailsMySqlDAO::0-ParamConstructor");
	}

	private static final String Hos_Det_Query = "SELECT HID,HNAME,LOCATION,HMOBILE,HMAIL FROM HOSPITALDETAILS WHERE UPPER(LOCATION) IN(?,?,?) ORDER BY LOCATION";
	private static final String Hos_Insert = "INSERT INTO HOSPITALDETAILS(HNAME,HMOBILE,HMAIL,LOCATION) VALUES (?,?,?,?)";

	

	@Override
	public List<HospitalDetails> getHospitalDetailsByLocation(String loc1, String loc2, String loc3) throws Exception {
		System.out.println("HospitalDetailsDAO.getHospitalDetailsByLocation()");
		List<HospitalDetails> list = null;
         System.out.println("DataSourceClassName:"+source.getClass());
		try (Connection con = source.getConnection(); PreparedStatement ps = con.prepareStatement(Hos_Det_Query);) {
			ps.setString(1, loc1);// .toUpperCase());
			ps.setString(2, loc2);// .toUpperCase());
			ps.setString(3, loc3);// .toUpperCase());

			// here what are the data acaliable in result set that data we are featching and
			// adding each object to list
			try (ResultSet rs = ps.executeQuery();) {
				list = new ArrayList<HospitalDetails>();
				while (rs.next()) {
					HospitalDetails hs = new HospitalDetails();
					hs.setHospitalId(rs.getInt(1));
					hs.setHospitalName(rs.getString(2));
					hs.setHospitalLocation(rs.getString(3));
					hs.setHospitalNumber(rs.getString(4));
					hs.setHospitalEMail(rs.getString(5));

					list.add(hs); // here we are adding data in the list

				} // Inner try
			} // Outer Try

		} catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return list;
	}// method

	@Override
	public int InsertHospitalInformation(HospitalDetails hd) throws Exception {
		int count = 0;
		try (Connection con1 = source.getConnection(); PreparedStatement ps = con1.prepareStatement(Hos_Insert);) {
			ps.setString(1, hd.getHospitalName());
			ps.setString(2, hd.getHospitalNumber());
			ps.setString(3, hd.getHospitalEMail());
			ps.setString(4, hd.getHospitalLocation());

			try {
				count = ps.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
				throw e;
			}

		} catch (SQLException se) {
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return count;
	}

}// class
