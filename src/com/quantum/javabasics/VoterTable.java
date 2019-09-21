package com.quantum.javabasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class VoterTable {
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "root");
		Statement st=conn.createStatement();
		String table1="CREATE TABLE Voter(VName VARCHAR(20),Vage int)";
	       st.executeUpdate(table1);
	       st.executeUpdate("INSERT INTO Voter values('Dipu',23)");
	       st.executeUpdate("INSERT INTO Voter values('Somya',25)");
	       st.executeUpdate("INSERT INTO Voter values('Bapun',33)");
	       st.executeUpdate("INSERT INTO Voter values('Tapu',34)");
	   System.out.println("Table got created and value inserted");
	}
}
