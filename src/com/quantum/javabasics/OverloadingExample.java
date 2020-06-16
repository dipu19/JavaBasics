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
	 
	 public void add(long a)
	 {
		 System.out.println(a + 10);
	 }
	 public void add (String s)
	 {
		 System.out.println(s+10);
	 }
	 
	 public static void main(String[] args)
	 {
		 OverloadingExample oe=new OverloadingExample();
		 oe.add("Jay","Jagannath");
		 oe.add(45, 55);
		 
		 int l= 15;
		 oe.add(l);
	 }
 }
