package com.quantum.javabasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcExample {
	public static void main(String[] args)
	 {
		    try
		    {
		      // create a mysql database connection
		      String myDriver = "com.mysql.jdbc.Driver";
		      String myUrl = "jdbc:mysql://localhost:3306/test";
		      Class.forName(myDriver);
		      Connection conn = DriverManager.getConnection(myUrl, "root", "root");
		      
		      Statement st = conn.createStatement();

		      String sql="INSERT INTO users VALUES ('jay','ram',100)";
		      // note that i'm leaving "date_created" out of this insert statement
		      st.executeUpdate(sql);
		      System.out.println("executed");

		      conn.close();
		    }
		    catch (Exception e)
		   
			{
		    	System.out.println(e);
		    	/*
				 * System.err.println("Got an exception!"); System.err.println(e.getMessage());
				 */
		    }

		  }

}
