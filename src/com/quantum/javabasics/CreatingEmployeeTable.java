package com.quantum.javabasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreatingEmployeeTable {
	public static String creationTable="CREATE TABLE EmpTable("+"NAME VARCHAR(20))";
	
	  public static void main (String[] args)
	  {
		  try
		  {
		  Class.forName("com.mysql.jdbc.Driver");
		  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		  Statement st=conn.createStatement();
		  st.executeUpdate(creationTable);
		  System.out.println("Connected");
		  }
		  catch(Exception e)
		  {
			 e.printStackTrace();
		  }
	  }
}
