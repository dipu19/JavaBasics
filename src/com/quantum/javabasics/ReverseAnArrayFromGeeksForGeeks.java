package com.quantum.javabasics;

public class ReverseAnArrayFromGeeksForGeeks {

	public void reverseArray(int[] array)
	{
		int length = array.length;
		for(int i=0,j=length-1;i<length/2&j>=length/2;i++,j--)
		{
			int arrayElement = array[i];
			array[i] = array[j];
			array[j] = arrayElement;
		}
		for(int i=0;i<length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		int[] array = {1,2,3,4,5};
		ReverseAnArrayFromGeeksForGeeks object = new ReverseAnArrayFromGeeksForGeeks();
		object.reverseArray(array);
	}
}
