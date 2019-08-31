package com.quantum.javabasics;

public class SaveThePrisoner {
	public static int ma()
	{
		int s=3;
		int n=3;
		int m=8;
	
	   
	        int a = s+m-1;   
	        if(a>n){
	            if(a%n==0){
	                return n;
	            }
	            return a%n;
	        }return a;
	}   
	      
	public static void main(String[] args)
	{
		SaveThePrisoner s=new SaveThePrisoner();
		System.out.println(s.ma());
	}
}
