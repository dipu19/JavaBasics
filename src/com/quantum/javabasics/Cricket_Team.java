package com.quantum.javabasics;
import java.sql.*;
public class Cricket_Team {
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		Statement st=conn.createStatement();
		st.executeUpdate("CREATE TABLE Crick_Table (P_name VARCHAR(30),P_age int,P_id int)");
		st.executeUpdate("drop table Crick_Table");
		
		  PreparedStatement ps=conn.prepareStatement("Insert into users(?,?,?) ");
		  ps.setString(1, "Dipuu"); ps.setInt(1,15); ps.setInt(2,12);
		 
		System.out.println("Done");
}
}
