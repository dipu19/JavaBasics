package com.quantum.javabasics;
import java.util.*;
public class HalloweenSale {
	public static void main(String[] args)
	{
		System.out.println("Enter the value of s");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		System.out.println("Enter the value of p");
		int p=sc.nextInt();
		System.out.println("Enter the value of d");
		int d=sc.nextInt();
		System.out.println("Enter the value of m");
		int m=sc.nextInt();
	  int count = 0;
      while(s>=p){
          count++;
          s -=p;
          p = Math.max(p-d,m);
      }
      
  }
}
