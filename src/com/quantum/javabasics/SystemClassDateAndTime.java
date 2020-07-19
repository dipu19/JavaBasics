package com.quantum.javabasics;

import java.util.Date;

public class SystemClassDateAndTime {

	public static void main(String[] args)
	{
		long currentTime = System.currentTimeMillis();
		System.out.println(currentTime);
		
		Date date = new Date();
		System.out.println(date);
	}
}
