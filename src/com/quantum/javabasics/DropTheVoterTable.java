package com.quantum.javabasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DropTheVoterTable {
	public static void main(String [] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		Statement st=conn.createStatement();
		st.executeUpdate("CREATE TABLE Voter(VName VARCHAR(20),Vage int)");
		PreparedStatement ps=conn.prepareStatement("INSERT INTO voter(?,?)");
		ps.setString(2, "Jay");
		//st.execute("Insert into Voter values('Jay',48)");
		st.execute("drop table voter");
		System.out.println("Dropped");
	}
}
