package com.quantum.javabasics;
import java.sql.*;
public class Student4 {
 public static void main (String[] args) throws Exception
 {
	 Class.forName("com.mysql.jdbc.Driver");
	 Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	 Statement st =conn.createStatement();
	 PreparedStatement ps=conn.prepareStatement("INSERT INTO Student1 values(?,?)");
	 ps.setString(1,"Jay");
	 System.out.println("Value Inserteed");
 }
}
