package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Techtitans;

public class Dao {

 Connection conn=null;
 PreparedStatement ps=null;
	ResultSet rs=null;
	public int adddetails(Techtitans f){
int k = 0;
		conn=Connect.getConnection();
		try {
			ps=conn.prepareStatement("insert into Tech values(?,?,?,?,?,?,?,?)");
			ps.setString(1, f.getEmail());
			ps.setString(2, f.getFirstname());
			ps.setString(3, f.getLastname());
			ps.setString(4, f.getQualifications());
			ps.setString(5,f.getTechnology());
			ps.setString(6,f.getContact_number());
			ps.setString(7,f.getProfile());
			ps.setString(8,f.getGender());
			 k = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{Connect.closeConnection();
		Connect.closeprepare();}
return k;

	}
	public ArrayList<Techtitans> search(String e){
		conn=Connect.getConnection();
		ArrayList<Techtitans> af=new ArrayList<Techtitans>();
		try{
			ps=conn.prepareStatement("select * from Tech where email=?");
			ps.setString(1, e);
			rs=ps.executeQuery();
	while(rs.next()){		
			Techtitans f=new Techtitans();
		f.setEmail(rs.getString(1));
		f.setFirstname(rs.getString(2));
		f.setLastname(rs.getString(3));
		f.setQualifications(rs.getString(4));
		f.setTechnology(rs.getString(5));
		f.setContact_number(rs.getString(6));
		f.setProfile(rs.getString(7));
		f.setGender(rs.getString(8));
		af.add(f);
		} }catch (SQLException se) {
			// TODO Auto-generated catch block
			se.printStackTrace();
		}finally{Connect.closeConnection();
		Connect.closeprepare();}
		return af;
		
	}
	
	
	public ArrayList<Techtitans> Delete(String n){
		conn=Connect.getConnection();
		ArrayList<Techtitans> g=new ArrayList<Techtitans>();
		System.out.println("Service");
		try{
	
			ps=conn.prepareStatement("delete from Tech where firstname=?");
			ps.setString(1,n);
			rs=ps.executeQuery();
	while(rs.next()){		
			Techtitans a=new Techtitans();
		a.setEmail(rs.getString(1));
		a.setFirstname(rs.getString(2));
		a.setLastname(rs.getString(3));
		a.setQualifications(rs.getString(4));
		a.setTechnology(rs.getString(5));
		a.setContact_number(rs.getString(6));
		a.setProfile(rs.getString(7));
		a.setGender(rs.getString(8));
		g.add(a);
System.out.println("Servic");		} 
}
		catch (SQLException se) {
			// TODO Auto-generated catch block
			se.printStackTrace();
		}finally{Connect.closeConnection();
		Connect.closeprepare();}
		return g;
}
}
	
	
	
	
	
	
	
	
	
	