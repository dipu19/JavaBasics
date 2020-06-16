package com.quantum.javabasics;

import java.io.Console;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ExamineSystemClass {

	public static void main(String[] args) {
		
		  int[] array1 = {10,15,20,14}; int[] array2 = {1,2,4,56};
		  
		  System.arraycopy(array1, 1, array2, 1, 2);
		  
		  System.out.println(Arrays.toString(array2));
		 

		/*
		 * Console console = System.console();
		 * 
		 * if(console != null) { Calendar c= new GregorianCalendar();
		 * console.printf("Welcome %1$s%n ", "Dipu");
		 * console.printf("CurrentTime is %1$tm %1$te,%1$tY%n", c); console.flush(); }
		 * else { System.out.println("null"); }
		 */
	}
}
