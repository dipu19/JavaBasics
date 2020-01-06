package com.quantum.javabasics;

import java.util.Date;

//Calling Finalization method explicitly
public class CallingFinalizationMethod {
	public static void main(String[] args)
	{
		CallingFinalizationMethod d=new CallingFinalizationMethod ();
		//d.finalize();
		d=null;
		
		
		
	}
	public void finalize()
	{
		System.out.println("finalize method called");
	}
}
