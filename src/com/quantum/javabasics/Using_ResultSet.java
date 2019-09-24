package com.quantum.javabasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Using_ResultSet {
	public static void main (String[] args)
	 {
		 try {
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		 Statement st=con.createStatement();
		 //st.executeUpdate("CREATE TABLE Table2(Name VARCHAR(20),Age INT)");
		 ResultSet rs=st.executeQuery("select * from Table2");
		ResultSetMetaData rsmd=rs.getMetaData();
		System.out.println("number of column = "+rsmd.getColumnCount());
		System.out.println("Table name = "+rsmd.getTableName(1));
		System.out.println("Unknown = "+rsmd.getCatalogName(1));
		System.out.println("Column Display Size = "+rsmd.getColumnDisplaySize(1));
		 System.out.println("Table Created");
		 }
		 catch(Exception e)
		 {
			 System.out.println("Exception Occoured ="+e);
		 }
	 }
}
