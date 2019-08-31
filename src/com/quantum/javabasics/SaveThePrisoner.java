package com.quantum.javabasics;

public class SaveThePrisoner {
	public static int ma()
	{
		int start=2;
		int noOfPrisoner=5;
		int noOfCandy=1;
		int lastCandy=0;
		if(noOfCandy>noOfPrisoner)
		{
			lastCandy=start+((noOfCandy-noOfPrisoner)-1);
		}
		else if(noOfCandy==noOfPrisoner)
		{
			if(start==1)
			{
				lastCandy=noOfPrisoner;
			}
			else
			{
				lastCandy=start-1;
			}
		}
		if(noOfCandy<noOfPrisoner)
		{
			
				lastCandy=(start+noOfCandy)-1;
			
		}
		if(lastCandy>noOfPrisoner)
		{
			lastCandy=Math.abs(lastCandy-noOfCandy)-1;
		}
		return lastCandy;
	}
	public static void main(String[] args)
	{
		SaveThePrisoner s=new SaveThePrisoner();
		System.out.println(s.ma());
	}
}
