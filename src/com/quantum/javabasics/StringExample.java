package com.quantum.javabasics;
import java.util.Scanner;
public class StringExample {
 public static void main(String[] args)
 {
	 System.out.println("Enter the String");
	 Scanner sc= new Scanner(System.in);
	 String st=sc.toString();
	 System.out.println("Enter the 2nd String");
	 String st1=sc.toString();
	 String st3=st.concat(st1);
	 System.out.println(st3);
	 String st2="ram";
	 System.out.println(st.concat(st2));
 }
}
