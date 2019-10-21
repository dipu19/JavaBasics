package com.quantum.javabasics;

 
 interface Interf
 {
	 int x=10;
	 public void add();
	 //public void multi();
	/*
	 * interface is 100% abstract class but abstract class is not purely 100%
	 * abstract
	 */
 }
 class Test implements Interf
 {
	 public void add()
	 {
		 System.out.println(1000);
	 }
	 public static void main(String[] args)
	 {
		 Test t=new Test();
		 t.add();
		 System.out.println(x);
	 }
 }
		 
