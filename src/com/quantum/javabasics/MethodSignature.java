package com.quantum.javabasics;



public class MethodSignature 
 {
	public void m1(String s)
 {
	System.out.println("argument type String");
 }
    public void m1(double d)
 {
	System.out.println("argument type float");
 }
    public static void main (String[] arg)
 {
	MethodSignature m =new MethodSignature();
	m.m1("Dipu");
	m.m1(1.2);
 }


}
