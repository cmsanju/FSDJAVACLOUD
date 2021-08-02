package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exp3 {
	
	public static void main(String[] args) throws Exception
	{
		
		//1 load the driver class
		Class.forName("com.mysql.jdbc.Driver");//oracle.jdbc.driver.OracleDriver
						
		//2 Create the connection object   //jdbc:oracle:thin:@localhost:1521:xe,  system, java
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mngb1", "root", "password");
				
				
	    //3 create PreparedStatement object
		/*
		PreparedStatement pst = con.prepareStatement("insert into std1 values (?,?,?)");
		
		pst.setInt(1, 7);
		pst.setString(2, "Steve");
		pst.setString(3, "India");
		
		PreparedStatement pst = con.prepareStatement("update std1 set name =?, city =? where id =?");
		
		pst.setString(1, "Jobs");
		pst.setString(2, "Blr");
		pst.setInt(3, 7);
		
		pst.execute();
		*/
		
		PreparedStatement pst = con.prepareStatement("select * from std1");
		
		ResultSet rs = pst.executeQuery();
		
		while(rs.next())
		{
			System.out.println("ID : "+rs.getInt(1)+" Name : "+rs.getString(2)+" City : "+rs.getString(3));
		}
		
		System.out.println("Done.");
		
		con.close();
	}

}
