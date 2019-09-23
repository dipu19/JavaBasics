package com.quantum.javabasics;
import java.sql.*;
public class Student3 {

	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		Statement st=conn.createStatement();
		st.executeUpdate("CREATE TABLE Student1(Sname VARCHAR(20),sid INT,s_roll INT)");
		st.execute("Insert Student1 values('Dipu',15,2)");
		st.execute("INSERT INTO Student1 values('Sipu',12,1)");
		st.execute("INSERT INTO Student1 values('Rama',4,3)");
		ResultSet rs=st.executeQuery("select * from Student1");
		rs.absolute(2); 
		System.out.println(rs.getString(1)+" "+rs.getString(2));
		
        System.out.println("Table created & values inserted");
        
	}

}
