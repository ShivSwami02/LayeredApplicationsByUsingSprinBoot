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

import com.nt.model.Student;

@Repository("stuOraDAO")
public class StudentDao implements IStudentDao{

	@Autowired
	private DataSource ds;
	
	private static final String Stu_Insert_Query="INSERT INTO STUDENT91(SID,SNAME,SBRANCH,SUB1,SUB2,SUB3,SUB4,SUB5,PERCENTAGE) VALUES (?,?,?,?,?,?,?,?,?)";
	
	private static final String Stu_Info_Retrive="SELECT * FROM STUDENT91 WHERE SBRANCH=?";
	@Override
	public int insertStudentInfo(Student s) throws Exception {
		int count=0;
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(Stu_Insert_Query);){
			ps.setInt(1, s.getSid());
			ps.setString(2, s.getSname());
			ps.setString(3, s.getSbranch());
			ps.setDouble(4, s.getSub1());
			ps.setDouble(5, s.getSub2());
			ps.setDouble(6, s.getSub3());
			ps.setDouble(7, s.getSub4());
			ps.setDouble(8, s.getSub5());
			ps.setDouble(9, s.getPersentage());
			
			count=ps.executeUpdate();
			
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		return count;
	}

	@Override
	public List<Student> getStudentInfo(String branch) throws Exception {
		List<Student> list;
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(Stu_Info_Retrive)){
			
			ps.setString(1, branch);
			
			try(ResultSet rs=ps.executeQuery()){
				list=new ArrayList<Student>();
				while(rs.next()) {
					Student stu=new Student();
					stu.setSid(rs.getInt(1));
					stu.setSname(rs.getString(2));
					stu.setSbranch(rs.getString(3));
					stu.setSub1(rs.getDouble(4));
					stu.setSub2(rs.getDouble(5));
					stu.setSub3(rs.getDouble(6));
					stu.setSub4(rs.getDouble(7));
					stu.setSub5(rs.getDouble(8));
					stu.setPersentage(rs.getDouble(9));
					
					list.add(stu);
					
				}
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		return list;
	}

}
