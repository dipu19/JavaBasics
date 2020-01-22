package com.quantum.javabasics;

public class VarArgExample {
	public int  add(int... x)
	{
		int result=0;
		for(int x1:x)
		{
			result=result+x1;
		}
		return result;
	}
	public static void main(String[] args)
	{
		VarArgExample vg=new VarArgExample();
		System.out.println(vg.add(10,20,30));
	}

}
