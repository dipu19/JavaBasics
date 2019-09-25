package com.quantum.javabasics;
import java.sql.*;
public class Database_Metadata {
 public static void main(String[] args)
 {
	 try
	 {
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		 DatabaseMetaData dm=con.getMetaData();
		 System.out.println("Driver name ="+dm.getDriverName());
	 }
	 catch(Exception e)
	 {
		 System.out.println("Exception arrised");
	 }
 }
}
