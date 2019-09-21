package com.quantum.javabasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcEmployee2 {
	public static String table="CREATE TABLE Student(Sname VARCHAR(20),SrollNo INT)";
 public static void main(String[] args)
 {
	 try
	 {
	 Class.forName("com.mysql.jdbc.Driver");
	 Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
	 Statement st=conn.createStatement();
	 //st.executeUpdate(table);
	 //st.execute("INSERT INTO Student values('Dipu',12)");
	 st.execute("INSERT INTO Student values('Sipu',13)");
	 st.execute("INSERT INTO Student values('Lipu',14)");
	 st.execute("INSERT INTO Student values('Ripu',15)");
	 st.execute("INSERT INTO Student values('Tipu',16)");
	 st.execute("INSERT INTO Student values('Bapu',17)");
	 System.out.println("Table Created");
	 //ResultSet re=st.executeQuery("Select * from Student");
	 //System.out.println(re);
	 }
	 catch(Exception e)
	 {
		 System.out.println("Exception Occoured = "+e);
	 }
 }	
 }

