package com.quantum.javabasics;



public class RemoveElementFormArray {

	public void remove(int[]array,int element)
	{
		int length = array.length;
		for(int i=0;i<length;i++)
		{
			if(array[i] == element)
			{
				for(int k =i,j=k+1;k<array.length-1&j<array.length;k++,j++)
				{
					array[k] = array[j];
				}
				length--;
				break;
			}
		}
		
		for(int i=0;i<length;i++)
		{
			System.out.println(array[i]);
		}

		
		}
	public static void main(String[] args)
	{
		RemoveElementFormArray object = new RemoveElementFormArray();
		int[] array = {1,2,33,4,5,6};
		int element = 2;
		object.remove(array, element);
	}
}
