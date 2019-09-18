package com.quantum.javabasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


	public class Employee1 {
		   public static void main(String[] args)
		   {
			   try
			   {
				   String myurl="jdbc:mysql://localhost:3306/test";
			       Class.forName("com.mysql.jdbc.Driver");
			       Connection conn = DriverManager.getConnection(myurl, "root", "root");
			       Statement st=conn.createStatement();
			       st.execute("INSERT INTO Employee(name,fname,salary)"+"VALUES('Dipu','Suresh',15000)");
			       st.execute("INSERT INTO Employee(name,fname,salary)"+"VALUES('Sipu','Suresh',45500)");
			       st.execute("INSERT INTO Employee(name,fname,salary)"+"VALUES('Ripu','Susant',5500)");
			       ResultSet rs=st.executeQuery("select * from Employee"); 
		           // System.out.println(rs);
			   }
			   catch(Exception e)
			   {
				   System.out.println("Exicuted");
				   System.out.println(e);
			   }
			   }
		}


