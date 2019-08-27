package com.quantum.javabasics;

public class BeautifulDays {
	public static void main(String[] args)
	{   
	    int number=6;
	    int count=0;
		int[] numbers= {20,21,22,23};
		int[] numbers1=new int[numbers.length];
		int[] revNumbers=new int[numbers.length];
		int[] diff=new int[numbers.length];
		for(int i=0;i<numbers.length;i++)
		{
			numbers1[i]=numbers[i];
		}
		for(int i=0;i<numbers.length;i++)
		{
			int reverse=0;
			 while(numbers[i] != 0)
		      {
		          reverse = reverse * 10;
		          reverse = reverse + numbers[i]%10;
		          numbers[i] = numbers[i]/10;
		      }
			 revNumbers[i]=reverse;
		}
		for(int i=0;i<numbers.length;i++)
		{
			if(Math.abs(numbers1[i]-revNumbers[i])%number==0)
			{
				count++;
			}
		}System.out.println(count);
		
		
		
	}

}
