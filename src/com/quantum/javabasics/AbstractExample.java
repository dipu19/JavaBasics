package com.quantum.javabasics;

 abstract class AbstractExample2 {
  public abstract void add();
  public  void multiplication()
  {
	  
  } 
}public class AbstractExample extends AbstractExample2
 {
	public  void  add() {
		System.out.println("Dipu");
	}
	public void multiplication()
	{
		System.out.println("Sipu");
	}
	public static void main(String[] args)
	{
		AbstractExample ae=new AbstractExample();
		ae.add();
		ae.multiplication();
	}
 }

