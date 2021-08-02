package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exp1 {
	
	public static void main(String[] args) throws Exception
	{
		//1 load the driver class
		Class.forName("com.mysql.jdbc.Driver");//oracle.jdbc.driver.OracleDriver
		
		//2 Create the connection object   //jdbc:oracle:thin:@localhost:1521:xe,  system, java
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mngb1", "root", "password");
		
		//3 create statement object
		Statement stmt = con.createStatement();
		
		//4 execute query
		//stmt.execute("create table std1 (id int, name varchar(50), city varchar(50))");
		//stmt.execute("insert into std1 values (3, 'Jdbc', 'Blr')");
		
		//stmt.execute("update std1 set name = 'Sharath', city = 'Chennai' where id = 1 ");
		
		stmt.execute("delete from std1 where id = 3");
		
		ResultSet rs = stmt.executeQuery("select * from std1");
		
		while(rs.next())
		{
			System.out.println("ID : "+rs.getInt(1)+" Name : "+rs.getString(2)+" City : "+rs.getString(3));
		}
		
		//5 close the connection object
		con.close();
		
		System.out.println("Done.");	
	}

}
