package com.quantum.javabasics;
import java.sql.*;
public class Teacher_Table {
	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			Statement st=con.createStatement();
			PreparedStatement ps=con.prepareStatement("insert into teacherTable(?,?)");
			st.executeUpdate("CREATE TABLE teacherTable(Tname VARCHAR(20),Tid Int)");
			st.execute("insert into teacherTable values('Dipu',1455)");
			
			//st.execute("insert into teacherTable values('Dipu',1455)");
			System.out.println("Done");
		}
		catch(Exception e)
		{
			System.out.println("Exception ="+e );
		}
	}
}
