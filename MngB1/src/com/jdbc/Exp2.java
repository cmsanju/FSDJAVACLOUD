package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exp2 {
	
	public static void main(String[] args) throws Exception
	{
		
		//1 load the driver class
		Class.forName("com.mysql.jdbc.Driver");//oracle.jdbc.driver.OracleDriver
				
		//2 Create the connection object   //jdbc:oracle:thin:@localhost:1521:xe,  system, java
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mngb1", "root", "password");
		
		con.setAutoCommit(false);
		
		//3 create statement object
		Statement stmt = con.createStatement();
		
		stmt.addBatch("insert into std1 values (3, 'Ram', 'hyd')");
		stmt.addBatch("insert into std1 values (4, 'Apple', 'chn')");
		stmt.addBatch("insert into std1 values (5, 'lenovo', 'pune')");
		stmt.addBatch("insert into std1 values (6, 'sony', 'india')");
		
		stmt.executeBatch();
		con.commit();
		
		ResultSet rs = stmt.executeQuery("select * from std1");
		
		while(rs.next())
		{
			System.out.println("ID : "+rs.getInt(1)+" Name : "+rs.getString(2)+" City : "+rs.getString(3));
		}
		
		con.close();
		System.out.println("Done.");
	}

}
