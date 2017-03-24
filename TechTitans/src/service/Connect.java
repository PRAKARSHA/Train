package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Connect {
	public static String driver="oracle.jdbc.OracleDriver";
public static String url="jdbc:oracle:thin:@inchnilpdb03.india.tcs.com:1521:javadb03";
public static String pass="E1206507";
public static String user="E1206507";
static Connection conn=null;
static PreparedStatement ps=null;
ResultSet rs=null;
public static Connection getConnection(){
	try{Class.forName(driver);
	conn=DriverManager.getConnection(url,pass,user);
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}catch(Exception e){
		e.printStackTrace();
	}return conn;
	
}
public static void closeConnection(){
	if(conn!=null){
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	}public static void closeprepare(){
		if(ps!=null){
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

