package com.quantum.javabasics;

 class OverloadingExample1 {
  public void add(int a,int b)
  {
	 
	  System.out.println("result is "+(a+b));
  }
}
 public class OverloadingExample extends OverloadingExample1
 {
	 public void add(String a,String b)
	 {
		 
		 System.out.println(a+""+b);
	 }
	 public static void main(String[] args)
	 {
		 OverloadingExample oe=new OverloadingExample();
		 oe.add("Jay","Jagannath");
		 oe.add(45, 55);
	 }
 }
