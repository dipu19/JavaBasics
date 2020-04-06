package com.quantum.javabasics;

public class BubbleSortOnString {

	public void buubbleSort(String [] str)
	{
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				int index=str[i].compareTo(str[j]);
                if(index<0)
                {
                	String str1 = str[j];
                	str[j] = str[i];
                	str[i] = str1;
                }
			}
		}
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		BubbleSortOnString obj = new BubbleSortOnString();
		String[] str= {"Dipu","Sipu","Ram","Arun"};
		obj.buubbleSort(str);
	}
			
}
